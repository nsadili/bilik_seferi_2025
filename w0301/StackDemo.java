public class StackDemo {
    public static void main(String[] args) {

        Stack st = new Stack(2);

        // st.push(5);
        // st.push(2);
        // st.push(7);

        try {
            st.push(123);
            st.push(5);
            st.push(13);
            // System.out.println(st.peek());

            // System.out.println(st.pop());
        } catch (StackUnderflowException e) {
            System.out.println(e.getMessage());
        } catch (StackOverflowException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Partdadi ya partamadi?");
    }
}
