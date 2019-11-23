package com.fashionFindr.service;

import com.fashionFindr.dao.CommentDao;
import com.fashionFindr.dao.PostDao;
import com.fashionFindr.model.Comment;
import com.fashionFindr.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostDao postDao;
    private final CommentDao commentDao;


    @Autowired
//    change the qualifieer to correct name when database is connected
    public PostService(PostDao postDao, CommentDao commentDao) {
        this.postDao = postDao;
        this.commentDao = commentDao;
    }

//    public int createPost(Post post){
//        return postDao.createPost(post.getPost_ID(), post.getUser(),post.getTitle(), post.getImageSrc(), post.getDescription(), post.getCorrectly_answered());
//
//    }
    public Post createPost(Post post){
        int current_number_of_posts = postDao.findAll().size();
        post.setPost_ID(current_number_of_posts+1);
//        return postDao.createPost(post.getPost_ID(), post.getUsername(),post.getTitle(), post.getImageSrc(), post.getDescription(), post.getCorrectly_answered());
        return postDao.save(post);
    }

//    public List<Post> getUnansweredPosts(){
//        return postDao.getUnansweredPosts();
//    }
//
//    public List<Post> getTrendingPosts(){
//        return postDao.getTrendingPosts();
//    }
//
//    public Post getPostInfo(String postID){
//        return postDao.getPostInfo(postID);
//    }
//
//    public List<Comment> getComments(String postID){
//        return commentDao.getComments(postID);
//    }

//    public List<Post> selectAll_AnsweredPost(){
//        return postDao.selectAll_AnsweredPost();
//
//    }
//    public List<Post> selectAll_UnansweredPost() {
//        return postDao.selectAll_UnansweredPost();
//
//    }
//
//    public List<Post> selectAllPost() {
//        return postDao.selectAllPost();
//    }
//
//    public int updateAnswer_Status(String post_ID, int answer_status) {
//        return postDao.updateAnswer_Status(post_ID, answer_status);
//    }

}
