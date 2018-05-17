

/*
Scenario: Termination date
Given a customer opened a deposit for a period of one year
When one year has passed
Then the money is transferred back to the account the funds were taken from
*/

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
@Field Calendar now

@Field Account firstAccount
@Field Set<Account> customerAccounts
@Field Set<Deposit> customerDeposits

Given(~/a customer opened a deposit for a period of one year/) { ->
    accountRepository = new InMemoryAccountRepository()
    bank = new Bank(accountRepository)
    customer = new Customer()
    firstAccount = new Account(customer, 0)
    accountRepository.addAccount(firstAccount)
    deposit = new Deposit(customer, 0)
    deposit.setTerminationDateByYears(1)
}

When(~/one year has passed/) { ->
    now==deposit.getTerminationTime
}

Then(~/the money is transferred back to the account the funds were taken from/) { ->
    firstAccount.balance = firstAccount.balance + deposit.depositBalance
    deposit.depositBalance = 0
}



