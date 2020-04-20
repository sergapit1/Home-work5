package by.academy.homework5;


import java.util.*;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class SearchMap implements ISearchEngine {
    static Map<String, Integer> map = new HashMap<>();

    private static Map<String, Integer> getMap(String text) {
      String[]  words = text.replaceAll("[ -.?!)(,:]+", " ").split("\\s");
     //^[a-zа-яё ] replaceAll("[ -.?!)(,:]+", " ").
       //System.out.println(Arrays.toString(words));
        for (String t : words) {
            if (map.containsKey(t))
                map.put(t, map.get(t) + 1);

            else
                map.put(t, 1);
        }
        return map;
    }

// подсчет повторений всех слов:
//        for (String word : words) {
//            if (!word.isEmpty()) {
//                Integer count = map.get(word);
//                if (count == null) {
//                    count = 0;
//                }
//                map.put(word, ++count);
//            }
//        }
//        for (String word : map.keySet()) {
//
//            System.out.println(word + ": " + map.get(word));
//        }
//        return map;
//    }

    @Override
    public void search(String text, String wordToSearch) {
        getMap(text);
        System.out.println("SearchMap: " + wordToSearch +": "+ map.get(wordToSearch));
    }
}
