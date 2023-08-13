import java.util.Scanner;

public class Pattern14 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int osp = n-1;
        int m = (n*2)-1;
        for(int i = 1;i<=m;i++)
        {
            for(int j = 1;j<=osp;j++)
            {
                System.out.print("\t");
            }
            for(int j = 1;j<=nst;j++)
            {
                System.out.print("*\t");
            }
            if(i<n) {
                nst++;
                osp--;
            }
            else {
                nst--;
                osp++;
            }
            System.out.println();
        }
    }
}
