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

@Field Set<Account> customerAccounts
@Field newFunds
@Field interestRateForNewFunds
@Field interestForNewFunds
@Field howManyMonthsWillDepositLast

Given(~/^there is a customer with a deposit opened$/) { ->
    customer = new Customer()
    accountRepository.addAccount(firstAccount)
    deposit = new Deposit(customer, 100)

}

Given(~/^he transfers new funds to the existing deposit$/) { ->
    deposit.depositBalance = deposit.depositBalance + newFunds
}

When(~/^the interest rate for these funds is 0.5% greater than the original interest rate$/) { ->
    interestRateForNewFunds = deposit.interestRate + 0.5
}

Then(~/^the interest for this funds is proportional to the deposit time left$/) { ->
    interestForNewFunds = (interestRateForNewFunds * newFunds) * howManyMonthsWillDepositLast
}