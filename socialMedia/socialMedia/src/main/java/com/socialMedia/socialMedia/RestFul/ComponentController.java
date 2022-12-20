package com.socialMedia.socialMedia.RestFul;

import com.socialMedia.socialMedia.Services.CommentsService;
import com.socialMedia.socialMedia.entity.Comments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ComponentController {

    @Autowired
    private CommentsService commentsService;

    /*To add a comment to a particular notification id.
    * The Notification identity will have to be given inside the JSON file as input*/
    @PostMapping("api/v1/comments")
    public Comments addComment(@RequestBody Comments comment){
        return commentsService.addComment(comment);
    }

    /*To view all comments in a notification*/
    @GetMapping("api/v1/comments/{id}")
    public List<Comments> viewComments(@PathVariable("id") Long identity){
        return commentsService.viewComments(identity);
    }

    /*To edit a comment*/
    @PutMapping("api/v1/comments/{id}")
    public Comments editComment(){
        /*must learn how to update values in JPA*/
        return null;
    }

    /*Delete a comment by a comment id*/
    @DeleteMapping("api/v1/comments/{id}")
    public Comments deleteComment(@PathVariable("id") Long identity){
        commentsService.deleteComment(identity);
        return null;
    }

}
