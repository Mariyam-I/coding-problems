package com.example.chat.repository;

     import com.example.chat.model.Room;
     import org.springframework.data.jpa.repository.JpaRepository;

     public interface RoomRepository extends JpaRepository<Room, Long> {
         Room findByName(String name);
     }