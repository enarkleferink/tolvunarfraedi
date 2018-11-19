public class SnuaStofum{
  public static int snuaStofum(int n){
    int result = 0;
    int lengd = 0;
    int n2 = n;
    while (n2>0){ //fundinn fjöldi stafa í tölunni
      n2 /= 10;
      lengd++;
    }
    for (int i=0; i<lengd; i++) { //viðsnúin tala er smíðuð
      result += (n%10)*Math.pow(10,lengd-i-1); //seinasta talan hverju sinni margfölduð með viðeigandi veldi
      n/=10;
    }
    return result;
  }
  public static void main(String[] args) {
    int talan = Integer.parseInt(args[0]);
    StdOut.println(snuaStofum(talan));
  }
}
