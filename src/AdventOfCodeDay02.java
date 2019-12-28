
public class AdventOfCodeDay02 {
//guess 5225
  public static int[] gravityAssist(int[] input) {
    for (int i = 0; i < input.length; i += 4) {
      switch (input[i]) {
        case 1:
          input[input[i + 3]] = input[input[i + 1]] + input[input[i + 2]];
          break;
        case 2:
          input[input[i + 3]] = input[input[i + 1]] * input[input[i + 2]];
          break;
        case 99:
          return input;
      }
    }
    return input;
  }

  public static void findFirstParameters(int[] input) {
    for (int i = 0; i <= 99; i++) {
      for (int j = 0; j <= 99; j++) {
        input = resetInput(input);
        input[1] = i;
        input[2] = j;
        if (gravityAssist(input)[0] == 19690720) {
          System.out.println(100 * i + j);
        }
      }
    }
  }

  public static int[] resetInput(int[] input) {
    input = new int[] {1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 10, 1, 19, 1, 5, 19, 23,
        1, 23, 5, 27, 2, 27, 10, 31, 1, 5, 31, 35, 2, 35, 6, 39, 1, 6, 39, 43, 2, 13, 43, 47, 2, 9,
        47, 51, 1, 6, 51, 55, 1, 55, 9, 59, 2, 6, 59, 63, 1, 5, 63, 67, 2, 67, 13, 71, 1, 9, 71, 75,
        1, 75, 9, 79, 2, 79, 10, 83, 1, 6, 83, 87, 1, 5, 87, 91, 1, 6, 91, 95, 1, 95, 13, 99, 1, 10,
        99, 103, 2, 6, 103, 107, 1, 107, 5, 111, 1, 111, 13, 115, 1, 115, 13, 119, 1, 13, 119, 123,
        2, 123, 13, 127, 1, 127, 6, 131, 1, 131, 9, 135, 1, 5, 135, 139, 2, 139, 6, 143, 2, 6, 143,
        147, 1, 5, 147, 151, 1, 151, 2, 155, 1, 9, 155, 0, 99, 2, 14, 0, 0};
    return input;
  }

  public static void main(String[] args) {

    // testing
    int[] test = {1, 9, 10, 3, 2, 3, 11, 0, 99, 30, 40, 50};
    test = gravityAssist(test);
    if (test[0] != 3500) {
      System.out.println("Test has failed");
    } else {
      System.out.println("Test has passed");
    }

    // solution for part one
    int[] input = {1, 0, 0, 3, 1, 1, 2, 3, 1, 3, 4, 3, 1, 5, 0, 3, 2, 10, 1, 19, 1, 5, 19, 23, 1,
        23, 5, 27, 2, 27, 10, 31, 1, 5, 31, 35, 2, 35, 6, 39, 1, 6, 39, 43, 2, 13, 43, 47, 2, 9, 47,
        51, 1, 6, 51, 55, 1, 55, 9, 59, 2, 6, 59, 63, 1, 5, 63, 67, 2, 67, 13, 71, 1, 9, 71, 75, 1,
        75, 9, 79, 2, 79, 10, 83, 1, 6, 83, 87, 1, 5, 87, 91, 1, 6, 91, 95, 1, 95, 13, 99, 1, 10,
        99, 103, 2, 6, 103, 107, 1, 107, 5, 111, 1, 111, 13, 115, 1, 115, 13, 119, 1, 13, 119, 123,
        2, 123, 13, 127, 1, 127, 6, 131, 1, 131, 9, 135, 1, 5, 135, 139, 2, 139, 6, 143, 2, 6, 143,
        147, 1, 5, 147, 151, 1, 151, 2, 155, 1, 9, 155, 0, 99, 2, 14, 0, 0};
    input[1] = 12;
    input[2] = 2;
    input = gravityAssist(input);
    System.out.println(input[0]);

    // solution for part 2
    findFirstParameters(input);
  }
}