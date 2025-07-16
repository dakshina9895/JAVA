package main;

class Account {
    private int accNo;
    private String name;
    private String address;
    private String phoneNo;
    private String dob;
    protected double balance;

    public Account(int accNo, String name, String address, String phoneNo, String dob, double balance) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    // Getters
    public int getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class SavingAccount extends Account {

    public SavingAccount(int accNo, String name, String address, String phoneNo, String dob, double balance) {
        super(accNo, name, address, phoneNo, dob, balance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
}

class LabExample3 {
    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount(60, "DAKSHINA", "TEZPUR", "8632758798", "2004-11-05", 5000.0);

        System.out.println("Initial Balance: ₹" + sa.getBalance());

        sa.deposit(1500.0);
        System.out.println("Balance after deposit: ₹" + sa.getBalance());

        sa.withdraw(2000.0);
        System.out.println("Balance after withdrawal: ₹" + sa.getBalance());
    }
}