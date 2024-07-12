package com.mapping.SocialMedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.SocialMedia.models.SocialGroup;

@Repository
public interface GroupRepository extends JpaRepository<SocialGroup, Integer>{

}
