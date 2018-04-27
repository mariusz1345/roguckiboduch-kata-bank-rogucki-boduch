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

@Field AccountA
@Field Set<Account> customerAccounts
@Field balance

Given(~/^there is a bank$/) { ->
    accountRepository = new InMemoryAccountRepository()
    bank = new Bank(accountRepository)
}

Given (~/^balance on account A is 100$/) { ->
    customer = new Customer()
    AccountA = new Account(customer, 100)
    accountRepository.addAccount(AccountA)
}

When (~/^customer deposits 10 to his account$/) {->
    AccountA.balance + 10.0
}

Then (~/^balance on account A is 110.0$/) {->
    AccountA.balance = 110.0
}