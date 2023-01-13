package com.socialMedia.socialMedia.Services;

import com.socialMedia.socialMedia.entity.Comments;

import java.util.List;

public interface CommentsService {
    Comments addComment(Comments comment);

    List<Comments> viewComments(Long identity);

    Comments deleteComment(Long identity);

    Comments editComment(Comments comment);
}
