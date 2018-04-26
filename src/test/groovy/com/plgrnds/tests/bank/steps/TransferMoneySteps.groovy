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
@Field AccountB
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

And (~/^balance on account B is 1000&=$/) {->
    customer = new Customer()
    AccountA = new Account(customer, 1000)
    accountRepository.addAccount(AccountB)
}

When (~/^99.91 is transfered from account A to B$/) {->
    AccountA.balance - 99.91
    AccountB.balance + 99.91
}

Then (~/^balance on account A is 0.09$/) {->
    AccountA.balance = 0.09
}

And (~/^balance on account B is 1099.91$/) {->
    AccountB.balance=1099.91
}
