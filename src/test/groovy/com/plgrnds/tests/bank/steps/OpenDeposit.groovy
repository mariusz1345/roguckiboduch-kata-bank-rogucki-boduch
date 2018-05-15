package com.plgrnds.tests.bank.steps

import com.plgrnds.tests.bank.Account
import com.plgrnds.tests.bank.AccountRepository
import com.plgrnds.tests.bank.Bank
import com.plgrnds.tests.bank.Customer
import com.plgrnds.tests.bank.InMemoryAccountRepository
import groovy.transform.Field

import static org.assertj.core.api.Assertions.assertThat

this.metaClass.mixin(cucumber.api.groovy.EN)

@Field AccountRepository accountRepository
@Field Customer customer
@Field Bank bank

@Field Deposit deposit

@Field firstAccount
@Field Set<Account> customerAccounts
@Field Set<Deposit> customerDeposits

Given(~/a customer has an account with balance 100^$/) { ->
    accountRepository = new InMemoryAccountRepository()
    bank = new Bank(accountRepository)
    customer = new Customer()
    firstAccount = new Account(customer, 100)
    accountRepository.addAccount(firstAccount)
}

Given(~/he opens a deposit with balance 90^$/) { ->
    deposit = new Deposit(customer, 90)
    accountRepository.addDeposit(deposit)
}

Then(~/he owns a deposit with balance 90^$/) { ->
    accountRepository.addDeposit(deposit)
}

And(~/the account has balance 10^$/) { ->
}

