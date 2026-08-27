package org.example.oop.OverriddingAndOverloading;

class Payment {

    void pay(double amount) {
        System.out.println("Paying €" + amount);
    }

    void pay(double amount, String method) {
        System.out.println(
                "Paying €" + amount + " using " + method
        );
    }
}


class OnlinePayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println(
                "Online payment of €" + amount
        );
    }


    public static void main(String[] args) {

        OnlinePayment payment = new OnlinePayment();

        payment.pay(100);
        payment.pay(200, "PayPal");
    }
}
