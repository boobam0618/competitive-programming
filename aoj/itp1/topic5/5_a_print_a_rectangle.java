import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      int height = sc.nextInt();
      int width = sc.nextInt();
      if (height == 0 && width == 0) {
        return;
      }

      for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
          System.out.print("#");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
