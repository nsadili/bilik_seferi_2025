package more_generics;

public class EvenProperty implements SpecificProperty<Integer> {
    public boolean test(Integer obj) {
        return obj % 2 == 0;
    }
}
