class Member extends Customer {
    // TODO: Tambahkan atribut tambahan
    private int poinReward;
    private String level;

    // TODO: Buat constructor dengan super
    public Member(String nama, String idCustomer, int totalBelanja, int poinReward, String level) {
        super(nama, idCustomer, totalBelanja);
        this.poinReward = poinReward;
        this.level = level;
    }

    @Override
    void tampilkanInfo() {
        // TODO: panggil super, lalu tampilkan data tambahan
        super.tampilkanInfo();
        System.out.println("Poin Reward: " + poinReward + " | Level: " + level);
    }
}
