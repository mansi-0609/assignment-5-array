import java.util.Scanner;
class p3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size :");
        int n=sc.nextInt();
        int odd=0, even=0;
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.print("enter number :");
        arr[i]=sc.nextInt();
        }
        for(int i=0; i<=arr.length-1;i++){
            if(arr[i]%2==0){
            even+=arr[i];
            }
            else{
            odd+=arr[i];
            }       
        }
        System.out.println("sum of odd number :"+odd);
        System.out.println("sum of even number :"+even);
        }
    }
