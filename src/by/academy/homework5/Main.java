package by.academy.homework5;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
        String file = readAllBytesJava7("c:\\Users\\home\\Desktop\\warandpeace.txt");
        file = file.toLowerCase();


        EasySearch find = new EasySearch();
        find.search(file, " мир ");
        find.search(file, " и ");
        find.search(file, " война ");

        SearchMap find2 = new SearchMap();
        find2.search(file, "мир" );
        find2.search(file, "и");
        find2.search(file, "война");
        //System.out.println(file);
    }

    private static String readAllBytesJava7(String file) {
        String content = "";
        try {
            content = new String(Files.readAllBytes(Paths.get(file)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

}
