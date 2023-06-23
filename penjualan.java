public class penjualan {
    import java.util.Scanner;

    class Makanan {
        String kode;
        String makanan;
        int harga;
        private int uang;
        int total;

        Makanan(String kode, String makanan, int harga) {
            this.kode = kode;
            this.makanan = makanan;
            this.harga = harga;
        }

        public void bayar() {
            if (uang < total) {
                System.out.println("Uang Tidak Cukup untuk membeli makanan, uang kurang " + (total - uang));
            } else if (uang == total) {
                System.out.println("Uang Pas");
            } else if (uang > total) {
                System.out.println("Ada Kembalian sebesar " + (uang - total));
            }
        }

        public void tampilkanInfo() {
            System.out.println("Makanan: " + makanan);
            System.out.println("Harga: " + harga);
        }

        void setUang(int uang) {
            if (uang <= 0) {
                this.uang = 0;
            } else if (uang >= 1) {
                this.uang = uang;
            }
        }

        public int getUang() {
            return uang;
        }
    }

    public class App {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Makanan makananArr[] = {

                    new Makanan("M001", "Mie Goreng", 5000),
                    new Makanan("NG001", "Nasi Goreng", 7000),
                    new Makanan("B001", "Bakso", 5500),
                    new Makanan("M002", "Mie Ayam", 6000),
            };

            System.out.println("=========================");
            System.out.println("1. Tampil Menu");
            System.out.println("2. Cari Makanan Berdasarkan Kode");
            int pilih = scanner.nextInt();
            if (pilih == 1) {
                Tampilmenu(makananArr);
                System.out.println("Pilih makanan :");
                Scanner scannerpilihmakanan = new Scanner(System.in);
                int pilihmakanan = scannerpilihmakanan.nextInt();
                if (pilihmakanan == 1) {
                    makananArr[0].tampilkanInfo();
                    System.out.println("Ingin Beli Berapa ?");
                    int jumlah = scanner.nextInt();
                    makananArr[0].total = makananArr[0].harga * jumlah;
                    System.out.println("Total Yang Harus Dibayar : " + makananArr[0].total);
                    System.out.println("Masukan Jumlah Uang :");
                    int uangPembayaran = scanner.nextInt();
                    makananArr[0].setUang(uangPembayaran);
                    makananArr[0].bayar();
                }else if(pilihmakanan==2){
                    makananArr[1].tampilkanInfo();
                    System.out.println("Ingin Beli Berapa ?");
                    int jumlah = scanner.nextInt();
                    makananArr[1].total = makananArr[1].harga * jumlah;
                    System.out.println("Total Yang Harus Dibayar : " + makananArr[1].total);
                    System.out.println("Masukan Jumlah Uang :");
                    int uangPembayaran = scanner.nextInt();
                    makananArr[1].setUang(uangPembayaran);
                    makananArr[1].bayar();
                }else if(pilihmakanan==3){
                    makananArr[2].tampilkanInfo();
                    System.out.println("Ingin Beli Berapa ?");
                    int jumlah = scanner.nextInt();
                    makananArr[2].total = makananArr[2].harga * jumlah;
                    System.out.println("Total Yang Harus Dibayar : " + makananArr[2].total);
                    System.out.println("Masukan Jumlah Uang :");
                    int uangPembayaran = scanner.nextInt();
                    makananArr[2].setUang(uangPembayaran);
                    makananArr[2].bayar();
                }else if(pilihmakanan==4){
                    makananArr[3].tampilkanInfo();
                    System.out.println("Ingin Beli Berapa ?");
                    int jumlah = scanner.nextInt();
                    makananArr[3].total = makananArr[3].harga * jumlah;
                    System.out.println("Total Yang Harus Dibayar : " + makananArr[3].total);
                    System.out.println("Masukan Jumlah Uang :");
                    int uangPembayaran = scanner.nextInt();
                    makananArr[3].setUang(uangPembayaran);
                    makananArr[3].bayar();
                }else {
                    System.out.println("Makanan Tidak ada di menu");
                }
            } else if (pilih == 2) {
                Scanner scankode = new Scanner(System.in);
                System.out.println("Masukan Kode Makanan");
                String kode = scankode.nextLine();
                Makanan hasil = searchLinier(makananArr, kode);
                if (hasil != null) {
                    System.out.println("detail Makanan " + hasil.makanan);
                    System.out.println("Kode : " + hasil.kode);
                    System.out.println("Nama : " + hasil.makanan);
                    System.out.println("Harga : " + hasil.harga);
                } else {
                    System.out.println("Makanan Tidak ada");
                }
            }

        }

        public static void Tampilmenu(Makanan[] makanan) {
            for (int i = 0; i < makanan.length; i++) {
                Makanan jenisMakanan = makanan[i];
                System.out.println(i + 1 + ". " + jenisMakanan.makanan);
            }
        }

        public static Makanan searchLinier(Makanan makananarr[], String cari) {
            int N = makananarr.length;
            for (int i = 0; i < N; i++)
                if (makananarr[i].kode.equals(cari)) {
                    return makananarr[i];
                }
            return null;
        }

    }
}
