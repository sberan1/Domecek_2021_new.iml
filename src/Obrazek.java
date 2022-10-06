
/**
 * Tato trida reprezentuje jednoduchy obrazek. Obrazek se nakresli po zavolani
 * metody kresli. Obrazek muze byt zmenen - muzete ho upravit na cernobily
 * a zpet na barevny.
 * Proti tride Obrazek z projektu "Obrazek" je zde predpripravena metoda prujezdAuta,
 * kterou maji studenti na cviceni doplnit.
 *
 * Tato trida je napsana jako jeden z prvnich prikladu pro vyuku Javy v BlueJ.
 * 
 * @author	Michael Kolling
 * @author  Lubos Pavlicek
 * @version 1.0  (15 July 2000)
 * @version 1.1cz (30 July 2004)
 * 
 */
public class Obrazek
{
	private Ctverec zed;
	private Ctverec okno;
	private Trojuhelnik strecha;
	private Kruh slunce;

	/**
	 * Konstruktor pro vytvoreni instance tridy Obrazek
	 */
	public Obrazek()
	{
		// zde neni zadny obsah ... datove atributy maji automaticky pocatecni hodnotu null
		//     a vlastni kresleni obrazku (a tim i inicializace datovych atributu)
		//     je v metode kresli
	}

	/**
	 * Nakresli obrazek.
	 */
	public void kresli()
	{
		zed = new Ctverec();
		zed.posunVertikalne(80);
		zed.zmenVelikost(100);

		okno = new Ctverec();
		okno.zmenBarvu("cerna");
		okno.posunHorizontalne(20);
		okno.posunVertikalne(100);

		strecha = new Trojuhelnik();	
		strecha.zmenVelikost(50, 140);
		strecha.posunHorizontalne(60);
		strecha.posunVertikalne(70);

		slunce = new Kruh();
		slunce.zmenBarvu("zluta");
		slunce.zmenVelikost(50);
		slunce.posunHorizontalne(180);
		slunce.posunVertikalne(-50);

	}

	/**
	 * zmeni obrazek na cernobily
	 */
	public void setCernoBily()
	{
		if (zed != null)   // pouze pokud je jiz nakreslen...
		{
			zed.zmenBarvu("cerna");
			okno.zmenBarvu("bila");
			strecha.zmenBarvu("cerna");
		}
	}

	/**
	 * zmeni obrazek zpet na barevny
	 */
	public void setBarevny()
	{
		if (zed != null)   // pouze pokud je jiz nakreslen domecek...
		{
			zed.zmenBarvu("cervena");
			okno.zmenBarvu("cerna");
			strecha.zmenBarvu("zelena");
		}
	}
	
	/**
	 * pri zavolani teto metody by melo pred domeckem projet auto
	 */
	public void prujezdAuta() {
	    if (zed != null) {    // pouze pokud je jiz nakreslen domecek...

			Auto auto = new Auto(0, 240);
			auto.pomaluPosunHorizontalne(300);
	    }
	}
}
