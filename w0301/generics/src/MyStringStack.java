public class MyStringStack {

    private String[] elements;
    private int capacity;
    private int index;

    public MyStringStack(int capacity) {
        if (capacity <= 0)
            throw new IllegalArgumentException(capacity + " is not allowed!");
        this.capacity = capacity;
        this.index = -1; // top element
        this.elements = new String[capacity];
    }

    public boolean isEmpty() {
        return this.index == -1;
    }

    public boolean isFull() {
        return this.index == capacity - 1;
    }

    public String peek() {
        // TODO: what if the stack is empty? index == 1?
        if (this.isEmpty())
            throw new StackUnderflowException("Stack is empty");
        return elements[index];
    }

    public String pop() {
        // TODO: what if the stack is empty? index == -1?
        var topEl = "";
        try {
            topEl = elements[index--];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new StackUnderflowException(e);
        }

        return topEl;
    }

    public void push(String el) {
        // TODO: what if the stack is full? index == capacity-1?

        if (this.isFull())
            throw new StackOverflowException("Stack is full");

        elements[++index] = el;
    }

    public void __print() {
        if (this.isEmpty()) {
            System.out.println("Empty stack.");
            return;
        }
        System.out.print("Bottom");
        for (int i = 0; i <= index; i++) {
            System.out.print(" || " + elements[i]);
        }
        System.out.println(" || Top");
    }


}
