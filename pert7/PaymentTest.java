public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===\n");

        // 1. Membuat objek EWalletPayment
        EWalletPayment ovoPayment = new EWalletPayment("OVO", 100000.0, 50000.0);

        // Menampilkan data sebelum transaksi
        System.out.println("=== DATA SEBELUM TRANSAKSI ===");
        System.out.println("Layanan: " + ovoPayment.getNamaLayanan());
        System.out.println("Saldo awal: Rp "
                + (ovoPayment.getBalance() + ovoPayment.getNominalPembayaran() + ovoPayment.getTransactionFee()));
        System.out.println("Nominal pembayaran: Rp " + ovoPayment.getNominalPembayaran());
        System.out.println("Biaya transaksi: Rp " + ovoPayment.getTransactionFee());

        // 2. Memproses pembayaran
        System.out.println("\n=== PROSES PEMBAYARAN ===");
        System.out.println("Memproses pembayaran sebesar Rp " + ovoPayment.getNominalPembayaran() + "...");
        String hasilPembayaran = ovoPayment.processPayment();
        System.out.println(hasilPembayaran);

        // 3. Menampilkan data setelah transaksi
        System.out.println("\n=== DATA SETELAH TRANSAKSI ===");
        System.out.println("Sisa saldo: Rp " + ovoPayment.getBalance());
        System.out.println(ovoPayment.getPaymentDetails());

        // Uji kasus kedua: Pembayaran gagal
        System.out.println("\n=== UJI KASUS: SALDO TIDAK CUKUP ===");
        EWalletPayment danaPayment = new EWalletPayment("DANA", 10000.0, 9000.0);
        System.out.println("Saldo awal: Rp " + danaPayment.getBalance());
        System.out.println("Mencoba membayar: Rp " + danaPayment.getNominalPembayaran());
        System.out.println(danaPayment.processPayment());
        System.out.println(danaPayment.getPaymentDetails());
    }
}