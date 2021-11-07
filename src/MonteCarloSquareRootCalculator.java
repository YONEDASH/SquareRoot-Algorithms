/**
 * created by Til M. on 07.11.21 in Info Algorithm
 */
public class MonteCarloSquareRootCalculator {

    public static void main(String[] args) {
        // value = Zahl von der man die Quadratwurzel berechnen möchte.
        double value = 8.0;

        // Startzahl & Endzahl; Theoretisch wäre es auch möglich die Wurzel
        // mit from=0 und to=value zu berechnen, man braucht jedoch mehr
        // Versuche um ein genaueres Ergebnis zu erhalten.
        double from = 2.0, to = 3.0;

        // Anzahl der Versuche; Je höher die Anzahl der Versuche, desto
        // genauer wird das Ergebnis.
        int iterations = 20;

        // Ergebnis, standardmäßig größte, mögliche Nummer, damit später num
        // kleiner als result sein kann.
        double result = Double.MAX_VALUE;

        // 'iterations'-mal (20 mal) Versuchen eine nahe Zahl an der Wurzel erraten.
        for (int i = 0; i < iterations; i++) {
            // Zufällige Zahl zwischen Startzahl & Endzahl berechnen.
            double num = from + (Math.random() * (to - from));

            // Wenn num kleiner ist als jetztiges result (Ergebnis) (-> Annäherung)
            // und Quadrat von num (Zufällige Zahl) größer oder gleich value (8) ist,
            // result (Ergebnis) zu num setzen.
            if (num < result && Math.pow(num, 2.0) >= value) {
                result = num;
            }
        }

        // Da Zahlen zufällig sind, kann es sein, dass bei allen Versuchen die
        // Konditionen nicht erfüllt sind ein Ergebnis zu setzen.
        // Lösungen: 1. keinen Zufall nutzen; 2. mehr Versuche
        if (result == Double.MAX_VALUE) {
            System.out.println("Wurzel wurde nicht erraten.");
        } else {
            // Ausgabe des Ergebnisses
            System.out.println("Erratene Wurzel von " + value + " nach " + iterations + " Versuchen: " + result);
        }
    }

}
