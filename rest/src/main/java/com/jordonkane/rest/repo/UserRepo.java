package com.jordonkane.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordonkane.rest.model.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
