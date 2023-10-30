package KelilingLingkaran_Tugas2;

class demoKelilingLingkaran
{
    public static final double Phi = 3.14;
    double r;

    /**
     * constructor untuk objek kelas demoKelilingLingkaran
     *
     * @param r keliling Lingkaran.
     */
    public demoKelilingLingkaran(double r) {
        this.r = r;
    }

    /**
     * Mendapatkan nilai Keliling Lingkaran (2*phi*r)
     *
     * @return Hasil Keliling Lingkaran
     */
    public double kelilingLingkaran()
    {
    return 2*Phi*r;
    }

    public void tampil()
    {
    System.out.print(" Keliling Lingkaran dengan radius " +r+ " adalah " +kelilingLingkaran());
    }
}

public class Main {
    public static void main(String[] args) {
        demoKelilingLingkaran dKL = new demoKelilingLingkaran(7);
        dKL.tampil();
    }
}
