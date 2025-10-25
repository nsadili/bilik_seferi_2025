package more_generics;

@FunctionalInterface
public interface SpecificProperty<T> {
    boolean test(T obj);
}
