package com.lonely.cloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lonely.cloud.eneity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {

}
