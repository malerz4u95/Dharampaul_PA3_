public class SavingsAccount {
    public static double annualInterestRate = 0.0;
    private double savingsBalance;
    public SavingsAccount(double amount){
        this.savingsBalance = amount;
    }
    public void calculateMonthlyInterest(){
        double interest;
        interest = (this.savingsBalance * (annualInterestRate*0.01))/12;
        this.savingsBalance += interest;
    }
    public void showBalance(){
        System.out.printf("$%.2f", this.savingsBalance);
    }
    public static void modifyInterestRate(double newRate){
        annualInterestRate = newRate;
    }



    public static void main(String[] args){
        int i;
        SavingsAccount saver1 = new SavingsAccount(2000.0);
        SavingsAccount saver2 = new SavingsAccount(3000.0);
        SavingsAccount.modifyInterestRate(4.0);
        System.out.println("Month \tSaver1 \t\t Saver2");

        for(i=1; i<13; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.print(+ i + ":  \t");
            saver1.showBalance();
            System.out.print("\t");
            saver2.showBalance();
            System.out.println();
        }

        System.out.println("Interest rate changes to 5 %");
        SavingsAccount.modifyInterestRate(5.0);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.print("Month 13: \t");
        saver1.showBalance();
        System.out.print("\t");
        saver2.showBalance();
    }
}

