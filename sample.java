import java.util.Scanner;

import Normal.palindrome;
public class sample{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[][] A= new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                A[i][j]=sc.nextInt();
            }
        }
        int[][] B= new int[3][3]; 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                B[i][j]=sc.nextInt();
            }
        }
          int[][] C= new int[3][3]; 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=sc.nextInt();
            }
        }
        int[][] AB=mutiMax(A,B);
        int[][] ABC=mutiMax(AB,C);
        printMax(AB);
        printMax(ABC);
    }


   public static int[][] mutiMax(int[][] A,int[][] B){
    int[][] result =  new int[3][3];
    for(int i=0;i<3;i++){
        for(int j=0;j<3;i++){
            int sum=0;
            
        }
    }
   }
}