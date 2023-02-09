package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.example.facebookapi.Entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<Comment, Long> {
	List<Comment> findAllByPostID(Long postID);
}
