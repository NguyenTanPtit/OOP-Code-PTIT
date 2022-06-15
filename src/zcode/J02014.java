package zcode;

import java.util.Scanner;

public class J02014 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int x = 1;
        while(t-->0){

            int n = sc.nextInt();
            int [] arr = new int[n+1];
            int [] arr1 = new int[n+1];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                arr1[i] = 1;
            }
            System.out.println("Test " + x++  +":");
            for(int i=0;i<n;i++){
                int dem = 1;
                if(arr1[i] == 1){
                    arr1[i] = 0;
                    for(int j = i+1;j<n;j++){
                        if(arr[i] == arr[j]) {
                            arr1[j] = 0;
                            dem++;
                        }

                    }
                    System.out.println((arr[i]) + " xuat hien "+ dem +" lan");
                }

            }
        }
    }
}

