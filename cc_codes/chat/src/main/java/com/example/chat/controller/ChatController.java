package com.example.chat.controller;

     import com.example.chat.model.Message;
     import com.example.chat.model.Room;
     import com.example.chat.model.User;
     import com.example.chat.service.ChatService;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.messaging.handler.annotation.DestinationVariable;
     import org.springframework.messaging.handler.annotation.MessageMapping;
     import org.springframework.messaging.handler.annotation.Payload;
     import org.springframework.messaging.handler.annotation.SendTo;
     import org.springframework.stereotype.Controller;

     import java.util.List;

     @Controller
     public class ChatController {

         @Autowired
         private ChatService chatService;

         @MessageMapping("/chat/{roomName}/join")
         @SendTo("/topic/{roomName}")
         public List<Message> joinRoom(@DestinationVariable String roomName, @Payload String username) {
             User user = chatService.getOrCreateUser(username);
             Room room = chatService.getOrCreateRoom(roomName);
             return chatService.getMessagesForRoom(room);
         }

         @MessageMapping("/chat/{roomName}/send")
         @SendTo("/topic/{roomName}")
         public Message sendMessage(@DestinationVariable String roomName, @Payload ChatMessage chatMessage) {
             User user = chatService.getOrCreateUser(chatMessage.getUsername());
             Room room = chatService.getOrCreateRoom(roomName);
             return chatService.saveMessage(chatMessage.getContent(), user, room);
         }

         public static class ChatMessage {
             private String username;
             private String content;

             public String getUsername() { return username; }
             public void setUsername(String username) { this.username = username; }
             public String getContent() { return content; }
             public void setContent(String content) { this.content = content; }
         }
     }