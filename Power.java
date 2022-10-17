import java.util.Scanner;

public class Power {
    public static void  main(String[]args)
    {
        System.out.println("Enter Numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int result = pow(x,n);
        System.out.println(x+"^"+n+"="+result);
    }
    private static int pow(int x, int n){
        if (n==0)
            return 1;
        if (n==1)
            return x;
        if (n%2 == 0)
            return pow(x, n/2)*pow(x,n/2);
        else
            return pow(x,(int) (n/2))*pow(x, n-(int) (n/2));
    }

}
