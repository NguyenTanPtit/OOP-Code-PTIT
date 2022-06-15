package zcode;
import java.util.Scanner;
public class sapxepchen {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int  key, j,k = 0;
        for (int i = 0; i < n; i++)
        {
            key = arr[i];
            j = i-1;
            while (j >= 0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
            System.out.print("Buoc "+ k++  +": ");
            for(int t = 0; t<k;t++){
                System.out.print(arr[t] +" ");
            }
            System.out.println();
        }   
    }
}
