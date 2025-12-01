

class bank{
    String name;
    double balance;

    bank(String n , double b){
        name = n;
        balance = b;
    }

    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount){
        if(amount<=balance){
            balance -= amount;
        }
        else{
            System.out.println("insufficient balance");
        }
    }

    void display(){
        System.out.println(name+ " has balance:"+balance);
    }
}
public class balance{
    public static void main(String[] args) {
        bank me = new bank("zibran", 100000);
        me.display();
    }
}