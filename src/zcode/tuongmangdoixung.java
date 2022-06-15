package zcode;
import java.util.Scanner;
public class tuongmangdoixung {


        public static int n;
        public static int[] arr = new int[100000000];

    public static void main(String[] args){
            Scanner temp = new Scanner(System.in);
            int t = temp.nextInt();
            int x = 0;
            while(x++ < t){
                n = temp.nextInt();
                for(int i = 0; i < n; i++) arr[i] = temp.nextInt();
                System.out.println("Test "+x+":");
                slxh();
            }
        }
        public static void slxh(){
            for(int i = 0; i < n; i++){
                int d = 1, dem = 0;
                for(int j = 0; j < i; j++)
                    if(arr[i] == arr[j]){
                        d = 0;
                        break;
                    }
                if(d == 0)
                    continue;
                for(int j = i; j < n; j++)
                    if(arr[i] == arr[j])
                        dem++;
                System.out.println(arr[i] + " xuat hien " + dem +" lan");
            }
        }
    }

