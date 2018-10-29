public class FallidPrintnum {
  public static void printnum (int n){ //endurkvæmt fall
    if (n==0) return;
    System.out.println(n);
    printnum(n-1);
  }
  public static void printnumOfugt (int n){ //endurkvæmt fall
    if (n==0) return;
    printnumOfugt(n-1);
    System.out.println(n);
  }
  public static void main(String[] args) {
    System.out.println("Afturábak: ");
    printnum(10);
    System.out.println();
    System.out.println("Áfram: ");
    printnumOfugt(10);
  }
}
