package com.alina1234.runners;

import java.util.Scanner;

/**
 * Created by agr on 3/22/2017.
 */
public class HomeworkLesson4Runner {
    public static void main(String[] args) {
        int choose = 0;
      inputMethod();
      Scanner scanner = new Scanner (System.in);
      choose = scanner.nextInt();
      switch (choose) {
          case 1:
              CircleAreaRunner.main(null);
              break;
          case 2:
              TriangleLineRunner.main(null);
              break;
          case 3:
              OddNumberRunner.main(null);
              break;
          case 0: break;
          default: System.out.println("You have made incorrect choice");
      }
    }

    public static void inputMethod() {
        System.out.println("---------------------------------");
        System.out.println("Hello! There is list of methods:");
        System.out.println("---------------------------------");
        System.out.println("|1|    What circle is more?      |");
        System.out.println("|2|    Is it right triangle?     |");
        System.out.println("|3|   Is number odd or even?     |");
        System.out.println("---------------------------------");
        System.out.println("|0| for exit");
        System.out.println("Please, choose a number of method for it execution: ");
    }
}
