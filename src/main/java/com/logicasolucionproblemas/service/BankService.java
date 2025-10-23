package com.logicasolucionproblemas.service;

import java.util.List;

import com.logicasolucionproblemas.model.Account;
import com.logicasolucionproblemas.model.Customer;
import com.logicasolucionproblemas.model.Transaction;

public interface BankService {

    // Gestión de clientes
    Customer createCustomer(String id, String name, String email);
    Customer findCustomerById(String customerId);
    List<Customer> getAllCustomers();

    // Gestión de cuentas
    Account createSavingsAccount(String accountId, Customer customer, double interestRate);
    Account createCheckingAccount(String accountId, Customer customer, double overdraftLimit);
    Account findAccountById(String accountId);
    List<Account> getAllAccounts();

    // Operaciones bancarias
    boolean deposit(String accountId, double amount);
    boolean withdraw(String accountId, double amount);
    boolean transfer(String fromAccountId, String toAccountId, double amount);

    // Intereses
    void applyInterest(String accountId);

    // Consultas
    List<Transaction> getAccountTransactions(String accountId);

}
