import java.util.*;
import java.util.Scanner;
 
public class MulMatrix{  
  public static void main(String args[]){  
 
    
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
   
    
        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];
 
        System.out.println("Enter values for matrix A : \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                a[i][j] = sc.nextInt();
        }
        System.out.println("Enter values for matrix B : \n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) 
                b[i][j] = sc.nextInt();
        }
 
        System.out.println("Matrix addition is : \n");
        for(int i = 0; i < n; i++) {    
            for(int j = 0; j < n; j++){    
                   
                   
                c[i][j] = a[i][j] +b[i][j];   
                
              
              System.out.print(c[i][j] + " ");  
            }
            System.out.println();
        
    }
  }
}
