
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

		/*
		slunce = new Kruh();
		slunce.zmenBarvu("zluta");
		slunce.zmenVelikost(50);
		slunce.posunHorizontalne(180);
		slunce.posunVertikalne(-50);
		*/
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

	private Auto noveAuto;
	public void prijezdNovehoAuta(){
		//otazka jestli uz nase nove Auto nahodou neexistuje
		if (noveAuto == null){
			//vygenerujeme nove auto mimo platno
			noveAuto = new Auto(-200, 240);
			//zmenime novemu autu barvu na nejakou jinou, nez je zakladni modra
			noveAuto.zmenBarvu("zelena");
			//posuneme ho nekam do frame
			noveAuto.pomaluPosunHorizontalne(300);
		}
	}

	public void odjezdNovehoAuta(){
		//potrebujeme aby nase auto nejdrive existovalo, aby mohlo odjet, proto se ptame jestli uz existuje
		if (noveAuto != null){
			noveAuto.pomaluPosunHorizontalne(200);
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

	/*
	Pri zavolani metody vyjde slunce pokud neni na obloze
	 */
	public void vychodSlunce(){
		if (slunce == null) {
			setCernoBily();
			slunce = new Kruh();
			slunce.zmenBarvu("zluta");
			slunce.zmenVelikost(60);
			slunce.posunVertikalne(-10);
			slunce.posunHorizontalne(-60);
			slunce.pomaluPosunHorizontalne(60);
			setBarevny();
			slunce.pomaluPosunHorizontalne(180);
		}
	}

		public void zapadSlunce(){
		if (slunce != null){
			slunce.pomaluPosunHorizontalne(60);
			setCernoBily();
			slunce.pomaluPosunHorizontalne(180);
			slunce = null;
		}
	}
}

