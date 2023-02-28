public class ArraysLeftRotate {
    public static void main(String[] args) {
        leftRotate();
    }

    private static void leftRotate() {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int d = 3;

        //left rotate by d positions
        int temp[] = new int[arr.length];
        int k=0;

        for (int i = d; i < arr.length; i++) {
            temp[k] = arr[i]; 
            k++;   
        }

        for (int i = 0; i < d; i++) {
            temp[k] = arr[i];
            k++;
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
