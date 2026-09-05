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

class multiD {
    public static void main(String[] args) {
        int nums[][] = new int[3][4];

        // adding random values to the arrays.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                // System.out.print(nums[i][j] + " ");

            }
            // System.out.println();

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }

        // enhanced for loop.. when no need of index

        for (int row[] : nums) {
            for (int col : row) {
                System.out.print(col + " .");
            }
            System.out.println();
        }

    }
}

// Jagged Array -- when rows are fixed and colums are not that is called jagged array in java.

class jaggA {
    public static void main(String[] args) {
        int nums[][] = new int[3][];
        nums[0] = new int[3];
        nums[1] = new int[2];
        nums[2] = new int[1];

        // adding random values to the arrays.
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                nums[i][j] = (int) (Math.random() * 10);
                // System.out.print(nums[i][j] + " ");

            }
            // System.out.println();

        }
        // for (int i = 0; i < 3; i++) {
        // for (int j = 0; j < 4; j++) {
        // System.out.print(nums[i][j] + " ");
        // }
        // System.out.println();
        // }

        // enhanced for loop.. when no need of index

        for (int row[] : nums) {
            for (int col : row) {
                System.out.print(col + " .");
            }
            System.out.println();
        }

    }
}


// 3D Array 

class threeD {
    public static void main(String[] args) {
        int nums[][][] = new int[3][4][5];

        // adding random values to the arrays.
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                for (int k =0; k < nums[i][j].length; k++ ){
                nums[i][j][k] = (int) (Math.random() * 10);
                }
                // System.out.print(nums[i][j] + " ");

            }
            // System.out.println();

        }
        for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums[i].length; j++) {
                    for (int k = 0; k < nums[i][j].length; k++) {
        System.out.print(nums[i][j][k] + " ");
                    }
        }
        System.out.println();
        }

        // enhanced for loop.. when no need of index

        // for (int row[] : nums) {
        //     for (int col : row) {
        //         System.out.print(col + " .");
        //     }
        //     System.out.println();
        // }

    }
}

//example

class Student{
    int roll;
    String name;
    int marks;
}

class stuArray{
    public static void main(String[] args) {
        
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

       s1.roll =1;
       s2.roll = 2;
       s3.roll = 3;
       s1.name ="Mani";
       s2.name = "Sundar";
       s3.name = "CH";

    //    System.out.println(s1);
       
       Student Students[] = new Student[3];
       Students[0]=s1;
       Students[1]=s2;
       Students[2]=s3;


       for(int i=0; i < Students.length; i++){
        System.out.println(Students[i].roll + "  " + Students[i].name);
       }

       //for each example a.k.a enhanced for loop
       for( Student s : Students){
        System.out.println(s.roll + " " + s.name);
       }
    }
}