package com.example.getarray.service;

import com.example.getarray.model.Account;

import java.util.List;

public interface AccountService {

    Account createAccount (Account account);

    Account findByUsername (String username);

    List<Account> getAccounts();
}
