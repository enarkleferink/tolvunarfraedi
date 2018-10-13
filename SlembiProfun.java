public class SlembiProfun {

  // Skilar N-staka fylki með slembiheiltölum á bilinu [a, b]
  // a og b eru heiltölur með a <= b
  public static int[] slembiFylki(int N, int a, int b) {

	  int[] s = new int[N];
    for (int i=0;i<N;i++){
      s[i]= (int)(Math.random()*((b-a)+1))+a; //a<=slembitala>=b
    }
    return s; //skilar fylkinu
  }

  public static void main(String[] args) {

    int[] rnd = slembiFylki(25, -10, 10);

    for (int i=0; i<rnd.length; i++)
      System.out.print(rnd[i] + " ");
      System.out.println();
  }
}
