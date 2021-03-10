public class MainArray {
    public static void main(String args[]) {
        Array ob = new Array();
        String mahasiswa[] = {"Dono", "Danu", "Dani", "Doni"};
        int deret[] = {2,5,6,9,7};
        ob.tampil("Daftar Mahasiswa: ");
        ob.setMhs(mahasiswa);
        ob.tampil("==============================");
        ob.tampil("Deret : ");
        ob.setDeret(deret);
        ob.tampil(ob.getDeret());
        ob.tampil("Hasil Penjumlahan Deret : ");
        ob.setPenjumlahan(deret);
        ob.tampil(ob.getPenjumlahan());

        // menghapus variable dari memory untuk optimasi program
        ob.hapus();
        mahasiswa = null;
        deret = null;
        ob = null;
    }
}
