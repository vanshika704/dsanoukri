package Arrays.day1;

public class MoveZeroes {
    public static void main(String[] args) {
        int arr[] = {0,1,0,3,12};
        moveZeroes(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void moveZeroes(int arr[]){
        int writeIndex = 0;
        for(int readIndex=0;readIndex<arr.length;readIndex++){
            if(arr[readIndex] != 0){
                arr[writeIndex] = arr[readIndex];
                writeIndex++;
            }
        }
        while(writeIndex < arr.length){
            arr[writeIndex] = 0;
            writeIndex++;
        }
    }
}
