public class Main {

    public static void main(String[] arguments) {
        throw new RuntimeException("Catch me, if you can!");
    } catch (RuntimeException re) {
        System.out.println("Caught runtime exception!");
    }
}
