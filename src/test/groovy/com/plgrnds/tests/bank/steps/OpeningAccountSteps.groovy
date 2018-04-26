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

@Field firstAccount
@Field Set<Account> customerAccounts
@Field balance

Given(~/^there is a bank$/) { ->
    accountRepository = new InMemoryAccountRepository()
    bank = new Bank(accountRepository)
}

Given (~/^a customer wants to open an account and this account is created and balance is 0$/) {->
    customer = new Customer()
    firstAccount = new Account(customer, 0)
    accountRepository.addAccount(firstAccount)
}

Then (~/^there is account on his list$/) {->
    customerAccounts = bank.getCustomerAccounts(customer)
}

