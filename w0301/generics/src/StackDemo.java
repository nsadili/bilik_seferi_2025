public class StackDemo {
    public static void main(String[] args) {
        MyStack<Number> sst = new MyStack<>(10);
//        MyStack<String> st = new MyStack<>(10);
        sst.push(2.5);
        sst.push(2);

        System.out.println(sst.pop());
//        MyStack st = new MyStack(2);

        // st.push(5);
        // st.push(2);
        // st.push(7);

//        try {
//            st.push(123);
//            st.push(5);
//            st.push(13);
//            // System.out.println(st.peek());
//
//            // System.out.println(st.pop());
//        } catch (StackUnderflowException | StackOverflowException e) {
//            System.out.println(e.getMessage());
//        }

        System.out.println("Partdadi ya partamadi?");
    }
}
