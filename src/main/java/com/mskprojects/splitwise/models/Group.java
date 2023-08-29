package com.mskprojects.splitwise.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "Splitwise_Group")
public class Group extends BaseModel {
    private String description;
    @ManyToMany
    private List<User> groupUsers;
    @OneToMany
    private List<Expense> expensesList;
    @Enumerated(EnumType.ORDINAL)
    private CurrencyType currencyType;
}
