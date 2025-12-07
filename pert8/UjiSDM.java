public class UjiSDM {
    public static void main(String[] args) {
        System.out.println("=== PENGUJIAN PROGRAMMER MAGANG ===\n");

        // 1. Membuat objek ProgrammerMagang
        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        // 2. Menghitung gaji Andi untuk 160 jam kerja
        double gajiAndi = andi.hitungGaji(160);
        System.out.println("Gaji Andi (160 jam) adalah: Rp " + gajiAndi);

        // 3. Mengecek status cuti Andi
        System.out.println("Status Cuti: " + andi.getStatusCuti());

        // 4. Mencoba login menggunakan PIN yang salah ("9999")
        System.out.print("Login dengan PIN salah: ");
        andi.login("9999");

        // 5. Mencoba login menggunakan PIN yang benar ("1234")
        System.out.print("Login dengan PIN benar: ");
        andi.login("1234");

        // 6. Mengecek peran akses (role) yang dimiliki Andi
        System.out.println("Role Akses: " + andi.getRoleAkses());

        // 7. Memperpanjang masa kontrak Andi selama 6 bulan
        andi.perpanjangKontrak(6);

        // 8. Coba logout
        andi.logout();
    }
}