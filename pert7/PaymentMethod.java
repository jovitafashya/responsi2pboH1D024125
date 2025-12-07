public interface PaymentMethod {
    // Method untuk memproses pembayaran
    String processPayment();

    // Method untuk mendapatkan detail pembayaran
    String getPaymentDetails();

    // Method untuk mendapatkan biaya transaksi
    double getTransactionFee();

    // Method untuk mendapatkan saldo
    double getBalance();
}