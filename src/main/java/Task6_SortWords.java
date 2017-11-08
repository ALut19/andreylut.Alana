import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.util.Collections.sort;


public class Task6_SortWords{

    public static void main(String[] args) {
/*
    {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("C:\\Java\\andreylut\\src\\main\\java\\Attachments\\doc.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        List<String> wordsList = new ArrayList<>();
        Integer maxRepWorld = 0;

        Map<String, Integer> stat = new TreeMap<>();

        while (scanner.hasNext()) {
            String wordsFromDoc = scanner.useDelimiter("\\s+").next();
            Integer countWord = stat.get(wordsFromDoc);
            if (countWord == 0) {
                countWord = 0;
            }
            stat.put(wordsFromDoc, ++countWord);

            if (maxRepWorld < countWord){
                maxRepWorld = countWord;
                wordsList.clear();
                wordsList.add(wordsFromDoc);
            }
        }
        System.out.println(stat);
        System.out.println("Word that repeats most often is: " + wordsList);
        System.out.println("Word with maximum repeats: " + maxRepWorld);
    }*/
    }
}

