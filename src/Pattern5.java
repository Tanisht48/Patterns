import java.util.Scanner;

public class Pattern5 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nsp = 1;
        int nst = n;

        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<nsp;j++)System.out.print("\t");
            for(int j = 1;j<=nst;j++)System.out.print("*\t");
            System.out.println();
            nsp++;
            nst--;

        }
    }
}
