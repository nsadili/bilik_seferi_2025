package more_generics;

public class OddProperty implements SpecificProperty<Integer> {
    public boolean test(Integer obj) {
        return obj % 2 != 0;
    }
}
