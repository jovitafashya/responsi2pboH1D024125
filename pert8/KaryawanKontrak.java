public interface KaryawanKontrak {
    // Method abstrak wajib
    double hitungGaji(int jamKerja);

    void perpanjangKontrak(int durasiBulan);

    // Method default opsional
    default String getStatusCuti() {
        return "Tersedia 12 hari";
    }
}