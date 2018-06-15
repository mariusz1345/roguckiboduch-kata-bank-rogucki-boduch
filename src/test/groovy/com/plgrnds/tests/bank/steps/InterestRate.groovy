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


@Field Deposit deposit

@Field Calendar now


@Field Set<Account> customerAccounts
@Field Set<Deposit> customerDeposits
@Field interestRate
@Field insurance

Given(~/there is a customer who is about to open a new deposit of any kind^$/) { ->
	customer = new Customer()
	deposit = new Deposit(customer, 100)
}

And(~/he decided to add the insurance to the deposit^$/) { ->
	insurance = new Insurance()

}


When(~/a termination date has passed/) { ->

}

Then(~/105^$ is transferred back to his account/) { ->

}

