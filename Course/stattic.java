class mobile{
    String brand;
    int price;
    static String name;

    public void show(){
        System.out.println(brand + " " + price + " " + name);
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

        obj1.show();
        obj2.show();
}
    
}
