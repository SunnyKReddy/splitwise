package com.mskprojects.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;
@Data
@Entity(name = "Splitwise_Expense")
public class Expense extends BaseModel {
    private String expenseName;
    private double amount;
    @ManyToMany
    private List<User> paidBy;
    @ManyToMany
    private List<User> expenseSharedByUsersList;
    @Enumerated(EnumType.ORDINAL)
    private SplitType splitType;
}
