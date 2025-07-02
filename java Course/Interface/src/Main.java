import java.util.Scanner;

interface Payment{
    void pay(double amount);
    void otp(int number);
}
class creditCard implements Payment{

    @Override
    public void otp(int number) {
        System.out.println("your "+number+" for credit card is valid");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Processing your credit card....");
        System.out.println("rs "+amount+" pay via creditCard");
    }

}
class upiPayment implements Payment{
    @Override
    public void otp(int number) {
        System.out.println("your "+number+" for upi payment is valid");
    }

    @Override
    public void pay(double amount) {
        System.out.println("Upi payment is undergoing....");
        System.out.println("rs "+amount+" pay via paytm");

    }

}
class debitCard implements Payment{
    @Override
    public void otp(int number) {
        System.out.println("your "+number+" for Debit card is valid");

    }
    @Override
    public void pay(double amount) {
        System.out.println("Debit card is processing wait for sec...");
        System.out.println("rs "+amount+" pay via Axis debit card");
    }


}
public class Main {
    public static void main(String[] args) {
        Payment payment=null;

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the payment Gateway...");
        System.out.println("Choose the payment methods...");
        System.out.println("1. Credit Card\n2. Upi\n3. Debit Card");
        int choice=sc.nextInt();
        System.out.println("Enter the amount to pay");
        double amount=sc.nextDouble();
        System.out.println("Enter the OTP");
        int number=sc.nextInt();


        switch (choice){
            case 1:
                payment=new creditCard();
                break;

            case 2:
                payment=new upiPayment();
                break;


            case 3:
                payment=new debitCard();
                break;

            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        payment.otp(number);
        payment.pay(amount);

        System.out.println("Payment completed..");
        sc.close();

    }
}