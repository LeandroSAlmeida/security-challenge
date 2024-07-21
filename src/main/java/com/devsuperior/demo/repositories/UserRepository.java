package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
