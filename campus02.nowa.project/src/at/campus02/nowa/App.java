package at.campus02.nowa;

import at.campus02.nowa.figures.*;

import java.io.PrintStream;
import java.util.Scanner;

public class App {
    private final Scanner input;
    private final PrintStream output;
    private boolean exit = false;
    private int figureNr;
    private Figure figure;
    private int groesse;



    // Konstruktor
    // input wird verwendet um Daten vom Benutzer einzulesen (verwendet scanner)
    // output wird verwendet um Text auf der Konsole auszugeben (verwendet sysout)
    public App(Scanner input, PrintStream output) {
        this.input = input;
        this.output = output;
    }


    //die Gameloop
    public void Run() {
        initialize();
        while (!exit) {
            readUserInput();
            updateState();
            printState();

        }
    }


    private void initialize() {
        //TODO: Initialisierungen hier durchführen
    }

    private void readUserInput() {
        //TODO: Alle Eingaben der Benutzer einlesen
        inputFigure();

    }

    private void updateState() {
        //TODO: Benutzereingaben verarbeiten

        switch (figureNr) {
            case 1:
                figure = new FigureH(groesse);
                break;
            case 2:
                figure = new FigureL(groesse);
                break;
            case 3:
                figure = new FigureO(groesse);
                break;
            case 4:
                figure = new FigureOO(groesse);
                break;
            case 5:
                figure = new FigureI(groesse);
                break;
            case 6:
                figure = new FigureMinus(groesse);
                break;
            case 7:
                exit = true;
                break;
            default:
                break;
        }



    }

    private void printState() {
        //TODO: Ausgabe des aktuellen Zustands

            if (exit) {
                System.out.println("Goodbye!!!");
            } else if(figure != null){
                output.println(figure);
            }
        }


    private void inputFigure() {
        // Hier sehen Sie ein Pattern für Benutzereingaben
        // Solange kein gültiger Wert eingegeben wurde, wird die Eingabe wiederholt
        do {
            output.println("Welche Grafik moechten Sie anzeigen (1-6) /7 is Exit");
            figureNr = input.nextInt();
            System.out.println("Bitte waehlen Sie eine Groesse(1-3) /7 is Exit");
            groesse = input.nextInt();

            if (figureNr < 1 || figureNr > 7) { // 7 - exit
                output.println("Dies ist keine gueltige Grafik!");
                break;
            } else {
                break;
            }
        } while (true);
    }
}

