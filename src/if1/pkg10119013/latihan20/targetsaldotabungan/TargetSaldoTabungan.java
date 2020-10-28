/*
 * NAMA  : Fiona Avila Putri
 * NIM   : 10119013
 * KELAS : IF1 2019/2020 (PBO1)
 */



package if1.pkg10119013.latihan20.targetsaldotabungan;

/**
 *
 * @author Fiona Avila
 */


public class TargetSaldoTabungan {

    public static void main(String[] args) {
        
        int i=1;
        int awal = 3500000;
        double besarBunga;
        double bunga = 0.08;
        
        do{
            besarBunga = awal * bunga;
            awal = (int) (awal + besarBunga);
            System.out.println("Saldo pada bulan ke-" + i + " Rp " + awal);
            i++;
        }while(awal<=6000000);
        
    }
    
}
