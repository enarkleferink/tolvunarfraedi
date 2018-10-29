public class Increment {
  public static void main(String[] args) {
//    int[] a = new int[args.length];

     System.out.print(""+(Integer.parseInt(args[0]) + 1));

    for (int i=1; i<args.length; i++) {
     System.out.print(", " + (Integer.parseInt(args[i]) + 1));
    }
    System.out.println();
  }
}
