package collections;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        // FileReader fr = null;
        // try {
        // fr = new FileReader("./data/names.txt");

        // System.out.println(fr.read());
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // } catch (IOException e) {
        // e.printStackTrace();
        // } finally {
        // try {
        // if (fr != null)
        // fr.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // }

        var coll = readWords("./data/names.txt");
        System.out.println(coll);

    }

    static Collection<String> readWords(String fileName) {
        // var words = new ArrayList<String>();
        // var uniqueWords = new HashSet<String>();
        // var uniqueWords = new LinkedHashSet<String>();
        var uniqueWords = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        try (
                FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr)) {
            String line = null;

            while ((line = br.readLine()) != null) {
                uniqueWords.add(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return uniqueWords;
    }
}
