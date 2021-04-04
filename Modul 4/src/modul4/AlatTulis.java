package modul4;

public class AlatTulis {
    private String nama;
    private int stok;
    private long hargaSatuan;
    private long harga;
    private static long totalHarga;

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getStok() {
        return this.stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }

    public long getHargaSatuan() {
        return this.hargaSatuan;
    }

    public void setHargaSatuan(long harga_satuan) {
        this.hargaSatuan = harga_satuan;
    }

    public long getHarga() {
        return this.harga;
    }

    public void setHarga(int stok, long hargaSatuan) {
        this.harga = stok * hargaSatuan;
    }

    public static long getTotalHarga() {
        return totalHarga;
    }

    public static void setTotalHarga(long harga) {
        totalHarga += harga;
    }

    public void tampil(String nama, int stok, long hargaSatuan, long harga) {
        System.out.println("\nNama alat tulis ini : " + nama);
        System.out.println("Stok alat tulis ini : " + stok);
        System.out.println("Harga satuan alat tulis ini : " + hargaSatuan);
        System.out.println("Harga total alat tulis ini : " + harga);
    }
}
