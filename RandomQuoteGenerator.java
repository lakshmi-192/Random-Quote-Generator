import java.util.Random;

public class RandomQuoteGenerator {
    private static final String[] QUOTES = {
            "Believe you can and you're halfway there. - Theodore Roosevelt",
            "The only way to do great work is to love what you do. - Steve Jobs",
            "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill",
            "Don't watch the clock; do what it does. Keep going. - Sam Levenson",
            "You miss 100% of the shots you don't take. - Wayne Gretzky"
    };

    public static void main(String[] args) {
        Random random = new Random();
        String randomQuote = QUOTES[random.nextInt(QUOTES.length)];
        System.out.println("Random Quote:");
        System.out.println(randomQuote);
    }
}
