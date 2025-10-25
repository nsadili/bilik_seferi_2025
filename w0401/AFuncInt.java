package w0401;

@FunctionalInterface
public interface AFuncInt {
    void apply(String str);

    // class level methods
    static void print(String str) {
        System.out.println("Inside static method: " + str);
        // the chances are when print method is called,
        // no instance was create before, therefore,
        // concatTwoStrs cannot be invoked from print
        // concatTwoStrs("A", "B"); //compile error
    }

    // instance level methods
    default void print(String str1, String str2) {
        System.out.println("Inside default method: " + concatTwoStrs(str1, str2));
    }

    // instance level methods
    private String concatTwoStrs(String str1, String str2) {
        return str1 + "#" + str2;
    }
}
