public class MainArrayLatihan3 {
    public static void main(String[] args) {
        ArrayLatihan3 ob = new ArrayLatihan3();
        ob.tampil("==============");
        int[][] data = {
                // {kolom0,kolom1}
                {1,2},
                {3,5},
                {6,7}
        };
        int[][] data_2 = {
                // {kolom0,kolom1}
                {8,9},
                {10,11},
                {12,13}
        };
        double pengali = 0.5;
        ob.tampil("Data Matrik A: ");
        ob.setData(data);
        ob.tampil(ob.getData());
        ob.tampil("Data Matrik B: ");
        ob.setData2(data_2);
        ob.tampil(ob.getData2());
        ob.tampil("Data Matrik A + B : ");
        ob.setPenambahanSkalar(data, data_2);
        ob.tampil(ob.getPenambahanSkalar());
        ob.tampil("Data Matrik C * 0.5 : ");
        ob.setPerkalianSkalar(ob.getPenambahanSkalar(), pengali);
        ob.tampil(ob.getPerkalianSkaler());

        // menghapus variable dari memory untuk optimasi program
        ob.hapus();
        data = null;
        data_2 = null;
        ob = null;
    }
}