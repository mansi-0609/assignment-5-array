import java.util.Scanner;
class p7{
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
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Enter a number to search: ");
        int num=sc.nextInt();
        int low=0;
        int high=arr.length-1; 
        boolean flag=false;
        for(int i=low;i<=high-1;i++) { 
           int mid=(low+high)/2;   
            if(arr[mid]==num) { 
                flag=true;
                break;
        }
            else if(arr[mid]>num){
                high=mid;
            }
            else {
                low=mid;
            }
        }
            if(!false){
             System.out.println("not found");   
            }
           
    }
}



