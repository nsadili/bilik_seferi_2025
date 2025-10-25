package w0401;

public class FuncIntDemo {
    public static void main(String[] args) {
        // AFuncInt.print("test");

        MyImpl impl1 = new MyImpl();
        // impl1.apply("Salam");

        AFuncInt impl2 = new AFuncInt() {
            @Override
            public void apply(String str) {
                System.out.println("Inside apply method of Anonymous implementation: " + str);
            };
        };

        // System.out.println(impl1.getClass().getName());
        // System.out.println(impl2.getClass().getName());

        // impl2.apply("SALAM");
        // impl2.print("salam", "gence");

        AFuncInt impl3 = 
            (str) -> System.out.println("Inside apply method of lambda: " + str);
        // impl3.apply("hello");

        AFuncInt impl4 = str -> {
            System.out.println("Salam eleykim");
            System.out.println("Inside apply method of lambda 2: " + str);
        };

        impl4.apply("Gence");
    }

}

class MyImpl implements AFuncInt {

    @Override
    public void apply(String str) {
        System.out.println("Inside apply method of MyImpl implementation: " + str);
    }

    @Override
    public void print(String str1, String str2) {
        System.out.println("Inside default method of MyImpl implementation: "
                + str1 + "*" + str2);
    }

}