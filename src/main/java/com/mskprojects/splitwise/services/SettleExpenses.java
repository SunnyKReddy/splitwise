package com.mskprojects.splitwise.services;

import com.mskprojects.splitwise.models.Group;
import com.mskprojects.splitwise.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;

@Data
@AllArgsConstructor
public class SettleExpenses {
    private Group group;
    private HashMap<User, Double> expensesSettlementMap = new HashMap<>();
    public HashMap<User, Double> calculateSettleExpenses() {
        return expensesSettlementMap;
    }
 }
