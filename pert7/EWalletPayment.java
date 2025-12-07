public class EWalletPayment implements PaymentMethod {
    // Atribut
    private String namaLayanan;
    private double nominalPembayaran;
    private double saldoPengguna;
    private final double FEE_TRANSAKSI = 2000.0; // Biaya tetap Rp 2.000

    // Constructor
    public EWalletPayment(String namaLayanan, double saldoPengguna, double nominalPembayaran) {
        this.namaLayanan = namaLayanan;
        this.saldoPengguna = saldoPengguna;
        this.nominalPembayaran = nominalPembayaran;
    }

    // Implementasi method dari interface
    @Override
    public String processPayment() {
        double totalBiaya = nominalPembayaran + getTransactionFee();

        if (saldoPengguna >= totalBiaya) {
            saldoPengguna -= totalBiaya;
            return "Pembayaran berhasil!\nTotal biaya: Rp " + totalBiaya +
                    " (Termasuk fee Rp " + getTransactionFee() + ")";
        } else {
            return "Pembayaran gagal! Saldo tidak cukup.\n" +
                    "Dibutuhkan: Rp " + totalBiaya +
                    "\nSaldo tersedia: Rp " + saldoPengguna;
        }
    }

    @Override
    public String getPaymentDetails() {
        return "Detail Transaksi:\n" +
                "Layanan: " + namaLayanan + "\n" +
                "Nominal: Rp " + nominalPembayaran + "\n" +
                "Biaya Transaksi: Rp " + getTransactionFee() + "\n" +
                "Saldo Awal: Rp " + (saldoPengguna + nominalPembayaran + getTransactionFee()) + "\n" +
                "Status: " + (saldoPengguna >= nominalPembayaran + getTransactionFee() ? "Berhasil" : "Gagal");
    }

    @Override
    public double getTransactionFee() {
        return FEE_TRANSAKSI;
    }

    @Override
    public double getBalance() {
        return saldoPengguna;
    }

    // Getter untuk atribut lainnya
    public String getNamaLayanan() {
        return namaLayanan;
    }

    public double getNominalPembayaran() {
        return nominalPembayaran;
    }
}