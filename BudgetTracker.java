import java.util.ArrayList;
import java.util.Scanner;

public class BudgetTracker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Transaction> transactions = new ArrayList<>();

        System.out.println("What type of transaction would you like to add?");
        System.out.println("1. Income");
        System.out.println("2. Expense");

        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        // income choice
        if (choice == 1) {
            // description
            System.out.print("Enter description: ");
            String description = scanner.nextLine();

            // amount
            System.out.print("Enter amount: $");
            double amount = scanner.nextDouble();

            scanner.nextLine();

            // date
            System.out.print("Enter date (MM/DD/YYYY): ");
            String date = scanner.nextLine();

            Income income = new Income(
                    description,
                    amount,
                    date);

            transactions.add(income);
        }


        // expenses choice
        if (choice == 2) {
            // description
            System.out.print("Enter description: ");
            String description = scanner.nextLine();

            // amount
            System.out.print("Enter amount: $");
            double amount = scanner.nextDouble();

            scanner.nextLine();

            // date
            System.out.print("Enter date: ");
            String date = scanner.nextLine();


            Expenses expenses = new Expenses(
                    description,
                    amount,
                    date);
            transactions.add(expenses);
        }

        for (Transaction transaction : transactions){
            System.out.println(transaction.getDescription());
            System.out.println(transaction.getAmount());
            System.out.println(transaction.getDate());
            System.out.println();
        }

    }
}
