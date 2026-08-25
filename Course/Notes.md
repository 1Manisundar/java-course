### Method Overloading:

In java we can use the same method name multiple and can pass the multiple values for it. 

#### Def : 
Method overloading is an object-oriented programming feature where a class has multiple methods with the same name but different parameters (by count, type, or order).

##### for example :


```
class calculator {

    public int add (int n1, int n2, int n3){
        return n1+n2+n3;
    }

    public int add (int n1, int n2){
        return n1+n2;
    }

}
class Main {
    public static void main(String[] args) {
     
     calculator calc = new calculator();

     int r1 = calc.add(1,2,3);

     System.out.println("Additon of 3 num: " +r1);

     int r2 = calc.add(3,4);

     System.out.println("Addition of 2 num: " + r2);

    }
}
```
