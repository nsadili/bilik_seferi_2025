package w0402;

import java.util.Arrays;
import java.util.function.Consumer;

public class MethodReferenceDemo {

    void fancyPrint(String str) {
        System.out.println("***" + str + "***");
    }

    static void beautyPrint(String str) {
        System.out.println("###" + str + "###");
    }

    public static void main(String[] args) {
        var dummyObj = new MethodReferenceDemo();

        String[] nameList = new String[] { "Kenan", "Munise", "Reshad", "Orxan", "Gulmira" };

        // printAll(nameList, (str) -> System.out.println(str));
        // printAll(nameList, dummyObj::fancyPrint);
        printAll(nameList, MethodReferenceDemo::beautyPrint);

    }

    static void printAll(String[] names, Consumer<String> printer) {
        for (var name : names) {
            printer.accept(name);
        }
    }
}
