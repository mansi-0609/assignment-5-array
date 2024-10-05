import java.util.Scanner;
class p6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter arr size :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("enter number :");
        arr[i]=sc.nextInt();
        }
        System.out.println("--------------------");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("--------------------");
        int temp=0;
        for( int i=0; i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
            temp=arr[i];
             arr[i]=arr[j];
            arr[j]=temp;
            }
           }System.out.print(arr[i]+" ");
           
        }
       
    }
}

