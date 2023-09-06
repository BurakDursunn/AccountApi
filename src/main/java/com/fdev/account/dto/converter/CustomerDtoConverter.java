package com.fdev.account.dto.converter;

import com.fdev.account.dto.AccountCustomerDto;
import com.fdev.account.dto.CustomerAccountDto;
import com.fdev.account.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDtoConverter {

    public AccountCustomerDto convertToAccountCustomer(Customer from){

        if(from==null){
            return new AccountCustomerDto("","","");
        }
        return new AccountCustomerDto(from.getId(), from.getName(),from.getSurname());
    }
}
