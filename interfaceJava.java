interface interface1 {
    void method1();
}
public class  interfaceJava {
    public static void main(String[] args) {
        interface1 obj = new interface1() {
            @Override
            public void method1() {
                System.out.println("Method2 implementation");

            }
        };
        obj.method1();


    
    }

}