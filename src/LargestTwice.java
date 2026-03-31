import java.util.Scanner;
public class LargestTwice {

        static Scanner sc = new Scanner(System.in);
        
        public static int[] arrInput(int n){
                int[] arr = new int[n];
                for(int i=0; i<n; i++){
                        arr[i]= sc.nextInt();
                }
                return arr;
        }

        public static int largestTwice(int[] arr){
                int large1 = -1;
                int large2 = -1;
                int index = -1;
                for(int i=0; i<arr.length; i++){
                        if(arr[i]>large1){
                                large2 = large1;
                                large1 = arr[i];
                                index = i;
                        }
                        else if(arr[i] > large2){
                                large2 = arr[i];
                        }
                }
                if(large1 >= 2*large2)
                        return index;
                else
                        return -1;
        }

        /*public static void largestTwice(int[] arr1, int[] arr2){
                int f=0;
                int n = arr1.length;
                for(int i=0; i<n; i++){
                        if(i == arr2[1])
                                continue;
                        if(arr2[0] < 2*arr1[i]){
                                f = 1;
                                break;
                        }
                }
                if(f==0)
                        System.out.println(arr2[1]);
                else
                        System.out.println("-1");
        }
                */
        // TODO: Read n
        // TODO: Read array elements
        // TODO: Find the largest element and its index
        // TODO: Check if largest >= 2 * every other element
        // TODO: Print index or -1
        public static void main(String[] args) {
                int n = sc.nextInt();
                int[] arr = arrInput(n);
                System.out.println(largestTwice(arr));
        }
}