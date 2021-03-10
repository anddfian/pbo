public class ArrayLatihan3 {
    private int[][] data,data2,hasil;
    private double[][] kali;

    public void setData(int[][] data) {
        this.data = data;
        data = null; // menghapus variable parameter dari memory
    }

    public int[][] getData() {
        return data;
    }

    public void setData2(int[][] data2) {
        this.data2 = data2;
        data2 = null; // menghapus variable parameter dari memory
    }

    public int[][] getData2() {
        return data2;
    }

    public void setPenambahanSkalar(int[][] data, int[][] data2) {
        int[][] array = new int[data.length][data[0].length];
        int i, j;
        for(i = 0; i < data.length; i++) {
            for(j = 0; j < data[i].length; j++) {
                array[i][j] = data[i][j] + data2[i][j];
            }
            this.hasil = array;
        }
/*        for(i = 0; i < data.length; i++) {
            for(j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + data2[i][j] + " ");
            }
            System.out.println();
        }*/
    }

    public int[][] getPenambahanSkalar() {
        return hasil;
    }

    public void setPerkalianSkalar(int[][] data, double a) {
        double[][] array = new double[data.length][data[0].length];
        int i, j;
        for(i = 0; i < data.length; i++) {
            for(j = 0; j < data[i].length; j++) {
                array[i][j] = data[i][j] * a;
            }
        }
        this.kali = array;
    }

    public double[][] getPerkalianSkaler() {
        return kali;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null;
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

    public void tampil(double data[][]) {
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
        data = null;
        data2 = null;
        hasil = null;
    }
}
