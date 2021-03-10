public class Array2 {
    private String[][] Mahasiswa;
    private int[][] data,hasil;

    public void setMahasiswa(String[][] Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
        Mahasiswa = null; // menghapus variable parameter dari memory
    }

    public String[][] getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setData(int[][] data) {
        this.data = data;
        data = null; // menghapus variable parameter dari memory
    }

    public int[][] getData() {
        return this.data;
    }

    public void setPerkalianSkalar(int[][] data, int a) {
        this.hasil = data;
        int i, j;
        for(i = 0; i < data.length; i++) {
            for(j = 0; j < data[i].length; j++) {
                this.hasil[i][j] = a*data[i][j];
            }
        }
    }

    public int[][] getPerkalianSkaler() {
        return this.hasil;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
    }

    public void tampil(String data[][]) {
        int i, j; // i = baris, j = kolom
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+"    ");
            }
            System.out.println();
        }
        data = null;
    }

    public void tampil(int data[][]) {
        int i, j;
        for (i = 0; i < data.length; i++) {
            for (j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+"   ");
            }
            System.out.println();
        }
        data = null;
    }

    public void hapus() {
        // menghapus variable private dari memory untuk optimasi program
        Mahasiswa = null;
        data = null;
        hasil = null;
    }
}