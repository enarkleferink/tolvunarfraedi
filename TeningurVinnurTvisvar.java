public class TeningurVinnurTvisvar {

  public static int vinnurTvisvar(){
    int vann=0;
    int skipti = 0;
    for(int i=0; i>0; i++) { //keyrir endalaust þar til skilyrðið er uppfyllt
      int t1 = (int)(Math.random()*6) + 1;
      int t2 = (int)(Math.random()*6) + 1;

      skipti+=1;

      if ( t2 > t1 ) vann+=1;
      if (vann==2) break;

    }
    return skipti;
  }

  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    int sum = 0;
    for (int i=0; i<N; i++) {
      int a = vinnurTvisvar();
      sum+=a;
    }
    int medal = (sum/N);
    System.out.println("Meðalfjöldi kasta: " + medal);
  }


}
