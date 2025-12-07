// UjiPengguna.java
public class UjiPengguna {
    public static void main(String[] args) {
        // Membuat objek pengguna
        Pengguna p = new Pengguna(25, 60.0, 170.0);

        // Menampilkan semua informasi pengguna
        p.tampilInfo();

        // Demonstrasi konstanta final
        System.out.println("\n--- Demonstrasi Konstanta Final ---");
        System.out.println("Nilai faktor aktivitas: " + Pengguna.FAKTOR_AKTIVITAS);
        System.out.println("Faktor aktivitas bersifat final (konstan)");
        System.out.println("Artinya nilai ini tidak bisa diubah setelah diinisialisasi");

        System.out.println("\nJika kita mencoba menulis:");
        System.out.println("p.FAKTOR_AKTIVITAS = 1.5;");
        System.out.println("Maka compiler akan menolak dengan error:");
        System.out.println("'cannot assign a value to final variable FAKTOR_AKTIVITAS'");

        // Baris berikut sengaja dikomentari karena akan menimbulkan error
        // p.FAKTOR_AKTIVITAS = 1.5; // ERROR
    }
}
