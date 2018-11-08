package package3;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Durch \\ kann man auch den Backslash selbst beliebig oft ausgeben: \\\\\\\\");
        System.out.println("Ich verwende den\b Backspace, die Newline\n und den \tTabulator.");
        System.out.println("Durch den Wagenrücklauf wird die Zeile zurückgesetzt und der Teil nach dem \r überschreibt\n" + "die bestehende Zeile. \f ist in der Konsole nicht bemerkbar, da es einen Seitenumbruch\n" + "erzwingt.");
    }
}