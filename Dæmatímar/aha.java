  public class aha{
    public static int aha(int a, int b){
      if (a<b) return 0;
      return 1 + aha(a-b, b);
    }
    public static void main(String[] args) {
      System.out.println("Við fáum út ef við keyrum aha(7,2):" +
                         "\n  1 + aha(7-2,2) = 1 + aha (5,2)"+
                         "\n= 1 + (1 + aha(5-2,2))"+
                         "\n= 1 + (1 + aha(3-2,2)) = 1 + 1 + (1 + aha (1,2))"+
                         "\n= 1 + 1 + 1 + 0 = " + aha(7,2));
    }
  }
