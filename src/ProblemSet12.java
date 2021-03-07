import java.util.ArrayList;

public class ProblemSet12 {

    public long factorial(int n) {

        if (n <= 0) {

            return -1;

        }

        if (n <= 1) {

            return 1;

        }

        else {

            return (n * factorial(n-1));

        }
    }

    public long fibonacci(int n) {

        if (n < 0) {

            return -1;

        }

        if (n == 0) {

            return 0;

        }

        if (n == 1 || n == 2) {

            return 1;

        }

        else {

            return fibonacci(n-1) + fibonacci(n-2);
        }

    }

    public long triangle(int rows) {

        if (rows < 0) {

            return -1;

        }

        if (rows == 0) {

            return 0;

        }

        if (rows == 1) {

            return 1;

        }

        else {

            return rows + triangle(rows-1);

        }

    }

    public long sumDigits(int n) {

        if (n < 0) {

            return -1;

        }

        if (n == 0) {

            return 0;

        }

        return (n % 10 + sumDigits(n / 10));

    }

    public long powerN(int base, int exponent) {

        if (base < 1 || exponent < 1) {

            return -1;

        }

        if (exponent == 1) {

            return base;

        }

        else {

            return base * powerN(base, exponent-1);

        }

    }

    public String changeXY(String text) {

        if (text == null) {

            return null;

        }

        if (text.length() == 0) {

            return text;

        }

        if (text.charAt(0) == 'x') {

            return 'y' + changeXY(text.substring(1));

        }

        return text.charAt(0) + changeXY(text.substring(1));


    }

    public int array11(int[] data, int index) {

        if (data == null || index < 0 || index > data.length-1) {

            return -1;

        }

        int counter = 0;

        if (data[index] == 11) {

            counter += 1;

        }

        if (index == data.length-1) {

            return counter;

        }

        else {

            return counter+array11(data, index+1);

        }
    }

    public int strCount(String text, String sub) {

        if (text == null || sub == null || sub.length() == 0) {

            return -1;

        }

        if (text.length() < sub.length()) {

            return 0;

        }

        if (text.substring(0, sub.length()).equals(sub)) {

            return 1 + strCount(text.substring(sub.length()), sub);

        }

        return strCount(text.substring(1), sub);

    }

    public boolean strCopies(String text, String sub, int n) {

        if (text == null || sub == null || sub.length() == 0 || n < 0) {

            return false;

        }

        if (text.length() < sub.length()) {

            return (n <= 0);

        }

        if (text.substring(0, sub.length()).equals(sub)) {

            return strCopies(text.substring(1), sub, n - 1);

        }

        return strCopies(text.substring(1), sub, n);

    }

    public int strDist(String text, String sub) {

        if (text == null || sub == null || sub.length() == 0) {
            return -1;
        }

        if (text.indexOf(sub) == -1) {
            return 0;
        }

        if (text.substring(0, sub.length()).equals(sub) && text.substring(text.length()-sub.length()).equals(sub)) {
            return text.length();
        }

        if (!text.substring(0, sub.length()).equals(sub)) {
            return strDist(text.substring(1), sub);
        }

        return strDist(text.substring(0, text.length() - 1), sub);

    }
}
