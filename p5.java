import java.util.Scanner;
class p5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for( int i=0;i<=arr.length-1;i++){
            System.out.print("enter number :");
            arr[i]=sc.nextInt();
            
        } 
        for(int i=0; i<=arr.length;i++){
            if(arr[i]%5==0){               
                arr[i]=0;
            }
            System.out.println(arr[i]);
        }
    
        }
    }
