package com.plgrnds.tests.bank;


import java.util.Calendar;
import java.util.Date;

public class Deposit {
    private Customer owner;
    private double depositBalance;
    private Calendar openTime;
    private Calendar terminationTime;



    public Deposit(Customer owner, double depositBalance) {
        this.owner=owner;
        this.setDepositBalance(depositBalance);
        this.openTime = Calendar.getInstance();
    }
    public double getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(double depositBalance) {
        this.depositBalance = depositBalance;
    }
    public Date getTime() {
        return openTime.getTime();
    }

    public void setTerminationTimeByYears (int years) {
        openTime.add(Calendar.YEAR, years);
    }
    public Calendar getTerminationTime() {
        return terminationTime;
    }
}
