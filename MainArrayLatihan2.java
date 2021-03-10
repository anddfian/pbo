public class MainArrayLatihan2 {
    public static void main(String args[]) {
        ArrayLatihan2 ob = new ArrayLatihan2();
        int deret[] = {2,5,3,5,9,5};
        ob.tampil("==============================");
        ob.tampil("Deret : ");
        ob.setDeret(deret);
        ob.tampil(ob.getDeret());
        ob.tampil("Hasil Ubah Angka 5 menjadi 1 : ");
        ob.setUpdate(5, 1);
        ob.tampil(ob.getDeret());
        ob.tampil("Hasil Deret No.1 dikalikan 0.5 : ");
        ob.setPerkalian(deret, 0.5);
        ob.tampil(ob.getPerkalian());

        // menghapus variable dari memory untuk optimasi program
        ob.hapus();
        deret = null;
        ob = null;
    }
}
