package com.mskprojects.splitwise.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
@Data
@AllArgsConstructor
public class SettleUpResponseDTO {
    List<TransactionDTO> transactionDTOList;
}
