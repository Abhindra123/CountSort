import java.util.Scanner;

public class CountSort {
    public static void countSort(int arr[],int max){
        int count[]=new int[max+1];

        for(int i=0;i<arr.length;i++){
        count[arr[i]]++;

        }
        for(int i=0;i<max+1;i++){
            for(int j=0;j<count[i];j++){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array : " );
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        //int res[]=
                countSort(arr,max);
//        for(int i=0;i<res.length;i++){
//            System.out.println(res[i]);
//        }

    }
}