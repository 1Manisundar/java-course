class World
{
    public static void main(String a[]) {
        System.out.println("Hehe just printing bro");  

        int num1 = 10;
        int num2 = 5;

        int result = num1+num2;

        System.out.println(result);

        //literals done

        byte b =127;
        int a1 = 23;
        // System.out.println(b);
        // System.out.println(b=(byte)a1);
        // System.out.println(b);
        // System.out.println(a1);


            
        //Operators


        // int n1 = 5;
        // // int n2 = 50;

        // // int res = n1+n2;
        // // n1=+2;
        // if(n1<50){
        //     // return true; why cant we use, how to return bool when in void.
        //     System.out.println("True");
        // }else{
        //     // return false;
        //     System.out.println("false");
        // }

        // // System.out.println(n1);

        // while(n1<50){
        //     n1++;
        //     // System.out.println(n1);
        // }

        // //print even numbers
        // int n2=0;
        // while(n2<100){
        //     n2++;
        //     if(n2 % 2 == 0){
        //     // System.out.println("Even"+ n2);
        //     }
        //     // else{
        //     // System.out.println("odd"+ n2);

        //     // }

        // }

        int num3= 40;
        int num4 =40;
        if(num3 > num4 ){
            System.out.println(num3+"is larger");
        }else if(num4> num3){
            System.out.println(num4+"is larger");
        }else{
            System.out.println("equal number");
        }

        int num = 150;

        if(num < 10 || num >100){
            System.out.println("outside range");
        }else{
            System.out.println("inside range");

        }
    }
}

class SwitchExample{
    public static void main(String a[]){
        int x = 10;
        switch (x) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesady");
                break;

            case 3:
                System.out.println("wedday");
                break;

            case 4:
                System.out.println("thurday");
                break;

            case 5:
                System.out.println("friday");
                break;

            case 6:
                System.out.println("saturday");  
                break;

            default:
                System.out.println("no day");
                break;
        }
    }
}


class  loops{

    public static void main(String[] args) {
        int i =1;

        do{
            // System.out.println("Hii");
            
            // int j=1;
            // while (j<=5){
            //     System.out.println("Bro how r u");
            //     j++;
            // }
            i++;

            /** While loop : if condition is satisfied complete loops runs until the conidtion not statisfies
             * 
             * do While loop : even if the condition is not satisfied and want to run the logic atleast once do while is useful.
             */

        }while (i<=10);

        main1(args);
    }

    public static void main1(String[] args) {

        for(int a=1; a<=7; a++){
            System.out.println("Day " + a);

            for(int j=1; j<=9;j++){
                System.out.println("    "+"Time" + "--" + (j+8) + "-" + (j+9));
            }
        }
    }


}


// objects oriented programming.

// creating and using classes.
class objects{

    public static void main(String[] args) {
        
        calculator calc = new calculator();

        int addition = calc.add(2,4);

        System.out.println(addition);
        
    }
}

class calculator{

    public int add(int n1, int n2){
        int res = n1+n2;
        return res;
    }
}