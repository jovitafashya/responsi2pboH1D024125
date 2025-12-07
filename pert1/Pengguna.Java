// Pengguna.java
class Pengguna {
    // Variabel pengguna
    int umur;           // tahun
    double berat;       // kg
    double tinggi;      // cm

    // Konstanta faktor aktivitas
    public static final double FAKTOR_AKTIVITAS = 1.2;

    // Constructor
    Pengguna(int umur, double berat, double tinggi) {
        this.umur = umur;
        this.berat = berat;
        this.tinggi = tinggi;
    }

    // 1. Menghitung BMI
    double hitungBMI() {
        double tinggiMeter = tinggi / 100.0;
        return berat / (tinggiMeter * tinggiMeter);
    }

    // 2. Menampilkan kategori BMI
    void tampilKategori() {
        double bmi = hitungBMI();
        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else if (bmi < 30) {
            System.out.println("Kategori: Overweight");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    // 3. Menghitung kebutuhan kalori
    double hitungKalori() {
        return berat * FAKTOR_AKTIVITAS * 10;
    }

    // 4. Menampilkan seluruh informasi pengguna
    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("BMI: " + String.format("%.2f", hitungBMI()));
        tampilKategori();
        System.out.println("Kebutuhan Kalori: " + (int)hitungKalori() + " kal/hari");
        System.out.println("====================================");
    }
}
