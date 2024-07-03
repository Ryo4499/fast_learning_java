package part3;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.IntStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.lang.Math;

public class StandardLibraries {

    public static void main(String[] args) {
        // Date
        Date date = new Date();
        System.out.println(date);

        // SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));

        // File
        File file = new File("sample.txt");
        System.out.println(file.exists());

        // BufferedReader
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        // FileWriter
        try (FileWriter fw = new FileWriter("sample.txt")) {
            fw.write("Hello, World!");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Math
        System.out.println(Math.abs(-10));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.floor(3.14));
        System.out.println(Math.round(3.14));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.sqrt(9));

        // Stream API
        IntStream.range(0, 10).forEach(System.out::println);

        // Regular Expression
        var message = "Hello, World!";
        var pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(message);
        matcher.find();
        System.out.println(matcher.group());
    }
}
