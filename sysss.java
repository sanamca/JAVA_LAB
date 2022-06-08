;'import java.util.Scanner;

class sysss
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of the Matrix");
        int n = in.nextInt();
        
        int a[][] = new int[n][n];
        System.out.println("Enter all the elements of matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
        
        int flag = 1; 
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if(a[i][j] != a[j][i])
                {
                    flag = 0;
                    break;
                }
            }
        }
        
        if(flag == 1)
            System.out.println("It is a Symmetric Matrix");
        else
            System.out.println("It is not a Symmetric Matrix");
    }
}