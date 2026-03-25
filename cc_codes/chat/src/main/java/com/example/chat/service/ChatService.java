package com.example.chat.service;

     import com.example.chat.model.Message;
     import com.example.chat.model.Room;
     import com.example.chat.model.User;
     import com.example.chat.repository.MessageRepository;
     import com.example.chat.repository.RoomRepository;
     import com.example.chat.repository.UserRepository;
     import org.springframework.beans.factory.annotation.Autowired;
     import org.springframework.stereotype.Service;

     import java.time.LocalDateTime;
     import java.util.List;

     @Service
     public class ChatService {

         @Autowired
         private UserRepository userRepository;

         @Autowired
         private RoomRepository roomRepository;

         @Autowired
         private MessageRepository messageRepository;

         public User getOrCreateUser(String username) {
             User user = userRepository.findByUsername(username);
             if (user == null) {
                 user = new User();
                 user.setUsername(username);
                 userRepository.save(user);
             }
             return user;
         }

         public Room getOrCreateRoom(String roomName) {
             Room room = roomRepository.findByName(roomName);
             if (room == null) {
                 room = new Room();
                 room.setName(roomName);
                 roomRepository.save(room);
             }
             return room;
         }

         public Message saveMessage(String content, User user, Room room) {
             Message message = new Message();
             message.setContent(content);
             message.setUser(user);
             message.setRoom(room);
             message.setTimestamp(LocalDateTime.now());
             return messageRepository.save(message);
         }

         public List<Message> getMessagesForRoom(Room room) {
             return messageRepository.findByRoomOrderByTimestampAsc(room);
         }
     }