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

Given(~/there is a customer with a deposit opened^$/) { ->
	customer = new Customer()
	deposit = new Deposit(customer, 0)
}

And(~//) { ->

}


When(~/a termination date has passed/) { ->

}

Then(~/105^$ is transferred back to his account/) { ->

}



