import java.util.Scanner;
class p1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arr size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<=arr.length-1;i++){
            System.out.println("enter number");
        arr[i]=sc.nextInt();
        }
        for(int i=0; i<=arr.length-1;i++){
            System.out.println(arr[i]);
        }
        }
    }
