// Menghitung luas dan keliling bangun datar


class Bangundatar {
    private double luas;
    private double keliling;

    public double getLuas() {
        return luas;
    }

    public void setLuas(double luas) {
        this.luas = luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public void setKeliling(double keliling) {
        this.keliling = keliling;
    }
}

class lingkaran extends Bangundatar {
    private double jari2;

    public lingkaran(double jari2) {
        this.jari2 = jari2;
        hitungluas();
        hitungkeliling();
    }

    private void hitungluas() {
        setLuas(Math.PI * jari2 * jari2);
    }

    private void hitungkeliling() {
        setKeliling(2 * Math.PI * jari2);
    }
}

class persegi extends Bangundatar {
    private double sisi;

    public persegi(double sisi) {
        this.sisi = sisi;
        hitungluas();
        hitungkeliling();
    }

    private void hitungluas() {
        setLuas(sisi * sisi);
    }

    private void hitungkeliling() {
        setKeliling(4 * sisi);
    }
}

public class KuisMandiri_3 {
    public static void main(String[] args) {
        double jariLingkaran = 5.0;
        lingkaran lingkaranObj = new lingkaran(jariLingkaran);
        System.out.println("Luas Lingkaran: " + lingkaranObj.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaranObj.getKeliling());

        double sisiPersegi = 7.0;
        persegi persegiObj = new persegi(sisiPersegi);
        System.out.println("Luas Persegi: " + persegiObj.getLuas());
        System.out.println("Keliling Persegi: " + persegiObj.getKeliling());
    }
}

