package com.mskprojects.splitwise.repositories;

import com.mskprojects.splitwise.models.Expense;
import com.mskprojects.splitwise.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Group> {
}
