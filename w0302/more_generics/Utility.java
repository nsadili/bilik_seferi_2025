package more_generics;

import java.util.Collection;

public class Utility {
    public static <T> int countIf(Collection<T> col, SpecificProperty<T> prop) {
        int count = 0;
        for (T elem : col)
            if (prop.test(elem))
                ++count;
        return count;
    }
}
