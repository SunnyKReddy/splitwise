package com.mskprojects.splitwise.services;

import com.mskprojects.splitwise.models.Group;
import com.mskprojects.splitwise.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Data
@Getter
@Setter
@Service
public class SettleExpenses {
    private Group group;
    private HashMap<User, Double> expensesSettlementMap = new HashMap<>();
    public HashMap<User, Double> calculateSettleExpenses() {
        return expensesSettlementMap;
    }
 }
