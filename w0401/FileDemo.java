package w0401;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {

        // File file = new File(
        // "../w0301/generics/src/MyStack.java");

        File file = new File(
                "C:\\Users\\nsadili\\OneDrive - ADA University\\Projects\\PashaBank Regional Project\\2025_1_Ganja\\course notes\\bilik_seferi_2025\\w0301\\generics\\src");

        System.out.println(file.getPath());
        System.out.println(file.getAbsolutePath());
    }
}
