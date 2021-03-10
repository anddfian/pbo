public class MainArrayLatihan {
    public static void main(String args[]) {
        ArrayLatihan ob = new ArrayLatihan();
        int deret[] = {-5,-3,-6,-3,-4};
        ob.tampil("==============================");
        ob.tampil("Deret : ");
        ob.setDeret(deret);
        ob.tampil(ob.getDeret());
        ob.tampil("Hasil Rata-Rata Deret : ");
        ob.setRatarata(deret);
        ob.tampil(ob.getRatarata());
        ob.tampil("Hasil Nilai Maksimum Deret : ");
        ob.setMaks(deret);
        ob.tampil(ob.getMaks());
        ob.tampil("Hasil Nilai Minimum Deret : ");
        ob.setMin(deret);
        ob.tampil(ob.getMin());
        ob.tampil("Angka -3 pada bilangan tersebut terdapat pada: ");
        ob.setIndex(deret, -3);
        ob.tampil(ob.getIndex());

        // menghapus variable dari memory untuk optimasi program
        ob.hapus();
        deret = null;
        ob = null;
    }
}
