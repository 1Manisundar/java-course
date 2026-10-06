class mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name);
    }

    //static method
    public static void show1(mobile obj){
        System.out.println(name+ "   this is inside staic method :>>" +"  "+ obj.brand+"   "+ " "+ obj.price); // static method can't use non static varibles.
        // we can still use the instance varibles by passing the direct methods.
    }

    public mobile(){
        brand ="Mani";
        price=9999;
        System.out.println("in construtor");
    }

    static{
        name="my phone";
        System.out.println("in static");
    }
}

public class stattic {

public static void main(String[] args) {
        mobile obj1 = new mobile();
        obj1.brand ="apple";
        obj1.price=9999;
        // obj1.name="16 pro"; //If we try to call the values with basic object for static variables.
        mobile.name="16 pro";

        mobile obj2 = new mobile();
        obj2.brand="samsung";
        obj2.price=999;
        // obj2.name="s23";
        mobile.name="s23";

        mobile obj3 = new mobile();
        System.out.println(obj3.brand+"      not assigning any just calling defult");

        obj1.show();
        obj2.show();

        obj1.show1(obj1);
        mobile.show1(obj2);

}
    
}


// question??? why we using static for main method?? deadlock here?

//notes: if methods are not instantiated then static block wont be called. so we need to call class of class using exception to instaniate static block.