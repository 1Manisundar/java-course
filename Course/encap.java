class values{
    private int age;
    private String name;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

        public void setName(String name){
        this.name =name;
    }
    public void setAge(int a){
        age =a;
    }
}

public class encap {

    public static void main(String[] args) {
   
            values v = new values();
            v.setAge(26);
            v.setName("maniii");
    // String name1 = values.name; // Can't access cuz of private values.
    // int age1 = values.age;

    System.out.println(v.getName() + " : "+ v.getAge());


    }

    // encapsulation with setters and getters. "What is "this" for reference varibles"
        
}
