public class TeningurVinnurTvisvar {

  public static int vinnurTvisvar(){

    int skipti = 1;
    boolean t1 = ((int)(Math.random()*6)<(int)(Math.random()*6));

    while (true){
      if(t1 && ((int)(Math.random()*6)<(int)(Math.random()*6))){
        skipti++;
        break;
      }
      else{
        t1 = ((int)(Math.random()*6)<(int)(Math.random()*6));
        skipti++;
      }
    }
    return skipti;
    }
  public static void main(String[] args) {
    double N = 100000.0;
    int sum = 0;
    for (int i=0; i<N; i++) {
      int a = vinnurTvisvar();
      sum += a;
    }
    double medal = (1.0*sum/N);
    System.out.println("Meðalfjöldi kasta: " + medal);
    }
  }
