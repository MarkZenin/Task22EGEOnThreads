import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ID {
    private final Map<Integer, Map<Integer, List<String>>> IDs = new HashMap<>();
    private final Integer length;
    public ID() throws FileNotFoundException {
        length = fill();

    }

    public Integer getLength() {
        return length;
    }

    private int fill() throws FileNotFoundException {
        int l = fill0();
        if (IDs.size() != 0) return l;
        throw new RuntimeException("Проверьте файл!\n\rКоллекции не заполнены!");
    }


    private int fill0() throws FileNotFoundException {
        int l = 0;
        var reader = new BufferedReader(new FileReader("/Users/mrm/22.txt"));
        try {
            reader.readLine();
            String[] split;
            Map<Integer, List<String>> tafIDs = new HashMap<>();

            while (reader.ready()) {
                l++;
                split = reader.readLine().split(" ");

                tafIDs.put(Integer.parseInt(split[1]), List.of(split[2].split(";")));
                IDs.put(Integer.parseInt(split[0]), tafIDs);
                tafIDs = new HashMap<>();
            }
        } catch (IOException e) {
            throw new FileNotFoundException("Проверьте путь к файлу!\n\rФайл не найден");
        }
        return l;
    }

    public Integer getTime(Object key) {
        return IDs.get(key).keySet().iterator().next();
    }
}
