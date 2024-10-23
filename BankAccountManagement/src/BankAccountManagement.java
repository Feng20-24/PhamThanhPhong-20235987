import java.util.Scanner;
public class BankAccountManagement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter account name: ");
        String name = input.nextLine();
        System.out.print("Enter initial balance: ");
        double initialBalance = input.nextDouble();
        int count = 0;

        String log="Log: \n";
        while(true) {
            if (count == 3) break;
            System.out.print("Enter option(0 to terminate, 1 to withdraw, 2 to deposit): ");
            int option = input.nextInt();
            if(option == 0) break;
            switch (option) {
                case 0:
                    break;
                case 1:
                    System.out.print("Enter the withdraw amount: ");
                    double withdrawAmount = input.nextDouble();
                    initialBalance -= withdrawAmount;
                    count++;
                    log+="Withdraw" + withdrawAmount + "\n";
                    break;
                case 2:
                    System.out.print("Enter the deposit amount: ");
                    double depositAmount = input.nextDouble();
                    initialBalance += depositAmount;
                    log+="Deposit" + depositAmount + "\n";
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }


        System.out.println(log);
        System.out.print("Balance after interest(10%): "+ initialBalance*110/100);
    }
}
