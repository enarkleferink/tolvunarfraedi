public class FallidStjornur{
  public static String stjornur(int n){
    String stjornur = "";
    for (int i=1; i<=n; i++){
      stjornur += "*";
    }
    return stjornur;
  }
  public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    String lína = stjornur(n);
    System.out.println(lína);
  }
}
