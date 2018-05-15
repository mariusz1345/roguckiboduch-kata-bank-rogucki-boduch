package com.plgrnds.tests.bank;



public class working {

    public static void main(String[] args) {
        Customer owner = new Customer();
        Account account = new Account(owner, 100);


        System.out.println(owner.getId());

        System.out.println(account.getBalance());

        Deposit deposit = new Deposit(owner, 90);
        /*w tym momencie wyciągnięcie obiektu account(z accountByCustomer z klasy InMemoryAccountRepository),
         którego właścielem jest owner i odjęcie depositBalance od balance*/

        System.out.println(account.getBalance());
        System.out.println(deposit.getDepositBalance());
        System.out.println(owner.getId());

        System.out.println();
    }

}
