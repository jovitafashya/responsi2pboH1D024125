class UjiPengguna {
    public static void main(String[] args) {
        // Objek Pengguna
        Pengguna p = new Pengguna();

        // Isi data sesuai data uji coba
        p.umur = 25;
        p.berat = 60.0;
        p.tinggi = 170.0;

        // Panggil method tampilInfo
        p.tampilInfo();

        // Tampilkan demonstrasi tentang konstanta final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + p.faktorAktivitas);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");
    }
}