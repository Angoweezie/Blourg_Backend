package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.facebookapi.Entity.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

	void deleteByPostID(Long postID);

}
