package wisata;

public class DestinasiWisata {

    // Encapsulation
    private String nama;
    private String lokasi;
    private String kategori;
    private double hargaTiket;
    private String jamOperasional;

    // Constructor
    public DestinasiWisata(String nama, String lokasi,
            String kategori, double hargaTiket,
            String jamOperasional) {

        this.nama = nama;
        this.lokasi = lokasi;
        this.kategori = kategori;
        this.hargaTiket = hargaTiket;
        this.jamOperasional = jamOperasional;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLokasi() {
        return lokasi;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public String getJamOperasional() {
        return jamOperasional;
    }

    public void setJamOperasional(String jamOperasional) {
        this.jamOperasional = jamOperasional;
    }

    // Method detail wisata
    public void tampilkanDetail() {

        System.out.println("Nama Destinasi : " + nama);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Kategori       : " + kategori);
        System.out.println("Harga Tiket    : Rp" + hargaTiket);
        System.out.println("Jam Operasional: " + jamOperasional);
    }
}
