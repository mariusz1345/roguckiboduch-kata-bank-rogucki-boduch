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

@Field firstAccount
@Field Set<Account> customerAccounts
@Field Set<Deposit> customerDeposits
@Field interestRate

Given(~/a customer has a new deposit for a period of 6 months with funds 100^$/) { ->
	customer = new Customer()
	deposit = new Deposit(customer, 100)
}

And(~/the deposit yearly interest rate is 10%/) { ->
	deposit.interestRate = 10
}


When(~/a termination date has passed/) { ->
	now==deposit.getTermiantionTime
}

Then(~/105^$ is transferred back to his account/) { ->
	firstAccount.balance + 105.00
}

