package com.example.getarray.resource;

import com.example.getarray.model.Account;
import com.example.getarray.model.Employee;
import com.example.getarray.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.getarray.resource.EmployeeResource.getLocation;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/account")
public class AccountResource {
    private final AccountService accountService;

    @PostMapping
    public ResponseEntity<Account> createAccount (@RequestBody Account account) {
        Account newAccount = accountService.createAccount(account);
        return  ResponseEntity.created(getLocation(newAccount.getId().intValue())).body(account);
    }

    @GetMapping
    public ResponseEntity<List<Account>> getAccount(){
        return ResponseEntity.ok(accountService.getAccounts());
    }
}
