class Customer {
    // TODO: Buatkan atribut
    protected String nama;
    protected String idCustomer;
    protected int totalBelanja;

    // TODO: Sediakan constructor
    public Customer(String nama, String idCustomer, int totalBelanja) {
        this.nama = nama;
        this.idCustomer = idCustomer;
        this.totalBelanja = totalBelanja;
    }

    void tampilkanInfo() {
        // TODO: tampilkan data customer
        System.out.println("Nama: " + nama + " | ID: " + idCustomer + " | Total Belanja: Rp " + totalBelanja);
    }
}