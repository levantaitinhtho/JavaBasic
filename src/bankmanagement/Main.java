package bankmanagement;


// Những hành động phía user:
//+ inputInfo : scan
//        + display: sout (toString)
//        + Menu : show menu

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        AccountManagement accountManagement = new AccountManagement();
        ArrayList<Account> accountList = accountManagement.getList();
        Date now = new Date();
        showMenu();
        while (true) {
            int number = scanner.nextInt();
            switch (number) {
                case 1:
                    Account account = inputInfor();
                    if(accountList.contains(account)){
                        System.out.println("ID Already Exist !!");
                    }else{
                        accountManagement.addAccount(account);
                        System.out.println("The Time Taken Is: "+ now);
                        System.out.println("Added !");
                    }
                    break;
                case 2:
                    System.out.println("Enter The ID To Be Found ");
                    long inputID = scanner.nextLong();
                    accountList.stream().filter(acc ->
                            acc.getID() == inputID).forEach(accountManagement::removeAccount);
                    System.out.println("The Time Taken Is: "+ now);
                    System.out.println("Deleted");
                    break;
                case 3:
                    System.out.println("Enter ID Need Search");
                    long search = scanner.nextLong();
                    Account account1 = accountManagement.searchByID(search);
                        if(account1 == null){
                            System.out.println("Not Found ID You Need");
                            break;
                        }else{
                            System.out.println("This Is The Information You Need");
                            display(account1);
                            System.out.println("The Time Taken Is: "+ now);
                            System.out.println("---------------------------------");
                        }
                    break;
                case 4:
                    System.out.println("The Time Taken Is: "+ now);
                    accountList.forEach(Main::display);
                    break;
                case 5:
                    System.out.println("Enter ID You Need Update");
                    int newID = scanner.nextInt();
                    Account account4 = accountManagement.searchByID(newID);
                    if(account4 == null ){
                        System.out.println("Not Found ID You Need");
                        break;
                    }else{
                                System.out.println("Enter New Name");
                                scanner.nextLine();
                                String newName = scanner.nextLine();
                                account4.setAccountName(newName);
                                accountManagement.updateAccount(account4);
                                 System.out.println("Successful Update !! ");
                                 System.out.println("The Time Taken Is: "+ now);
                        }
                        break;
                case 6:
                    System.out.println("Enter The Account To Be Recharged");
                    double tk = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Number Money Need Add");
                    double admit = scanner.nextDouble();
                    for(Account account2 : accountList){
                        if(tk == account2.getID()){
                            account2.addMoney(admit);
                        }
                    }
                    break;
                case 7:
                    Collections.sort(accountList, new Comparator<Account>() {
                        @Override
                        public int compare(Account account, Account t1) {
                            if(account.getAmount()>t1.getAmount()){
                                return 1;
                            }else if(account.getAmount() < t1.getAmount()){
                                return -1;
                            }else {
                                return 0;
                            }
                        }
                    });
                    for(Account account2 : accountList){
                        System.out.println("After Sort !!");
                        display(account2);
                        System.out.println("The Time Taken Is: "+ now);
                        System.out.println("------------------");
                    }
                case 8:
                    Collections.sort(accountList, new Comparator<Account>() {
                        @Override
                        public int compare(Account account, Account t1) {
                            int index = account.getAccountName().compareTo(t1.getAccountName());
                            if(index >= 0){
                                return 1;
                            }else{
                                return 1;
                            }
                        }
                    });
                    for(Account account2 : accountList){
                        System.out.println("After Sort !!!");
                        display(account2);
                        System.out.println("The Time Taken Is: "+ now);
                        System.out.println("----------------------");
                    }
                    break;
                case 9:
                    System.out.println("Enter The Account To Be Widthdraw");
                    double widthdraw = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Number Money Need Widthdraw ");
                    double rut  = scanner.nextDouble();
                    for(Account account2 : accountList){
                        if(widthdraw == account2.getID()){
                            account2.withdraw(rut);
                            System.out.println("The Time Taken Is: "+ now);
                        }
                    }
                    break;
                case 10:
                    System.out.println("Enter A Transfer Account Money");
                    double transfer = scanner.nextDouble();
                    System.out.println("Enter Number Money Need Transfer");
                    double moneytransfer = scanner.nextDouble();
                    Account account2 = new Account();
                    for(Account account3 : accountList){
                        if(transfer==account3.getID()){
                            account3.transfer(moneytransfer,account2);
                            System.out.println("The Time Taken Is: "+ now);
                        }
                    }
                    break;
                case 11:
                    accountList.forEach(Main::display);
                    break;
                case 12:
                    System.out.println("GoodBye!!~~");
                    System.out.println("End Of The Transaction At: "+ now);
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
        System.out.println("5. Update Information ");
        System.out.println("6. Add money for an account");
        System.out.println("7. Sort Account Based On Amount ");
        System.out.println("8. Sort Account Based On Name ");
        System.out.println("9. Withdraw money from an account");
        System.out.println("10. Transfer money");
        System.out.println("11. Show menu");
        System.out.println("12. Exist");
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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
}
