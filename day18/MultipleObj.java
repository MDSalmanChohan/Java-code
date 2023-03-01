public class MultipleObj {
    int x=15;

    public static void main(String[] args) {
        MultipleObj myObj1 = new MultipleObj();
        MultipleObj myObj2 = new MultipleObj();
        myObj2.x = 79;
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);

    }
    
}
