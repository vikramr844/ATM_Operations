import java.util.Scanner;

public class ATM_AdvancedRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Account details
        String name = "";
        int age = 0;
        String accountNumber = "";
        int pin = 0;
        double balance = 0.0;
        boolean isRegistered = false;

        int choice;

        do {
            System.out.println("\n===== ATM Menu =====");
            System.out.println("1 → Account Registration");
            System.out.println("2 → Profile View");
            System.out.println("3 → Check Balance");
            System.out.println("4 → Deposit Money");
            System.out.println("5 → Withdraw Money");
            System.out.println("6 → Change PIN");
            System.out.println("8 → Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1: // Account Registration
                    System.out.print("Enter your Name: ");
                    name = sc.nextLine();

                    System.out.print("Enter your Age: ");
                    age = sc.nextInt();
                    sc.nextLine(); // consume newline

                    System.out.print("Enter your Account Number: ");
                    accountNumber = sc.nextLine();

                    System.out.print("Set your PIN: ");
                    pin = sc.nextInt();

                    System.out.print("Enter Initial Deposit (Min ₹500): ₹");
                    balance = sc.nextDouble();

                    if (balance < 500) {
                        System.out.println("❌ Minimum balance should be ₹500. Registration failed.");
                        isRegistered = false;
                    } else {
                        System.out.println("✅ Account Created Successfully!");
                        isRegistered = true;
                    }
                    break;

                case 2: // Profile View
                    if (isRegistered) {
                        System.out.println("\n===== Profile =====");
                        System.out.println("👤 Name: " + name);
                        System.out.println("🎂 Age: " + age);
                        System.out.println("🏦 Account Number: " + accountNumber);
                        System.out.println("💰 Balance: ₹" + balance);
                    } else {
                        System.out.println("❌ No account found. Please register first (Case 1).");
                    }
                    break;

                case 3: // Check Balance
                    if (isRegistered) {
                        System.out.println("✅ Current Balance: ₹" + balance);
                    } else {
                        System.out.println("❌ No account found. Please register first (Case 1).");
                    }
                    break;

                case 4: // Deposit Money
                    if (isRegistered) {
                        System.out.print("Enter deposit amount: ₹");
                        double deposit = sc.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.println("✅ Deposited Successfully! Current Balance: ₹" + balance);
                        } else {
                            System.out.println("❌ Invalid deposit amount!");
                        }
                    } else {
                        System.out.println("❌ No account found. Please register first (Case 1).");
                    }
                    break;

                case 5: // Withdraw Money
                    if (isRegistered) {
                        System.out.print("Enter withdrawal amount: ₹");
                        double withdraw = sc.nextDouble();
                        if (withdraw > 0 && withdraw <= balance) {
                            balance -= withdraw;
                            System.out.println("✅ Withdrawn Successfully! Current Balance: ₹" + balance);
                        } else if (withdraw > balance) {
                            System.out.println("❌ Insufficient Balance!");
                        } else {
                            System.out.println("❌ Invalid withdrawal amount!");
                        }
                    } else {
                        System.out.println("❌ No account found. Please register first (Case 1).");
                    }
                    break;

                case 6: // Change PIN
                    if (isRegistered) {
                        System.out.print("Enter current PIN: ");
                        int oldPin = sc.nextInt();
                        if (oldPin == pin) {
                            System.out.print("Enter new PIN: ");
                            pin = sc.nextInt();
                            System.out.println("✅ PIN Changed Successfully!");
                        } else {
                            System.out.println("❌ Incorrect PIN!");
                        }
                    } else {
                        System.out.println("❌ No account found. Please register first (Case 1).");
                    }
                    break;

                case 8: // Exit
                    System.out.println("👋 Thank you! Goodbye!");

                    break;

                default:
                    System.out.println("❌ Invalid Choice! Please try again.");
            }

        } while (choice != 8);

        sc.close();
    }
}
