package com.mapping.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.SocialMedia.models.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer>{

}
