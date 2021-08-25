package bankmanagement;


// Những hành động phía user:
//+ inputInfo : scan
//        + display: sout (toString)
//        + Menu : show menu

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        AccountManagement accountManagement = new AccountManagement();
        ArrayList<Account> accountList = accountManagement.getList();
        showMenu();
        while (true) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    Account account = inputInfor();
                    accountManagement.addAccount(account);
                    break;
                case 2:
                    System.out.println("Enter The ID To Be Found ");
                    long inputID = scanner.nextLong();
                    for(Account acc: accountList){
                        if(acc.getID()==inputID){
                            accountManagement.removeAccount(acc);
                        }
                    }
                    System.out.println("Deleted");
                    break;
                case 3:
                    System.out.println("Enter ID Need Search");
                    long search = scanner.nextLong();
                    for(Account account1 : accountList){
                        if(account1.getID()==search){
                            display(account1);
                            break;
                        }
                    }
                    break;
                case 4:
                    for (Account acc: accountList) {
                        display(acc);
                    }
                    break;
                case 5:
                    System.out.println("Enter The Account To Be Recharged");
                    double tk = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Number Money Need Add");
                    double admit = scanner.nextDouble();
                    for(Account account1 : accountList){
                        if(tk == account1.getID()){
                            account1.addMoney(admit);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter The Account To Be Widthdraw");
                    double widthdraw = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Number Money Need Widthdraw ");
                    double rut  = scanner.nextDouble();
                    for(Account account2 : accountList){
                        if(widthdraw == account2.getID()){
                            account2.withdraw(rut);
                        }
                    }
                    break;
                case 7:
                    System.out.println("Enter A Transfer Account Money");
                    double transfer = scanner.nextDouble();
                    System.out.println("Enter Number Money Need Transfer");
                    double moneytransfer = scanner.nextDouble();
                    Account account1 = new Account();
                    for(Account account3 : accountList){
                        if(transfer==account3.getID()){
                            account3.transfer(moneytransfer,account1);
                        }
                    }
                    break;
                case 8:
                    for (Account acc: accountList) {
                        display(acc);
                    }
                    break;
                case 9:
                    System.out.println("GoodBye!!~~");
                    return;
                default:
                    System.err.println("Error");
            }

        }
            }

    public static void showMenu() {
        System.out.println("Welcome to the Agribank");
        System.out.println("Please choose an action: ");
        System.out.println("1. Add Account");
        System.out.println("2. Delete Account");
        System.out.println("3. Search Account");
        System.out.println("4. Display all");
        System.out.println("5. Add money for an account");
        System.out.println("6. Withdraw money from an account");
        System.out.println("7. Transfer money");
        System.out.println("8. Show menu");
        System.out.println("9. Exist");
    }

    public static Account inputInfor() {
        System.out.println("Please input infor of an account: ");
        System.out.print(" ID: ");
        long ID = scanner.nextLong();
        scanner.nextLine();
        System.out.print(" accountName: ");
        String accountName = scanner.nextLine();
        double initialMoney = 50000;
        return new Account(ID, accountName, initialMoney);
    }

    public static void display(Account account) {
        System.out.println(account.toString());
    }

}
