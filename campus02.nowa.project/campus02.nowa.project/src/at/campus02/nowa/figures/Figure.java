package at.campus02.nowa.figures;

import at.campus02.nowa.App;

import java.io.PrintStream;
import java.util.Scanner;

public abstract class Figure {
    protected char[][] symbol = new char[3][3];
    protected int groesse;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < 3; row++) {
            for (int j = 0; j < groesse; j++) {
                for (int col = 0; col < 3; col++) {
                    for (int i = 0; i < groesse; i++) {
                        sb.append(symbol[col][row]);
                    }
                } sb.append('\n');
            }
        }


        return sb.toString();
    }
}










