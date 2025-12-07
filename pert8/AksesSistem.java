public interface AksesSistem {
    // Method abstrak wajib
    void login(String pin);

    void logout();

    // Method default opsional
    default String getRoleAkses() {
        return "Staff Biasa";
    }
}