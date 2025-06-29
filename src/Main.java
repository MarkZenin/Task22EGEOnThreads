import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ID id = new ID();
        System.out.println(id.getTime(1));
        System.out.println(id.getTime(2));
        System.out.println(id.getLength());
        for (int i = 0; i < id.getLength(); i++) {
            Thread thread = new Thread(String.valueOf(i));
        }
        Integer n;
        while ((n = id.getNextFollowedID(6)) != 0) System.out.println(n);
    }
}

