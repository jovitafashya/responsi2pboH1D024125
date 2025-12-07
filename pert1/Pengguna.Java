class Pengguna {
    // State (variabel) yang diperlukan
    int umur;
    double berat;
    double tinggi;

    // Konstanta faktorAktivitas
    final double faktorAktivitas = 1.2;

    double hitungBMI() {
        // Konversi tinggi dari cm ke meter
        double tinggiMeter = tinggi / 100;
        // Hitung BMI sesuai rumus
        double bmi = berat / (tinggiMeter * tinggiMeter);
        return bmi;
    }

    void tampilKategori() {
        double bmi = hitungBMI();

        if (bmi < 18.5) {
            System.out.println("Kategori: Kurus");
        } else if (bmi < 25) {
            System.out.println("Kategori: Normal");
        } else {
            System.out.println("Kategori: Obesitas");
        }
    }

    double hitungKalori() {
        // Rumus: kalori = berat x faktorAktivitas x 10
        double kalori = berat * faktorAktivitas * 10;
        return kalori;
    }

    void tampilInfo() {
        System.out.println("=== Informasi Kesehatan Pengguna ===");
        System.out.println("Umur " + umur + " tahun");
        System.out.println("Berat: " + berat + " kg");
        System.out.println("Tinggi: " + tinggi + " cm");
        System.out.println("BMI: " + String.format("%.2f", hitungBMI()));
        tampilKategori();
        System.out.println("Kebutuhan Kalori: " + hitungKalori() + " kal/hari");
        System.out.println("====================================");
    }
}