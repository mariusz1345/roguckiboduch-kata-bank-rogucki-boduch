package com.plgrnds.tests.bank;


import java.util.Calendar;
import java.util.Date;

public class Deposit {
    private Customer owner;
    private Account connectedAccount;
    private double depositBalance;
    private Calendar openTime;
    private Calendar terminationTime;
    public Calendar now = Calendar.getInstance();
    private double interestRate;
    private int howManyMonthsWillDepositLast;
    private boolean open;




    public Deposit(Account account, Customer owner, double depositBalance) {
        this.owner=owner;
        this.connectedAccount = account;
        this.setDepositBalance(depositBalance);
        this.openTime = Calendar.getInstance();
        private boolean open;
    }
    


    public double getDepositBalance() {
        return depositBalance + (depositBalance*interestRate/100)*howManyMonthsWillDepositLast/12;
    }

    public void setDepositBalance(double depositBalance) {
        this.depositBalance = depositBalance;
    }
    public Date getTime() {
        return openTime.getTime();
    }

    public void setTerminationTimeByMonths (int months) {
        openTime.add(Calendar.MONTH, months);
        howManyMonthsWillDepositLast = months;
    }
    public Calendar getTerminationTime() {
        return terminationTime;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public Customer getOwner() {
        return this.connectedAccount.getOwner();
    }


    public int getHowManyMonthsWillDepositLast() {
        return howManyMonthsWillDepositLast;
    }

}
