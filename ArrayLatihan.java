public class ArrayLatihan {
    private int[] deret;
    private double jumlah_nilai;
    private int jumlah_elemen;
    private double nilai_rata_rata;
    private int nilai_maksimum;
    private int nilai_minimum;
    private int[] index;

    public int[] getDeret() {
        return deret;
    }

    public void setDeret(int[] deret) {
        this.deret = deret;
    }

    public void setRatarata(int[] deret) {
        nilai_rata_rata = 0;
        for(int i = 0; i < deret.length; i++) {
            jumlah_nilai += deret[i];
            jumlah_elemen++;
        }
        nilai_rata_rata = jumlah_nilai/jumlah_elemen;
    }

    public double getRatarata() {
        return nilai_rata_rata;
    }

    public void setMaks(int[] deret) {
        nilai_maksimum = deret[0];
        for(int i = 0; i < deret.length; i++) {
            if(nilai_maksimum < deret[i]) {
                nilai_maksimum = deret[i];
            }
        }
    }

    public int getMaks() {
        return nilai_maksimum;
    }

    public void setMin(int[] deret) {
        nilai_minimum = deret[0];
        for(int i = 0; i < deret.length; i++) {
            if(nilai_minimum > deret[i]) {
                nilai_minimum = deret[i];
            }
        }
    }

    public int getMin() {
        return nilai_minimum;
    }

    public void setIndex(int[] deret, int a) {
        int[] array = new int[deret.length];
        for(int i = 0; i < deret.length; i++) {
            if(a == deret[i]) {
                array[i] = i;
            }
        }
        this.index = array;
/*        String data = "";
        for(int i = 0; i < deret.length; i++) {
            if(a == deret[i]) {
                data += "Index ke-"+ i + "\n";
            }
        }
        System.out.println(data);*/
    }

    public int[] getIndex() {
        return index;
    }

    public void tampil(String a) {
        System.out.println(a);
        a = null; // menghapus variable dari memory
    }

    public void tampil(int a) {
        System.out.println(a);
    }

    public void tampil(double a) {
        System.out.println(a);
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

    public void hapus() {
        // menghapus variable dari memory untuk optimasi program
        deret = null;
        nilai_rata_rata = 0;
        nilai_maksimum = 0;
        nilai_minimum = 0;
        jumlah_nilai = 0;
        jumlah_elemen = 0;
        index = null;
    }
}
