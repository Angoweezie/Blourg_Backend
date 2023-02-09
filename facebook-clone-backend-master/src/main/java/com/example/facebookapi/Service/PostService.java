package com.example.facebookapi.Service;


import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Repository.PostRepository;

@Service
public class PostService {

	@Autowired
	PostRepository postRepo;

	public List<Post> submitPostToDB(Post postData){

		Date date=new Date();
		long time=date.getTime();
		Timestamp dateTime=new Timestamp(time);
		postData.setLikes(0);
		postData.setDateTime(dateTime);

		postRepo.save(postData);
		return retrivePostFromDB();
	}


	public List<Post> retrivePostFromDB(){
		return postRepo.findAll();
	}

	public List<Post> deletePostFromDB(Long postID){
		postRepo.deleteById(postID);

		return retrivePostFromDB();
	}


}
