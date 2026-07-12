import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

public class ID {
    private final Map<Integer, Map<Integer, List<Integer>>> IDs = new HashMap<>();
    private final int length;


    public ID() throws FileNotFoundException {
        length = fill();
    }

    public int getLength() {
        return length;
    }

    public int getTime(int id) {
        return IDs.get(id).keySet().iterator().next();
    }

    public int getNextFollowedID(int id) {
        return IDs.get(id).entrySet().iterator().next().getValue().iterator().next();
                //stream().max(Comparator.comparingInt(ids -> IDs.get(ids).entrySet().iterator().next().getKey())).get();
    }

    private int fill() throws FileNotFoundException {
        int l = fill0();
        if (IDs.size() != 0) return l;
        throw new RuntimeException("Проверьте файл!\n\rКоллекции не заполнены!");
    }

    private int fill0() throws FileNotFoundException {
        int l = 0;
        BufferedReader reader = new BufferedReader(new FileReader("/Users/mrm/22.txt"));
        try {
            reader.readLine();
            String[] split;
            Map<Integer, List<Integer>> tafIDs = new HashMap<>();

            while (reader.ready()) {
                l++;
                split = reader.readLine().split(" ");

                tafIDs.put(Integer.parseInt(split[1]), Arrays.stream(split[2].split(";")).
                        map(Integer::parseInt).toList());
                IDs.put(Integer.parseInt(split[0]), tafIDs);
                tafIDs = new HashMap<>();
            }
        } catch (IOException e) {
            throw new FileNotFoundException("Проверьте путь к файлу!\n\rФайл не найден");
        }
        return l;
    }
    private int walkMaxTime(int key, int sum) {
        IDs.get(key)
    }
}


