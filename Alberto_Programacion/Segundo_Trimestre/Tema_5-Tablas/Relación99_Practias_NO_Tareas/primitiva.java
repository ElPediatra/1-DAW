import java.util.Random;
import java.util.Scanner;

public class primitiva {
  
  private static final int SIZE = 6;
  private static final int RANGE = 50;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[] userNumbers = new int[SIZE];
    int[] winningNumbers = new int[SIZE];
    Random random = new Random();

    // Read user numbers
    System.out.println("Enter your " + SIZE + " numbers (ranging from 0 to " + (RANGE - 1) + "):");
    for (int i = 0; i < SIZE; i++) {
      userNumbers[i] = scanner.nextInt();
    }

    // Generate winning numbers
    for (int i = 0; i < SIZE; i++) {
      int number;
      do {
        number = random.nextInt(RANGE);
      } while (contains(winningNumbers, number));
      winningNumbers[i] = number;
    }

    // Print winning numbers
    System.out.print("Winning numbers: ");
    for (int i = 0; i < SIZE; i++) {
      System.out.print(winningNumbers[i] + " ");
    }
    System.out.println();

    // Count matching numbers
    int matchCount = 0;
    for (int i = 0; i < SIZE; i++) {
      if (contains(winningNumbers, userNumbers[i])) {
        matchCount++;
      }
    }

    // Print result
    System.out.println("You have " + matchCount + " matches.");
  }

  private static boolean contains(int[] numbers, int number) {
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == number) {
        return true;
      }
    }
    return false;
  }
}