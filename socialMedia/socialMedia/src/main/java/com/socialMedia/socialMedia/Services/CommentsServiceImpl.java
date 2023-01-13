package com.socialMedia.socialMedia.Services;

import com.socialMedia.socialMedia.entity.Comments;
import com.socialMedia.socialMedia.repository.CommentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentsServiceImpl implements CommentsService{

    @Autowired
    private CommentsRepository commentsRepository;
    @Override
    public Comments addComment(Comments comment) {
        return commentsRepository.save(comment);
    }

    @Override
    public List<Comments> viewComments(Long identity) {
        /*Learn how to search by some other criteria/other than Id*/
        return null;
    }

    @Override
    public Comments deleteComment(Long identity) {
        commentsRepository.deleteById(identity);
        System.out.println("The comment has been successfully deleted");
        return null;
    }

    @Override
    public Comments editComment(Comments newComment) {
        Comments comment = commentsRepository.findById(newComment.getCommentId()).get();
        comment.setCommentBody(newComment.getCommentBody());
        return commentsRepository.save(comment);
    }
}
