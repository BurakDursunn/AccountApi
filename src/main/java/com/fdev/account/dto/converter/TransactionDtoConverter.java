package com.fdev.account.dto.converter;

import com.fdev.account.dto.TransactionDto;
import com.fdev.account.model.Transaction;
import org.springframework.stereotype.Component;

@Component
public class TransactionDtoConverter {
    public TransactionDto convert(Transaction from){
        return new TransactionDto(from.getId(),from.getTransactionType(),
                from.getAmount(),from.getTransactionDate());
    }
}
