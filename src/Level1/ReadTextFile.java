package Level1;

import java.io.*;

public class ReadTextFile {
    public static void main(String args[]) throws IOException {
        File file = new File("C:\\Users\\user\\Downloads\\test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());
    }
}