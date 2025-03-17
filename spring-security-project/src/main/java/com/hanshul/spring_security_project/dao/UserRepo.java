package com.hanshul.spring_security_project.dao;

import com.hanshul.spring_security_project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
