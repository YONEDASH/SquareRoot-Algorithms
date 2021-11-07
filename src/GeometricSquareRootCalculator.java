/**
 * created by Til M. on 07.11.21 in Info Algorithm
 */
public class GeometricSquareRootCalculator {

    public static void main(String[] args) {
        // value = Zahl von der man die Quadratwurzel berechnen möchte.
        double value = 8.0;

        // Theoretisch nicht nötig, zeigt jedoch Index von
        // jetzigem Rechteck A an.
        int a = 0;

        // x von A0 ist in diesem Fall value=8.
        double x = value;
        // y von A0 ist immer 1.
        double y = 1.0;
        // Ausgabe von Seiten von A0
        System.out.println("A" + a + ": x=" + x + " y=" + y);

        // Solange x größer ist als y Rechnung wiederholen, da x
        // und y sich noch nicht nah genug aneinander genährt haben.
        while (x > y) {
            // Rechnung die wiederholt wird:

            // X ist der Mittelwert der Seiten des vorherigen Rechtecks.
            x = (x + y) / 2.0;
            // Y ist Quotient von value (der Zahl, von der man die Wurzel
            // sucht) und dem neuen x-Wert.
            y = value / x;

            // Index a um 1 erhöhen, weil nächstes Rechteck.
            a++;

            // Die Seiten x & y des neuen Rechtecks sind nun definiert.

            // Ausgabe von Quadratseiten
            System.out.println("A" + a + ": x=" + x + " y=" + y);
        }

        // Haben sich nun beide Zahlen angenährt, ist die Quadratwurzel der
        // Zahl value (8) der Mittelwert von den Seiten des "neuen" Quadrates
        // x & y. Mittelwert um "realistischere" Zahl zu erhalten, da x nicht
        // gleich y, weil es Computern nicht möglich ist die unendlichste
        // Nachkommastelle zu berechnen. (Ansonsten wäre x oder y als Ergebnis
        // möglich, weil x=y.)
        double result = (x + y) / 2.0;

        // Ausgabe von Ergebnis
        System.out.println("Wurzel von " + value + " ist " + result);
    }

}
