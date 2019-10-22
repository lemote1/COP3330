package com.company;


public class SavingsAccount {
    public static double annualInterestRate;
    private static double savingsBalance;

    public SavingsAccount(double amt){
        this.savingsBalance = amt;
    }

    public static void calculateMonthlyInterest ()
    {
        double monthlyinterest;
        monthlyinterest = (savingsBalance * annualInterestRate / 12);
        savingsBalance += monthlyinterest;
    }

    public void showBalance()
    {
        System.out.printf("$%.2f", this.savingsBalance);
    }

    public static void modifyInterestRate (double updatedInterestRate)
    {
        annualInterestRate = updatedInterestRate;
    }

    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(4.0);

        System.out.println("4.0% Interest Rate");

        for(int i = 1; i <= 12; i++)
        {
            System.out.print("Month " + i + ":\t");
            saver1.calculateMonthlyInterest();
            saver1.showBalance();
            System.out.println("");
            saver2.calculateMonthlyInterest();
            saver2.showBalance();
            System.out.println("");
        }

        System.out.println("5.0% Interest Rate");
        SavingsAccount.modifyInterestRate(5.0);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.println("Month 13" + ": \t");
        saver1.showBalance();
        System.out.println("");
        saver2.showBalance();
    }


}

