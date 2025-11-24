
package tugas;
import java.util.Scanner;

public class mencariarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
       
        System.out.print("Input jumlah element Array: ");
        int n = input.nextInt();
        
        int[] arr = new int[n];
        
   
        System.out.println("Input " + n + " angka (dipisah dengan enter):");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        
              System.out.print("Input angka yang akan dicari: ");
        int cari = input.nextInt();
        
        int indexDitemukan = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == cari) {
                indexDitemukan = i;
                break;
            }
        }
        
      
        if (indexDitemukan != -1) {
            System.out.println("Angka ditemukan pada index ke-" + indexDitemukan);
        } else {
            System.out.println("Angka tidak ditemukan");
        }
    }
}