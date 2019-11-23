package com.fashionFindr.model;

import com.fashionFindr.service.UserService;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.annotation.Generated;


@Document(collection = "posts")
public class Post {
//    @Id
    private int post_ID;
//    private User user;
    private final String title;
    private final String imageSrc;
    private final String description;
    private final int correctly_answered;
    private final String username;

    public Post(
//            @JsonProperty("post_ID") int post_ID,
                @JsonProperty("username") String username,
                @JsonProperty("title")String title,
                @JsonProperty("imageSrc") String imageSrc,
                @JsonProperty("description") String description,
                @JsonProperty("correctly_answered") int correctly_answered) {
        this.post_ID = 0;
//        this.user = userService.getUserFromUsername(username);
        this.title = title;
        this.imageSrc = imageSrc;
        this.description = description;
        this.correctly_answered = correctly_answered;
        this.username = username;
//        System.out.println("second post constructor");
    }

//    public User getUser() {
//        return user;
//    }

    public String getImageSrc() {
        return imageSrc;
    }

    public String getDescription() {
        return description;
    }

    public int getCorrectly_answered() {
        return correctly_answered;
    }

    public int getPost_ID() {
        return post_ID;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }
    public void setPost_ID(int new_post_ID){
        post_ID = new_post_ID;
    }
}
