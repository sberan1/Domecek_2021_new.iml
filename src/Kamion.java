import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Kamion {

    //vlastnosti auta
    private int xPozice;
    private int yPozice;
    private String barvaKaroserie;

    //bezaparemetricky konstruktor
    public Kamion()
    {
        this(0,0);
    }

    //parametricky konstruktor
    public Kamion(int xPozice, int yPozice)
    {
        this.xPozice = xPozice;
        this.yPozice = yPozice;
        barvaKaroserie = "cervena";
        kresli();
    }

    //vykresleni kamionu
    private void kresli() {
        Platno platno = Platno.getPlatno();
        platno.setBarvaPopredi(barvaKaroserie);

        platno.wait(100);
    }

    private void vymaz () {
        Platno platno = Platno.getPlatno();

    }
}
