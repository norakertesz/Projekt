package at.campus02.nowa.figures;

public class FigureL extends Figure{
    public FigureL(int groesse){
    symbol[0][0] = ' ';
    symbol[1][0] = 'X';
    symbol[2][0] = ' ';

    symbol[0][1] = ' ';
    symbol[1][1] = 'X';
    symbol[2][1] = ' ';

    symbol[0][2] = ' ';
    symbol[1][2] = 'X';
    symbol[2][2] = 'X';
        this.groesse=groesse;
}
}
