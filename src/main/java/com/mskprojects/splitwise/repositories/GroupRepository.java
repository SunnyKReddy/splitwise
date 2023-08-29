package com.mskprojects.splitwise.repositories;

import com.mskprojects.splitwise.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long> {
}
