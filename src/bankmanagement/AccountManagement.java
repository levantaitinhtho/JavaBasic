package bankmanagement;


// Lưu trữ account, thêm, xóa, tìm kiếm....
//AccountManagement
//        ArrayList<Account> accountList …..
//        + addAccount
//        + deleteAccount
//        + searchAccount

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AccountManagement {
    private ArrayList<Account> accountList = new ArrayList<>();

    public ArrayList<Account> getList() {
        return accountList;
    }
    public void addAccount(Account addAccount) {
                accountList.add(addAccount);
            }
    public void removeAccount(Account account) {
        accountList.remove(account);
    }
    public void updateAccount(Account updateAccount){
        for(Account account : accountList){
            if(account.getID() ==updateAccount.getID()){
               account.setAccountName(updateAccount.getAccountName());
            }
        }
    }
    public Account searchByID(long ID) {
        return accountList.stream().filter(account ->
                account.getID() == ID).findFirst().orElse(null);
    }
}
