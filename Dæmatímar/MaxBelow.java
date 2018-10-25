public class MaxBelow {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int max= Integer.MIN_VALUE;
    int hæsta=0;
    while(!StdIn.isEmpty()){
      int l=StdIn.readInt();
      if (l>max && l<a){
        hæsta = l;
      }
    }
    System.out.println(hæsta);
  }
}
