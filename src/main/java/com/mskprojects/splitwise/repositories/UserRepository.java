package com.mskprojects.splitwise.repositories;

import com.mskprojects.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
