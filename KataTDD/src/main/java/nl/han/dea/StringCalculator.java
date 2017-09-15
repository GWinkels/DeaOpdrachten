package nl.han.dea;

/**
 * Created by Gioo on 14/09/2017.
 */
public class StringCalculator {

    int sum = 0;

    public int Add(String numbers) {
        if ("".equals(numbers)) {
            return 0;
        }
        String[] stringNumbers = numbers.split(", | /n");
        for (String s : stringNumbers) {
            sum += Integer.parseInt(s);
        }
        System.out.println(sum);
        return sum;
    }
}
