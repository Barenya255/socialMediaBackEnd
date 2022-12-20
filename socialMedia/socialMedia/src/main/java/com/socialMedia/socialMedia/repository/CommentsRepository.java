package com.socialMedia.socialMedia.repository;

import com.socialMedia.socialMedia.entity.Comments;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepository extends JpaRepository<Comments, Long> {
}
