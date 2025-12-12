package Arrays.level0;

public class FindMax {
    public static void main(String[] args) {
        int arr[]=  new int []{1,3,4,5,7,2};
        int max = 0;;
        for(int num:arr){
            if(num>max){
                max= num;
            }
        }
        System.out.println(max);
    }
    
}
