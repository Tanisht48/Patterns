import java.sql.SQLOutput;
import java.util.Scanner;

public class Pattern4 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = n;
        int nst = 1;

        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<nsp;j++)System.out.print("\t");
            for(int j = 1;j<=nst;j++)System.out.print("*\t");
            System.out.println();
            nsp--;
            nst++;

        }
    }
}
