public class FallidTolustafurNr{

/**************************************************/
  public static int TolustafurNr(int tala, int i){
    int a = tala;
    for(int j=0;j<=i;j++){
      a = tala%10;
      tala /= 10;
    }
    return a;
  }
/**************************************************/
  public static void main(String[] args) {

    int tala = Integer.parseInt(args[0]);
    int Nr = Integer.parseInt(args[1]);

    int Tolustafur = TolustafurNr(tala, Nr);
    StdOut.println("Tölustafur númer "+Nr+" er "+Tolustafur+".");
  }
/**************************************************/

}
