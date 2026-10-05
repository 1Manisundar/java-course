/**
 * constructor
 */
class constructor {

    // public constructor() {
    //     System.out.println("Hi from cons");
    //     age= 21;
    //     name = "Sundar";
    // }

    public constructor(int a, String n) { //param const
        System.out.println("Hi from cons");
        age= a;
        name = n;
    }

    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int a) {
        this.age = a;
    }

    // public constructor() {
    // }

}

public class consDemo {
    public static void main(String[] args) {

        constructor obj = new constructor();
        System.out.println("HI");
        // obj.setAge(20);
        // obj.setName("Mani Bro");
        System.out.println(obj.getName() + " " + obj.getAge());


        constructor obj1 = new constructor(30, "Mani");
        System.out.println(obj1.getName() + " " + obj1.getAge());
        
    }
}







// Basic construtor, consturctor with params passing.