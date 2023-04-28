package strategyDPExample;

public class StrategyDP {

    interface Payment {
        void collectPaymentDetails();
        void doPayment();
    }

    static class CreditCard implements Payment {

        @Override
        public void collectPaymentDetails() {
            System.out.println("Enter Credit card number, expiry date, cvv number");
        }

        @Override
        public void doPayment() {
            System.out.println("Payment Success");
        }
    }

    static class GooglePay implements Payment {

        @Override
        public void collectPaymentDetails() {
            System.out.println("Enter UPI Id and pin");
        }

        @Override
        public void doPayment() {
            System.out.println("Gpay payment is successful");
        }
    }

    static class Order {
        int orderId;
        int amount;
        Payment paymentMethod;

        public Order(int orderId, int amount, Payment paymentMethod) {
            this.orderId = orderId;
            this.amount = amount;
            this.paymentMethod = paymentMethod;
        }

        public void placeOrder () {
            paymentMethod.collectPaymentDetails();
            paymentMethod.doPayment();
        }
    }

    public static void main(String[] args) {
        // Two ways of Payment.
        Payment cc = new CreditCard();
        Payment gPay = new GooglePay();

        // I am ordering an Apple Watch in myntra app.
        Order order = new Order(101, 16000, gPay);// Order order = new Order(101, 16000, cc)
        order.placeOrder();
    }
}
