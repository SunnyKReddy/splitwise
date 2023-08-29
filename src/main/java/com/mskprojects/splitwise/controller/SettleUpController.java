package com.mskprojects.splitwise.controller;

import com.mskprojects.splitwise.dto.SettleUpResponseDTO;
import com.mskprojects.splitwise.dto.TransactionDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SettleUpController {
    @GetMapping("/settleup")
    public ResponseEntity settleupBills() {
        TransactionDTO transactionDTO1 = new TransactionDTO("Sunny", "Kousik", 1000);
        TransactionDTO transactionDTO2 = new TransactionDTO("Gayathri", "Pavan",550);
        List<TransactionDTO> transactions = List.of(transactionDTO1, transactionDTO2);
        SettleUpResponseDTO settleUpResponseDTO = new SettleUpResponseDTO(transactions);
        return ResponseEntity.ok(settleUpResponseDTO);
    }
}
