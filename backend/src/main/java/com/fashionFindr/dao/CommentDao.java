package com.fashionFindr.dao;

import com.fashionFindr.model.Comment;

import java.util.List;

public interface CommentDao {
    List<Comment> getComments(String postID);
}
