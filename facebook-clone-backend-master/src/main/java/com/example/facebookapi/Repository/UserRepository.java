package com.example.facebookapi.Repository;

import java.util.ArrayList;

import com.example.facebookapi.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {

	User findAllByUserID(String userID);

}
