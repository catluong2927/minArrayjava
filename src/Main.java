import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr;
        System.out.println("nhập số lượng phần tử mảng: ");
        int n= sc.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.println("nhập giá trị phần tử thứ "+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        System.out.println("các phần tử mảng: ");
        for(int i=0;i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");
        int min = arr[0];
        for(int i=1;i<n;i++) {
            if (min > arr[i]) min = arr[i];
        }
        System.out.println("min: "+min);
    }
}