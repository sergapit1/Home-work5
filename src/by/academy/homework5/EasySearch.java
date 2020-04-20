package by.academy.homework5;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class EasySearch implements ISearchEngine {

    @Override
    public void search(String text, String wordToSearch) {
        int count = 0;

          text = text.replaceAll("[ ,.!-?]", " ");

                for (int i = 0; i < text.length(); i++) {
                  if (text.indexOf(wordToSearch,i) != -1){
                count ++;

                      i=text.indexOf(wordToSearch, i);
            //   System.out.println(count);
            }
        }
        System.out.println("EasySearch: " + wordToSearch + ": "+ count);
    }
}