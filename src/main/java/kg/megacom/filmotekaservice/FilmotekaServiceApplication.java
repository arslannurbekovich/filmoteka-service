package kg.megacom.filmotekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SpringBootApplication
public class FilmotekaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilmotekaServiceApplication.class, args);

        whenNumberCorrect();
    }


    public static boolean whenNumberCorrect() {
        Pattern pattern = Pattern.compile("^\\+[9][9][6][- ]?\\d{3}[- ]?\\d{3}[- ]?\\d{3}$");
        Matcher matcher = pattern.matcher("+996709776610");
        Matcher matcher1 = pattern.matcher("+996 709 776 610");
        Matcher matcher2 = pattern.matcher("+996-709-776-610");
        Matcher matcher3 = pattern.matcher("+996 709-776610");

        System.out.println(matcher.matches() + "    +996709776610");
        System.out.println(matcher1.matches() + "    +996 709 776 610");
        System.out.println(matcher2.matches() + "    +996-709-776-610");
        System.out.println(matcher3.matches() + "    996 709-776610");

        return matcher.matches();
    }
}
