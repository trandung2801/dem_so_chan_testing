import java.io.InputStream;
import java.util.Scanner;

public class main {
    public static int dem_so_chan(int n) {
        if(n < 0) {
            return 0;
        }
        if(n == 0) {
            return 1;
        }
        int count = 0;
        for(int i = 0; i < n; i ++) {
            if(i%2 == 0) {
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Nhập số nguyên n:");
        InputStream stream = System.in;
        Scanner scanner = new Scanner(stream);

        n = scanner.nextInt();

        System.out.println("Có " + dem_so_chan(n) + " số chẵn nhỏ hơn " + n);
    }
}
