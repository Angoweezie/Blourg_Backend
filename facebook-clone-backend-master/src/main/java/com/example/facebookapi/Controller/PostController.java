package com.example.facebookapi.Controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Service.PostService;
@CrossOrigin
@RestController
@RequestMapping("/api/postService")
public class PostController {

	@Autowired
	PostService postService;

	@PostMapping("/save")
	public List<Post> submitPost(@RequestBody Post body){
		return postService.submitPostToDB(body);
	}

	@GetMapping("/getPost")
	public List<Post> retrieveAllPost(){
		List<Post> result=postService.retrivePostFromDB();
		result.sort((e1, e2) -> e2.getDateTime().compareTo(e1.getDateTime()));
		return result;
	}

	@DeleteMapping("/delete/{postId}")
	public List<Post> deleteParticularPost(@PathVariable("postId") Long postID){
		return postService.deletePostFromDB(postID);
	}


}
