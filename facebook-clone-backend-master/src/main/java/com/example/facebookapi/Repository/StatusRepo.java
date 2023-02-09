package com.example.facebookapi.Repository;

import java.util.ArrayList;
import java.util.UUID;

import com.example.facebookapi.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusRepo extends JpaRepository<Status, Long> {

}
