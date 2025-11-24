
package tugas;

import java.util.ArrayList;
import java.util.Scanner;

public class perpustakaan {
    private ArrayList<mahasiswa> daftarmahasiswa = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void tambahData() {
        System.out.print("Masukkan NPM: ");
        String npm = scanner.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Alamat: ");
        String alamat = scanner.nextLine();

        mahasiswa mhs = new mahasiswa(npm, nama, alamat);
        daftarmahasiswa.add(mhs);

        System.out.println("Data mahasiswa berhasil ditambahkan!");
    }

    public void cariData() {
        System.out.print("Masukkan NPM yang ingin dicari: ");
        String npmCari = scanner.nextLine();
        boolean ditemukan = false;
        for (mahasiswa mhs : daftarmahasiswa) {
            if (mhs.getNpm().equals(npmCari)) {
                System.out.println("Data ditemukan: " + mhs);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data mahasiswa dengan NPM " + npmCari + " tidak ditemukan.");
        }
    }

    public void editData() {
        System.out.print("Masukkan NPM mahasiswa yang ingin diedit: ");
        String npmEdit = scanner.nextLine();
        boolean ditemukan = false;

        for (mahasiswa mhs : daftarmahasiswa) {
            if (mhs.getNpm().equals(npmEdit)) {
                System.out.print("Masukkan Nama baru: ");
                String namaBaru = scanner.nextLine();
                System.out.print("Masukkan Alamat baru: ");
                String alamatBaru = scanner.nextLine();

                mhs.setNama(namaBaru);
                mhs.setAlamat(alamatBaru);

                System.out.println("Data mahasiswa berhasil diubah.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data mahasiswa dengan NPM " + npmEdit + " tidak ditemukan.");
        }
    }

    public void hapusData() {
        System.out.print("Masukkan NPM mahasiswa yang ingin dihapus: ");
        String npmHapus = scanner.nextLine();
        boolean ditemukan = false;

        for (mahasiswa mhs : daftarmahasiswa) {
            if (mhs.getNpm().equals(npmHapus)) {
                daftarmahasiswa.remove(mhs);
                System.out.println("Data mahasiswa berhasil dihapus.");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Data mahasiswa dengan NPM " + npmHapus + " tidak ditemukan.");
        }
    }

    public void tampilkanMenu() {
        int pilihan = 0;
        do {
            System.out.println("\n=== Menu Aplikasi Mahasiswa ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Cari Mahasiswa");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            try {
                pilihan = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                pilihan = 0;
            }

            switch (pilihan) {
                case 1:
                    tambahData();
                    break;
                case 2:
                    cariData();
                    break;
                case 3:
                    editData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    System.out.println("Keluar dari aplikasi.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);
    }
}

