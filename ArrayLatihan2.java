public class ArrayLatihan2 {
    private int[] deret;
    private double[] kali;

    public int[] getDeret() {
        return this.deret;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
        deret = null;
    }

    public void setUpdate(int a, int b) {
        for(int i = 0; i < deret.length; i++) {
            if(a == deret[i]) {
                deret[i] = b;
            }
        }
        a = 0;
        b = 0;
    }

    public void setPerkalian(int[] deret, double a) {
        double[] array = new double[deret.length];
        for(int i = 0; i < deret.length; i++) {
            array[i] = (double) deret[i] * a;
        }
        this.kali = array;
    }

    public double[] getPerkalian() {
        return this.kali;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null; // menghapus variable dari memory
    }

    public void tampil(int a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null; // menghapus variable dari memory
        data = null;
    }

    public void tampil(double a[]) {
        String data = "";
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                data += a[i];
            } else {
                data += ", "+a[i];
            }
        }
        System.out.println(data);
        a = null; // menghapus variable dari memory
        data = null;
    }

    public void hapus() {
        // menghapus variable dari memory untuk optimasi program
        deret = null;
        kali = null;
    }
}