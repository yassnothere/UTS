import java.util.Scanner;

public class UTSPajak01{
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        System.out.println("Masukkan Nama ");
        String Nama = input01.nextLine();
        System.out.println("Apakah Anda memiliki Usaha? ");
        String memilikiUsaha = input01.nextLine();

        if (memilikiUsaha.equalsIgnoreCase("Iya")){
        double penghasilan, pajak;
        int pajakPenghasilan = 0;
        System.out.println("Masukkan besaran penghasilan dalam 1 Tahun : ");
        penghasilan = input01.nextDouble();
        pajak = 0.15;
        pajakPenghasilan = (int) (penghasilan * pajak );
        System.out.println("Total Pajak penghasilan yang harus dibayarkan adalah : " + pajakPenghasilan );
        }
        else if (memilikiUsaha.equalsIgnoreCase("Tidak")) {
        System.out.println("Maka Pajak penghasilan Anda adalah : 0");
        }

        System.out.println("Masukkan total jumlah harta anda yang Bergerak dan Tidak Bergerak ");
        int jumlahHarta = input01.nextInt();
        input01.nextLine();
        double totalHarta = input01.nextDouble();
        for (int i = 0; i < jumlahHarta; i++) {
            System.out.println("Masukkan nama harta " + (i + 1) + ":");
            String namaHarta = input01.nextLine();
            System.out.println("Masukkan nilai jual " + namaHarta + ":");
            double nilaiJual = input01.nextDouble();
            input01.nextLine();
            totalHarta += nilaiJual;
        }
        System.out.println("Apakah Anda sudah berkeluarga? (ya/tidak)");
        String berkeluarga = input01.nextLine();  
        
        double potonganPajak = 0;
        if (berkeluarga.equalsIgnoreCase("ya")) {
            System.out.println("Berapa anak Anda yang berstatus kuliah?");
            int anakKuliah = input01.nextInt();
            
            System.out.println("Berapa anak Anda yang berstatus SMA?");
            int anakSMA = input01.nextInt();
            
            if (anakKuliah == 1 && anakSMA == 1 && totalHarta >= 50000000) {
                potonganPajak = 0.10;
            } else if (anakKuliah == 0 && anakSMA == 0 && totalHarta < 50000000) {
                potonganPajak = 0.05;
            }
        }
        
        double totalPajak = (totalHarta) * (1 - potonganPajak);
        
        System.out.println("Total pajak yang harus Anda bayar: Rp" + totalPajak);
    }
}

    
