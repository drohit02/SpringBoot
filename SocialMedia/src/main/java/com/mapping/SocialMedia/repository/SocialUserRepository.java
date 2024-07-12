package com.mapping.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.SocialMedia.models.User;

@Repository
public interface SocialUserRepository extends JpaRepository<User, Integer>{

}
