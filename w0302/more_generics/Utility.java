package more_generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Utility {

    public static <T> int countIf(Collection<T> col, SpecificProperty<T> prop) {
        int count = 0;
        for (T elem : col)
            if (prop.test(elem))
                count++;
        return count;
    }

    public static <T> List<T> filter(Collection<T> col, SpecificProperty<T> prop) {
        List<T> result = new ArrayList<>();
        for (T elem : col)
            if (prop.test(elem))
                result.add(elem);

        return result;
    }
}
