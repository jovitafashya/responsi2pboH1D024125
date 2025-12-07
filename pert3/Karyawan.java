class Karyawan {
    // Deklarasikan variabel/state dasar (nama, gajiPokok)
    protected String nama;
    protected double gajiPokok;

    // Constructor untuk inisialisasi nama dan gajiPokok
    public Karyawan(String nama, double gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method untuk menampilkan informasi dasar karyawan
    void tampilInfo() {
        System.out.println("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok);
    }
}