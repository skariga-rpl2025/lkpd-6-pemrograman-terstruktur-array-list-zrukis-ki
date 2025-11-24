

public class main {
    public static void main(String[] args) {
        perpus perpus = new perpus();
        perpus.tambahbuku("Belajar JAVA", "Umar Bakrie");
        perpus.tambahbuku("Java Untuk Pemula", "Amir Mahmud");
        perpus.tambahbuku("Java untuk Ahli", "Salim Iklim");
        System.out.println("Jumlah buku: " + perpus.jumblahbuku()); 
        perpus.tambahbuku("Java untuk Mahasiswa", "Farid Akbar");

        // cari buku
        String cari = "Pemula";
        System.out.println("Cari buku dengan kata kunci: " + cari);
        buku buku = perpus.caribuku(cari);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan");
        } else {
            System.out.println("Buku ditemukan dengan judul: " + buku.getjudul() + ", pengarang: " + buku.getpengarang());
        }

        // ganti buku
        perpus.gantibuku(0, "Belajar JAVA Baru", "Umar Bakrie Salim");
        buku = perpus.lihatbuku(0);
        System.out.println("Buku diganti dengan judul: " + buku.getjudul() + ", pengarang: " + buku.getpengarang());

        // hapus buku
        perpus.hapusbuku(0);
        System.out.println("Jumlah buku: " + perpus.jumblahbuku());
    }
}