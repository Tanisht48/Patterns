import java.util.Scanner;

public class Pattern11 {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int osp = n-1;
        int nstisp = 1;
        for(int i = 1;i<=n;i++)
        {
            for(int j = 1;j<=osp;j++)
            {
                System.out.print("\t");
            }
            for(int j = 1;j<=nstisp;j++)
            {
                if(j%2!=0) {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            osp--;
            nstisp+=2;
            System.out.println();
        }

    }
}
