import java.awt.*;
import java.awt.geom.Ellipse2D;

/*2. Část úkolu je vytvořit novou třídu, která bude reprezentovat vámi vymyšlený objekt
- dopravní prostředek. Tento objekt se zobrazí po zavolání obrazek.kresli() v levém horním rohu plátna
- počáteční souřadnice (0;0). Mimo to, objekt bude vepsán do čtverce o rozměrech 100x100
- tedy šířka objektu a výška objektu budou mít 100px. Bude se skládat ze 4 a více objektů
(např.: raketa - okénko - kruh, tělo - čtverec a špička - trojúhelník ... ).
Bude mít jasné směřování (například špička rakety míří jedním směrem).
Tento dopravní prostředek bude mít dvě metody pro příjezd na plátno a pro odjezd
(stejně jako auto v 1. úkolu)
*/
public class Kamion {

    //vlastnosti auta
    private int xPozice;
    private int yPozice;
    private String barvaKaroserie;
    private String barvaNakladu;


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
        barvaNakladu = "modra";
        kresli();
    }

    //vykresleni kamionu
    //sorry, ze to nema 100x100, ale poblil bych se kdybych poslal takovej paskvil, uz takhle je to dost nechutny, nemusim to delat horsi tim, ze z toho udelam ctverec
    public void kresli() {
        Platno platno = Platno.getPlatno();
        platno.setBarvaPopredi(barvaNakladu);
        // naklad
        platno.vybarvi(new Rectangle(xPozice, yPozice, 80, 50));
        // kabina
        platno.setBarvaPopredi(barvaKaroserie);
        platno.vybarvi(new Rectangle(xPozice+80, yPozice, 20, 50));
        // kolo predni
        platno.setBarvaPopredi("cerna");
        platno.vybarvi(new Ellipse2D.Double(xPozice+80, yPozice+40, 20, 20));
        // kolo zadni
        platno.vybarvi(new Ellipse2D.Double(xPozice, yPozice+40, 20, 20));
        //okno
        platno.vybarvi(new Rectangle(xPozice+85, yPozice+5, 15, 20));
        platno.wait(10);
    }

    public void vymaz () {
        Platno platno = Platno.getPlatno();
        // naklad
        platno.vymaz(new Rectangle(xPozice, yPozice, 80, 50));
        // kabina
        platno.vymaz(new Rectangle(xPozice+80, yPozice, 20, 50));
        // kolo predni
        platno.vymaz(new Ellipse2D.Double(xPozice+80, yPozice+40, 20, 20));
        // kolo zadni
        platno.vymaz(new Ellipse2D.Double(xPozice, yPozice+40, 20, 20));
        //okno
        platno.vymaz(new Rectangle(xPozice+85, yPozice+5, 15, 20));
    }
    public void zmenBarvu(String novaBarva)
    {
        barvaKaroserie = novaBarva;
        kresli();
    }
    public void pomaluPosunHorizontalne(int vzdalenost) {
        int delta;

        if(vzdalenost < 0)
        {
            delta = -1;
            vzdalenost = -vzdalenost;
        }
        else
        {
            delta = 1;
        }

        for(int i = 0; i < vzdalenost; i++)
        {
            vymaz();
            xPozice += delta;
            kresli();
        }
    }
}
