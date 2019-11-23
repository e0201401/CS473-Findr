package com.fashionFindr.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


public class Comment {
    private final String commentID;
    private final String postID;
    private final String username;
    private final String content;
    private int chosenByOP;
    private List<Reply> listOfReply;

    public Comment(@JsonProperty("commentID") String commentID,
                   @JsonProperty("postID") String postID,
                   @JsonProperty("username") String username,
                   @JsonProperty("content") String content,
                   @JsonProperty("chosenByOP") int chosenByOP,
                   @JsonProperty("listOfReply") List<Reply> listOfReply) {
        this.commentID = commentID;
        this.username = username;
        this.postID = postID;
        this.content = content;
        this.chosenByOP = chosenByOP;
        this.listOfReply = new ArrayList<Reply>();
//        empty list when comment is first created
    }

    public String getPostID() {
        return postID;
    }

    public String getContent() {
        return content;
    }

    public int getChosenByOP() {
        return chosenByOP;
    }

    public List<Reply> getListOfReply() {
        return listOfReply;
    }

    public String getCommentID() {
        return commentID;
    }

    public String getUsername(){
        return username;
    }

    }
