package org.wantsome.web_controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {

    private List<BankAccount> bankAccounts = new ArrayList<>();

    @GetMapping("/bank-accounts")
    public String showForm(Model model){
        model.addAttribute("bankAccountForm", new BankAccountForm());
        model.addAttribute("accounts", bankAccounts);
        return "bankAccountForm";
    }

    @PostMapping("/bank-accounts-list")
    public String submitForm(@ModelAttribute BankAccountForm form){
        BankAccount account = new BankAccount(
                form.getAccountNumber(), form.getAccountHolder(), form.getBalance() );
        bankAccounts.add(account);

        return "bankAccountsList";
    }
}
