package com.mapping.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.SocialMedia.models.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Integer>{

}
