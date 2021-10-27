package Study;


import java.util.Scanner;
import java.lang.String;
class Account {
    private int id;
    private String name;
    private int balance=0;
    public Account(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Account(int id,String name,int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        balance+=amount;
    }
    public void withdraw(int amount){
        if(balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("Not Enough Money");
        }
    }
    public void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Balance: "+balance);
    }

    public static void main(String[] args) {
        Account a = new Account(205,"Tai",200);
        a.display();
        a.withdraw(100);
        a.display();
        a.deposit(20000);
        a.display();
    }
}
