class A{
    public void show(){
        System.out.println("Showing A");
    }

    public void config(){
        System.out.println("Showing A config");
    }
}
class B extends A{
    public void show(){
        System.out.println("Showing B");
    }
}
public class moveride {
    public static void main(String[] args) {
        
        B obj = new B();
        obj.show();
        obj.config();

        System.out.println(" Now from A");
        A obj1= new A();
        obj1.show();
    }
}
