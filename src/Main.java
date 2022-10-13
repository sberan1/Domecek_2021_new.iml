public class Main {

    public static void main(String[] args) throws InterruptedException {
	  Obrazek obrazek = new Obrazek();
      obrazek.kresli();
      //obrazek.prujezdAuta();
      //obrazek.vychodSlunce();
      //Thread.sleep(6000);
      //obrazek.zapadSlunce();
      //new Obrazek().kresli();

        obrazek.prijezdNovehoAuta();
        Thread.sleep(600);
        obrazek.odjezdNovehoAuta();
    }
}
