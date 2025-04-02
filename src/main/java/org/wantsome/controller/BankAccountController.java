package org.wantsome.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.wantsome.dao.BankAccount;
import org.wantsome.dao.BankAccountForm;
import org.wantsome.service.BankService;

@Controller
public class BankAccountController {

   private final BankService bankService;

    public BankAccountController(BankService bankService) {
        this.bankService = bankService;
    }


    @GetMapping("/bank-list")
    public String bankPage(Model model){
        model.addAttribute("bankAccountForm" , new BankAccountForm());
        return "bankAccountForm";
    }

    @PostMapping("/submitAccount")
    public String submitAccount(@ModelAttribute BankAccountForm bankAccountForm , Model model){
        BankAccount newAccount = new BankAccount(
                bankAccountForm.getAccountNumber(),
                bankAccountForm.getAccountHolder(),
                bankAccountForm.getBalance()
        );


        bankService.addAccount(newAccount);
        model.addAttribute("accounts" , bankService.getAccounts());
        return "result";
    }
}
