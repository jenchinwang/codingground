class PoolPuzzleOne{
  public static void main(String [] args) {
    int x = 0;
    
    while (x < 4) {
      x = x + 1;
      if (x < 1) {
        System.out.print("a ");
      }
      x = x - 2;
      if (x > 1) {
        System.out.print("an");
        x = x ;
      }
//      if (x == 1) {
//        System.out.print("");
//      }
      if (x > 3) {
        System.out.print(" oyster");
      }
      System.out.println("");
      x = x + 1;
    }
  }
}

//System.out.println("Hello World");