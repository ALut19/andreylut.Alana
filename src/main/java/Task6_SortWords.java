import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Task6_SortWords{

    public static void main(String[] args) {
        Scanner scanner = null;
        String raz = null;

        try {
            scanner = new Scanner(new File("C:\\Users\\user\\IdeaProjects\\andreylut.Alana\\src\\main\\java\\Attachments\\doc.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> wordsList = new ArrayList<>();
        Integer maxRepWorld = 0;

        Map<String, Integer> stat = new TreeMap<>();
        new ArrayList<>(stat.keySet());

        while (scanner.hasNext()) {
            String wordsFromDoc = scanner.useDelimiter("\\s+").next();
            Integer countWord = stat.get(wordsFromDoc);

            if (countWord == null) {
                countWord = 0;
            }
            stat.put(wordsFromDoc, ++countWord);

            if (maxRepWorld < countWord) {
                maxRepWorld = countWord;
                wordsList.clear();
                wordsList.add(wordsFromDoc);
                if (maxRepWorld < 5 | maxRepWorld <= 1) {
                    raz = " раза";
                }else {
                    raz = " раз";
                }
            }
        }
        System.out.println(stat);
        System.out.println("Слово с максимальным количеством повторений: " + wordsList + ", встречается " + maxRepWorld + raz);

    }
}