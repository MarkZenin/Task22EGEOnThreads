import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ID id = new ID();
        System.out.println(id.getTime(1));
        System.out.println(id.getTime(2));
        System.out.println(id.getLength());
    }
}

