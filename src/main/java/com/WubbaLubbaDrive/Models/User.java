package com.WubbaLubbaDrive.Models;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.HashMap;

@Entity
@Table
public class User {

    @Id
    @SequenceGenerator(name = "user_sequence", sequenceName = "user_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_sequence")
    private Long id;
    private String userName;
//    @Type(type="json")
//    private HashMap<Long, UserFile> userFileMap;
//    @Type(type="json")
//    private HashMap<Long, UserNote> userNoteMap;

    public User() { }

    public User(Long id, String userName) {
        this.id = id;
        this.userName = userName;
//        this.userFileMap = new HashMap<Long, UserFile>();
//        this.userNoteMap = new HashMap<Long, UserNote>();
    }

    public User(String userName) {
        this.userName = userName;
//        this.userFileMap = new HashMap<Long, UserFile>();
//        this.userNoteMap = new HashMap<Long, UserNote>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public HashMap<Long, UserFile> getUserFileMap() {
//        return userFileMap;
//    }
//
//    public void setUserFileMap(HashMap<Long, UserFile> userFileMap) {
//        this.userFileMap = userFileMap;
//    }
//
//    public HashMap<Long, UserNote> getUserNoteMap() {
//        return userNoteMap;
//    }
//
//    public void setUserNoteMap(HashMap<Long, UserNote> userNoteMap) {
//        this.userNoteMap = userNoteMap;
//    }
}
