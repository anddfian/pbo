package modul4;

public class LatihanModul4 {

    public static void main(String[] args) {
        AlatTulis bolpoint = new AlatTulis();
        AlatTulis pensil = new AlatTulis();
        AlatTulis penghapus = new AlatTulis();

        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);
        bolpoint.setHarga(bolpoint.getStok(), bolpoint.getHargaSatuan());
        AlatTulis.setTotalHarga(bolpoint.getHarga());
        bolpoint.tampil(bolpoint.getNama(), bolpoint.getStok(), bolpoint.getHargaSatuan(), bolpoint.getHarga());

        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);
        pensil.setHarga(pensil.getStok(), pensil.getHargaSatuan());
        AlatTulis.setTotalHarga(pensil.getHarga());
        pensil.tampil(pensil.getNama(), pensil.getStok(), pensil.getHargaSatuan(), pensil.getHarga());

        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);
        penghapus.setHarga(penghapus.getStok(), penghapus.getHargaSatuan());
        AlatTulis.setTotalHarga(penghapus.getHarga());
        penghapus.tampil(penghapus.getNama(), penghapus.getStok(), penghapus.getHargaSatuan(), penghapus.getHarga());

        System.out.println("\nHarga total alat tulis jika terjual semuanya : " + AlatTulis.getTotalHarga());
    }
}
