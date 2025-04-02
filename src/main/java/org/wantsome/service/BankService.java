package org.wantsome.service;

import org.springframework.stereotype.Service;
import org.wantsome.dao.BankAccount;

import java.util.ArrayList;
import java.util.List;

@Service
public class BankService {


    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public List<BankAccount> getAccounts(){
        return accounts;
    }
}
