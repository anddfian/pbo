public class MainArray2 {
    public static void main(String[] args) {
        Array2 ob = new Array2();
        String[][] Mhs = {
                // {kolom0,kolom1}
                {"NIM","NAMA"},
                {"17650123","David"}, // baris ke-1
                {"17650124","Ahmad"}, // baris ke-2
                {"17650125","Ratih"}, // baris ke-3
                {"17650126","Dina"}, // baris ke-4
        };
        ob.tampil("Data Mahasiswa : ");
        ob.setMahasiswa(Mhs);
        ob.tampil(ob.getMahasiswa());
        ob.tampil("==============");
        int[][] data = {
               // {kolom0,kolom1}
                {1,2},
                {3,4},
                {5,6}
        };
        int pengali = 2;
        ob.tampil("Data Matrik : ");
        ob.setData(data);
        ob.tampil(ob.getData());
        ob.tampil("Data Matrik X "+pengali+" : ");
        ob.setPerkalianSkalar(data, pengali);
        ob.tampil(ob.getPerkalianSkaler());

        // menghapus variable dari memory untuk optimasi program
        ob.hapus();
        Mhs = null;
        data = null;
        ob = null;
    }
}
