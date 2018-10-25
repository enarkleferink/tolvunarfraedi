public class FallidSlembi1024 {
  public static int slembi1024 (int r){
    return ((22*r+5)%1024);
  }
  public static void main(String[] args) {
    int r = 0;
    int N=1024;
    boolean[] a = new boolean[N];
    a[0] = true;
    int fjöldi = 1;
    System.out.println();
//    System.out.println("Slembitölufallið: ");
    for (int i=1;i<N;i++){
      r = slembi1024(r);
//      System.out.println(r);
      if (a[r] || r==0) {break;}
      fjöldi++;
      a[r]=true;
    }
    if (fjöldi == N) {
      System.out.println("Slembitölufallið hefur fulla lotu.");
    }
    else{
      System.out.println("Slembitölufallið hefur ekki fulla lotu. Lotan er: "+fjöldi);
      System.out.println();
    }

  }
}
