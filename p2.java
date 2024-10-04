
import java.util.Scanner;
class p3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size :");
        int n=sc.nextInt();
        int sum=0;
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("enter number :");
        arr[i]=sc.nextInt();
        }
        for(int i=0; i<=arr.length-1;i++){
            
            sum+=arr[i];
            
        }
        
        System.out.println("sum of even number :"+sum);
        }
    }
