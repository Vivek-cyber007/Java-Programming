interface Bank {
    void input_details();
    void display_details();
}

class Customer {
    String name;
    int customerId;

    void getCustomerDetails(String nm, int id) {
        name = nm;
        customerId = id;
    }

    void displayCustomerDetails() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}


class Account extends Customer implements Bank {
    int acNo;
    double balance;

    public void input_details() {
        acNo = 19063478;
        balance = 10000;
    }

    public void display_details() {
        System.out.println("Account Number: " + acNo);
        System.out.println("Balance: " + balance);
    }
}


public class BankInterface {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.getCustomerDetails("Vivek", 142);
        ac.input_details();
        ac.displayCustomerDetails();
        ac.display_details();
    }

}