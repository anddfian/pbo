package modul4;

public class Modul4 {

    // 4.2 Object
    public static void main(String[] args) {
        SepedaMotor motor = new SepedaMotor();
        motor.setMerk("Suzuki");
        motor.setHarga(11000000);
        System.out.println("Motor ini bermerk : " + motor.getMerk());
        System.out.println("Motor ini harga : " + motor.getHarga());
    }

    /* 4.3 Enkapsulasi
    public static void main(String[] args) {
        Enkapsulasi ob = new Enkapsulasi();
        ob.setAlas(5);
        ob.setTinggi(7);
        System.out.println("Alas : " + ob.getAlas());
        System.out.println("Tinggi : " + ob.getTinggi());
        ob.setLuasSegitiga(ob.getAlas(), ob.getTinggi());
        System.out.println("Luas Segitiga : " + ob.getLuasSegitiga());
    } */

    /* 4.4 Oveloading
    public void tampil() {
        System.out.println("Saya Bahagia Belajar PBO");
    }

    public void tampil(int a) {
        System.out.println("Saya Sangat Bahagia Belajar PBO : " + a);
    }

    public void tampil(int a, int b) {
        System.out.println("Saya Sangat Bahagia Belajar PBO : " + a * b);
    }

    public void tampil(String a) {
        System.out.println(a + " Sangat Bahagia Belajar PBO");
    }

    public static void main(String[] args) {
        Modul4 ob = new Modul4();
        ob.tampil();
        ob.tampil(1);
        ob.tampil(1, 2);
        ob.tampil("Tentu Saja Saya");
    }*/
}
