package com.example.chat.model;

     import javax.persistence.*;
     import java.time.LocalDateTime;

     @Entity
     public class Message {
         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Long id;
         private String content;
         private LocalDateTime timestamp;

         @ManyToOne
         private User user;

         @ManyToOne
         private Room room;

         // Getters and setters
         public Long getId() { return id; }
         public void setId(Long id) { this.id = id; }
         public String getContent() { return content; }
         public void setContent(String content) { this.content = content; }
         public LocalDateTime getTimestamp() { return timestamp; }
         public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
         public User getUser() { return user; }
         public void setUser(User user) { this.user = user; }
         public Room getRoom() { return room; }
         public void setRoom(Room room) { this.room = room; }
     }