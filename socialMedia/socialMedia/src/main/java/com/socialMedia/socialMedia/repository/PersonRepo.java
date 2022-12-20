package com.socialMedia.socialMedia.repository;

import com.socialMedia.socialMedia.entity.User_data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepo extends JpaRepository<User_data, Long> {
    
}
