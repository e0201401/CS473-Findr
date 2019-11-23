package com.fashionFindr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class Reply {
    private final String replyID;
    private final String username;
    private final String content;

    public Reply(@JsonProperty("replyID") String postID,
                   @JsonProperty("username") String username,
                   @JsonProperty("content") String content) {
        this.username = username;
        this.replyID = postID;
        this.content = content;
    }

    public String getReplyID() {
        return replyID;
    }

    public String getContent() {
        return content;
    }

    public String getUsername(){
        return username;
    }

}
