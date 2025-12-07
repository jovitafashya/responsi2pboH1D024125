public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    // Atribut
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    // Constructor
    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }

    // Implementasi method dari KaryawanKontrak
    @Override
    public double hitungGaji(int jamKerja) {
        return jamKerja * gajiPerJam;
    }

    @Override
    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang " + durasiBulan + " bulan.");
    }

    // Override method default dari KaryawanKontrak
    @Override
    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    // Implementasi method dari AksesSistem
    @Override
    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login Berhasil. Selamat datang, " + nama + "!");
        } else {
            System.out.println("Login Gagal: PIN salah.");
        }
    }

    @Override
    public void logout() {
        sedangLogin = false;
        System.out.println(nama + " berhasil logout.");
    }

    // Override method default dari AksesSistem
    @Override
    public String getRoleAkses() {
        return "Magang IT";
    }

    // Getter untuk atribut (opsional)
    public String getNama() {
        return nama;
    }

    public boolean isSedangLogin() {
        return sedangLogin;
    }
}