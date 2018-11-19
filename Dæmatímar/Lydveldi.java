public class Lydveldi{
  public static void main(String[] args) {
    String s = "Ísland er lýðveldi með þingbundinni stjórn";
    String t1 = s.split("er")[0] + "var" + s.split("er")[1];
//  String t2 = s.substring(0,s.indexOf("er")).concat("var"+ s.substring(s.indexOf("er")+2,s.length()));
    System.out.println(s);
    System.out.println(t1);
//  System.out.println(t2);

    int count = 0;
    do {
      count ++;
      s = s.substring(s.indexOf("n")+1,s.length());
    } while(s.indexOf("n")!=-1);
    System.out.println("Fjöldi stafa n: "+ count);
  }
}
