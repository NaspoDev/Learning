public class Main {
    public static void main(String[] args) {

        // Recursion: A method that calls itself.
        // (A general concept in all programming).

        sayHi(3);
    }

    private static void sayHi(int count) {
        System.out.println("Hi");

        // Recursive condition (base case)
        if (count <= 1) {
            return;
        }

        // Recursive call
        sayHi(count - 1);
    }
}