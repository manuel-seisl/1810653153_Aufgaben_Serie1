package package3;

public class Main
{
    public static void main(String[] args)
    {

        // Name und Alter in Variable definiert und zugewiesen
        String name = "Manuel Seisl";
        int age = 26;

        // Variablenname von fachhochschuleKufsteinTirol auf fhKufsteinTirol gekürzt und in Konstante umgewandelt
        final String FH_KUFSTEIN_TIROL = "Fachhochschule Kufstein Tirol";

        // Neue Konstante angelegt
        final String NEW_CONSTANT;

        // Ausgabe Name und Alter
        System.out.println(name);
        System.out.println(age);

        // Ausgabe Escape Sequenzen
        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\");
        System.out.println("Ich verwende den\b Backspace, die Newline\n und den \tTabulator.");
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt\n" + "die bestehende Zeile. \f ist in der Konsole nicht bemerkbar, da es einen Seitenumbruch\n" + "erzwingt.");

    }
}