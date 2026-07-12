import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static ID id;

    static {
        try {
            id = new ID();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<TimerThreads> threads = new ArrayList<>();
        for (int i = 1; i < id.getLength(); i++)
            threads.add(new TimerThreads(i, id, false));
        getRootFollowedID(7, 0);
        threads.forEach(thread -> {
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(thread.getTime());
        });
    }
    public static int getRootFollowedID(int key, int sum) {
        if (id.getNextFollowedID(key) != 0)
            return getRootFollowedID(id.getNextFollowedID(key), sum += id.getTime(key));
        return sum + id.getTime(key);
    }
}

