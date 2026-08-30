// Arrays
public class arrays {
    public static void main(String[] args) {
        int num[] = new int[5];

        num[0] = 3;
        num[1] = 6;
        num[2] = 9;
        num[3] = 20;
        num[4] = 34;

        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
        int num1[] = { 2, 3, 5, 6, 7 };
        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println("2nd array values : " + num1[i1]);
        }
    }
}

// Multi Dimensional array

class multiD{
    public static void main(String[] args) {
        int nums [][]= new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0; j<4; j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}