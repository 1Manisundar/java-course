public class string {
    public static void main(String[] args) {

        String name = "Mani";
        System.out.println("Hi " + name);

        // adding.
        name = name + "Sundar";
        System.out.println("Hi " + name);

        // as string is a class also declare like new class()....

        String name1 = new String("Sundar");

        System.out.println(name1 + " Hello");

        // string constant pool??

        // In java when ever we create a varibles with same string such as "Mani" 2
        // times the system will check for any existing data with same string if not it
        // will create a new one. once present it will refer the same address to the
        // other strings when accessed instead of creating new address to save memory.

        String test1 = "Mani";
        String test2 = "Mani";
        System.out.println("Check ..." + test1 + "  " + test2 + "  " + test1.hashCode() + "  " + test2.hashCode());

        // so if we add/concat to a new string it will be creating a new address in string pool and the older address will be left for garbage collector.

        test1 = test1+ "Sundar";
        System.out.println(test1 + "  "+ test1.hashCode());


        //Types of strings ??

        //Mutable string (Can change) -- String Buffer & builder useful. it will 16 buffer size.
        //Immutable strings(can't change)

        StringBuffer sb = new StringBuffer("Mani");
        System.out.println(sb + " "+ sb.hashCode());

        sb.append(" S undar");

        System.out.println(sb + " " + sb.hashCode()); // it will be havin same address.


    }
}