public class FinnaÍBili{
  public static int finna(int[] a, int x){
    int sæti = -1;
    for (int i=0;i<a.length;i++){
      if (a[i]==x) {
        sæti = i;
        break;
      }
    }
    return sæti;
  }
  public static void main(String[] args) {
    int[] a = new int [10];
    for (int i=0;i<10;i++){ //fylkið sett -slembifylki
      a[i] = (int)(Math.random()*10)+1;
    }
    StdOut.println("2 er í sæti "+finna(a, 2));
    StdOut.println("15 er í sæti "+finna(a, 15));
  }
}
