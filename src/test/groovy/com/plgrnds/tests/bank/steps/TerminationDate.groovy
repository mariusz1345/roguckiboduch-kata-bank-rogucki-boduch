

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

@Field firstAccount
@Field Set<Account> customerAccounts
@Field Set<Deposit> customerDeposits

Given(~/a customer opened a deposit for a period of one year/) { ->

}

When(~/one year has passed/) { ->

}

Then(~/the money is transferred back to the account the funds were taken from/) { ->

}



