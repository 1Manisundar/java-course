public class inherit {
    public static void main(String[] args) {
        advcalc obj = new advcalc();
        int r1 = obj.add(2,3);
        int r2 = obj.sub(7, 6);
        int r3 = obj.multi(2,5);
        int r4 = obj.div(5,5);
        System.out.println(r1 + " "+ r2 + " " + r3 + " "+ r4);
    }
}
