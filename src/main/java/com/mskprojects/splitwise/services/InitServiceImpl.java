package com.mskprojects.splitwise.services;

import com.mskprojects.splitwise.models.*;
import com.mskprojects.splitwise.repositories.ExpenseRepository;
import com.mskprojects.splitwise.repositories.GroupRepository;
import com.mskprojects.splitwise.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InitServiceImpl implements InitService {
    //Repositories
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GroupRepository groupRepository;
    @Autowired
    private ExpenseRepository expenseRepository;

//    public InitServiceImpl() {
//        initializeSplitwise();
//    }

    public void initializeSplitwise() {
        //Initializing user1
        User user1 = new User();
        user1.setName("Adam");
        user1.setEmail("adam@gmail.com");
        user1.setMobileNo("77889900");
        //Initializing user2
        User user2 = new User();
        user2.setName("Bob");
        user2.setEmail("bob@gmail.com");
        user2.setMobileNo("77665544");
        //Initializing user3
        User user3 = new User();
        user3.setName("Charles");
        user3.setEmail("charles@gmail.com");
        user3.setMobileNo("33889900");
        //Initializing user4
        User user4 = new User();
        user4.setName("David");
        user4.setEmail("david@gmail.com");
        user4.setMobileNo("1122889900");

        //Adding users to userRepository
        user1 = userRepository.save(user1);
        user2 = userRepository.save(user2);
        user3 = userRepository.save(user3);
        user4 = userRepository.save(user4);

        //Initializing Group
        Group group1 = new Group();
        group1.setDescription("Tomb Riders");
        group1.setCurrencyType(CurrencyType.INR);
        group1.setGroupUsers(List.of(user1, user2, user3, user4));

        //Adding group to groupRepository
        group1 = groupRepository.save(group1);

        //Initialize and Add Expenses
        //Expense1
        Expense expense1 = new Expense();
        expense1.setExpenseName("Restaurant - Sea View");
        expense1.setAmount(1000);
        expense1.setPaidBy(List.of(user1));
        expense1.setSplitType(SplitType.EQUAL);
        expense1.setExpenseSharedByUsersList(List.of(user1, user2, user3, user4));
        //Expense2
        Expense expense2 = new Expense();
        expense2.setExpenseName("Fuel Station - Down Town");
        expense2.setAmount(2500);
        expense2.setPaidBy(List.of(user2, user3));
        expense2.setSplitType(SplitType.EQUAL);
        expense2.setExpenseSharedByUsersList(List.of(user1, user2, user3, user4));
        //Expense3
        Expense expense3 = new Expense();
        expense3.setExpenseName("Misc - On the way");
        expense3.setAmount(800);
        expense3.setPaidBy(List.of(user4));
        expense3.setSplitType(SplitType.EQUAL);
        expense3.setExpenseSharedByUsersList(List.of(user1, user2, user3));
        //Expense4
        Expense expense4 = new Expense();
        expense4.setExpenseName("Nightout Stay - Valley Beach");
        expense4.setAmount(3000);
        expense4.setPaidBy(List.of(user1, user4));
        expense4.setSplitType(SplitType.EQUAL);
        expense4.setExpenseSharedByUsersList(List.of(user2, user3, user4));

        //Adding Expenses to expenseRepository
        expense1 = expenseRepository.save(expense1);
        expense2 = expenseRepository.save(expense2);
        expense3 = expenseRepository.save(expense3);
        expense4 = expenseRepository.save(expense4);
    }
}
