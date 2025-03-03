import java.util.Scanner;

public class PersonalFinanceTrackerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FinanceTracker financeTracker = new FinanceTracker();

        while (true) {
            System.out.println("Personal Finance Tracker");
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Summary");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter income amount: ");
                    double incomeAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline character
                    financeTracker.addIncome(incomeAmount);
                    break;
                case 2:
                    System.out.print("Enter expense amount: ");
                    double expenseAmount = scanner.nextDouble();
                    scanner.nextLine();  // Consume the newline character
                    financeTracker.addExpense(expenseAmount);
                    break;
                case 3:
                    financeTracker.viewSummary();
                    break;
                case 4:
                    System.out.println("Exiting. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

//Display

public class FinanceTracker {
    private double totalIncome;
    private double totalExpense;

    public void addIncome(double amount) {
        totalIncome += amount;
        System.out.println("Income added: $" + amount);
    }

    public void addExpense(double amount) {
        totalExpense += amount;
        System.out.println("Expense added: $" + amount);
    }

    public void viewSummary() {
        System.out.println("=== Summary ===");
        System.out.println("Total Income: $" + totalIncome);
        System.out.println("Total Expenses: $" + totalExpense);
        System.out.println("Balance: $" + (totalIncome - totalExpense));
    }
}
