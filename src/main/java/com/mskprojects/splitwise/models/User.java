package com.mskprojects.splitwise.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity (name = "Splitwise_User")
public class User extends BaseModel {
    private String name;
    private String email;
    private String mobileNo;
    private double totalOutstandingAmount;
    @ManyToMany
    private List<Expense> expensesByUser;
}
