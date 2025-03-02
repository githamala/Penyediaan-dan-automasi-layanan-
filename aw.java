import java.util.Scanner;

public class aw {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input pemesan
        System.out.print("Masukkan nama pemesan: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan jam pemesanan: ");
        int jamPesan = input.nextInt();
        System.out.print("Masukkan menit pemesanan: ");
        int menitPesan = input.nextInt();
        
        // Input pesanan
        System.out.print("Masukkan nama makanan pertama: ");
        String pesanan1 = input.next();
        System.out.print("Masukkan harga makanan pertama: ");
        long harga1 = input.nextInt();
        System.out.print("Masukkan jumlah makanan pertama: ");
        long jumlah1 = input.nextInt();
        
        System.out.print("Masukkan nama makanan kedua: ");
        String pesanan2 = input.next();
        System.out.print("Masukkan harga makanan kedua: ");
        long harga2 = input.nextInt();
        System.out.print("Masukkan jumlah makanan kedua: ");
        long jumlah2 = input.nextInt();
        
        System.out.print("Masukkan nama makanan ketiga: ");
        String pesanan3 = input.next();
        System.out.print("Masukkan harga makanan ketiga: ");
        long harga3 = input.nextInt();
        System.out.print("Masukkan jumlah makanan ketiga: ");
        long jumlah3 = input.nextInt();
        
        System.out.print("Masukkan nama makanan keempat: ");
        String pesanan4 = input.next();
        System.out.print("Masukkan harga makanan keempat: ");
        long harga4 = input.nextInt();
        System.out.print("Masukkan jumlah makanan keempat: ");
        long jumlah4 = input.nextInt();
        
        System.out.print("Masukkan waktu proses memasak (dalam menit): ");
        int prosesMasak = input.nextInt();
        
        // Header struk
        System.out.println("====================================================================");
        System.out.printf("%69s%n", "KATSU GKM FILKOM UB");
        System.out.printf("%69s%n", "Pemesan : " + nama);
        System.out.printf("%69s%n", "Jam : " + jamPesan + " Menit : " + menitPesan);
        System.out.println();
        
        // Detail pesanan
        System.out.printf("%-3s| %-25s | %-15s | %-15s |%n", "No.", "Nama Makanan", "Kuantitas", "Harga");
        System.out.printf("%-3s| %-25s | %-15d | %-15d |%n", "1.", pesanan1, jumlah1, harga1);
        System.out.printf("%-3s| %-25s | %-15d | %-15d |%n", "2.", pesanan2, jumlah2, harga2);
        System.out.printf("%-3s| %-25s | %-15d | %-15d |%n", "3.", pesanan3, jumlah3, harga3);
        System.out.printf("%-3s| %-25s | %-15d | %-15d |%n", "4.", pesanan4, jumlah4, harga4);
        System.out.println();
        
        // Perhitungan total harga dan konversi yen
        long totalHarga = harga1 * jumlah1 + harga2 * jumlah2 + harga3 * jumlah3 + harga4 * jumlah4;
        double yen = (double) totalHarga / 103;
        int menitTotal = menitPesan + prosesMasak;
        int menitSelesai = menitTotal % 60;
        int jamSelesai = jamPesan + menitTotal / 60;
        
        // Output total harga dan waktu selesai
        System.out.printf("%49s| Rp. %d%n", "Total Harga", totalHarga);
        System.out.printf("%49s| %.2f %s%n", "Konversi Yen", yen, "Yen");
        System.out.println();
        System.out.printf("%69s%n", "Jam : " + jamSelesai + " Menit : " + menitSelesai);
        System.out.println("====================================================================");
        
        input.close();
    }
}