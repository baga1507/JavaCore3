import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args)
            throws InvocationTargetException, IllegalAccessException, ClassNotFoundException {
        Testing.start(TestTaker.class);
        System.out.println("--------------------------------------------------------------");
        Testing.start("TestTaker");
    }
}