package com.plgrnds.tests.bank;


import java.util.Calendar;
import java.util.Date;

public class Deposit {
    private Customer owner;
    private double depositBalance;
    private Calendar openTime;
    private Calendar terminationTime;
    public Calendar now = Calendar.getInstance();
    private double interestRate;
    private int howManyMonthsWillDepositLast;




    public Deposit(Customer owner, double depositBalance) {
        this.owner=owner;
        this.setDepositBalance(depositBalance);
        this.openTime = Calendar.getInstance();
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


    public int getHowManyMonthsWillDepositLast() {
        return howManyMonthsWillDepositLast;
    }


    public void setHowManyMonthsWillDepositLast(int howManyMonthsWillDepositLast) {
        this.howManyMonthsWillDepositLast = howManyMonthsWillDepositLast;
    }
}