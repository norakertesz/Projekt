package at.campus02.nowa.figures;

public class FigureMinus extends Figure{
    public FigureMinus(int groesse) {
        symbol[0][0] = ' ';
        symbol[1][0] = ' ';
        symbol[2][0] = ' ';

        symbol[0][1] = 'X';
        symbol[1][1] = 'X';
        symbol[2][1] = 'X';

        symbol[0][2] = ' ';
        symbol[1][2] = ' ';
        symbol[2][2] = ' ';
        this.groesse=groesse;
    }
}
