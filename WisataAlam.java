package wisata;

public class WisataAlam extends DestinasiWisata {

    public WisataAlam(String nama, String lokasi,
            double harga, String jam) {

        super(nama, lokasi, "Wisata Alam", harga, jam);
    }

    @Override
    public void tampilkanDetail() {

        System.out.println("\n=== DETAIL WISATA ALAM ===");

        super.tampilkanDetail();
    }
}
