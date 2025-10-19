package generics;

class NumericFunctions<T extends Number> {

    private T value;

    public NumericFunctions(T value) {
        this.value = value;
    }

    public double getReciprocal() {
        return 1.0 / value.doubleValue();
    }

    public double getFraction() {
        return value.doubleValue() - value.intValue();
    }

    public boolean equalsByAbsoluteValue(NumericFunctions<?> another) {
        return Math.abs(value.doubleValue()) == Math.abs(another.value.doubleValue());
    }
}

public class NumericDemo {
    public static void main(String[] args) {

        NumericFunctions<Float> obj = new NumericFunctions<>(2.5f);

        System.out.println(obj.getReciprocal());
        System.out.println(obj.getFraction());

        NumericFunctions<Double> obj2 = new NumericFunctions<>(2.5);

        System.out.println(obj.equalsByAbsoluteValue(obj2));

    }
}
