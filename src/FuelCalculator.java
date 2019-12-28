// Advent of Code 2019, Day 01
public class FuelCalculator {

  // For First Challenge
  public static int calcRequiredFuelByInitialMass(int[] masses) {
    int fuel = 0;
    for (int i = 0; i < masses.length; i++) {
      // Fuel per mass calculation. mass divided by three and rounded down. Then subtract two.
      fuel += (masses[i] / 3) - 2;
    }
    return fuel;
  }



  // Second Challenge
  public static int calcRequiredFuelHelper(int[] masses) {
    int fuelNeeded = 0;
    for (int i = 0; i < masses.length; i++) {
      fuelNeeded += calcRequiredFuel(masses[i], 0);
    }
    return fuelNeeded;
  }

  public static int calcRequiredFuel(int mass, int fuelNeeded) {
    while ((mass / 3) - 2 > 0) {
      mass = (mass / 3) - 2;
      fuelNeeded += mass;
    }
    return fuelNeeded;
  }


  public static void main(String[] args) {
    // test for part 01
    int[] test = {12, 14, 1969, 100756};
    int expected = 34241;
    if (calcRequiredFuelByInitialMass(test) != expected) {
      System.out.println("First test has failed");
    } else {
      System.out.println("First test has passed");
    }
    // test for part 02
    if (calcRequiredFuelHelper(new int[] {100756, 14}) == 50348) {
      System.out.println("Second Test passed");
    } else {
      System.out.println("Second Test failed");
    }

    // solution
    int[] input = {129192, 58561, 57267, 95382, 84995, 127372, 93598, 97264, 138550, 79327, 135661,
        139468, 108860, 149642, 72123, 128333, 69002, 98450, 86267, 70171, 101333, 79822, 142539,
        142743, 51371, 111381, 62073, 72210, 125168, 135952, 131060, 121842, 88234, 146774, 136571,
        126719, 50644, 75696, 51195, 77171, 118052, 83691, 133779, 149814, 64847, 110697, 92695,
        59453, 139517, 129487, 79271, 97896, 146987, 149822, 71866, 90797, 104732, 54997, 50139,
        134115, 133017, 144979, 89428, 124750, 91833, 57252, 67195, 121624, 102706, 138245, 127700,
        124098, 110382, 121557, 103613, 133576, 122801, 112306, 120203, 134696, 76129, 84576, 80854,
        147237, 71025, 127513, 143631, 125090, 115698, 57979, 84880, 120177, 147389, 88380, 114688,
        56355, 126265, 58220, 63523, 130179};
    int solution = 0;
    solution= calcRequiredFuelByInitialMass(input);
    System.out.println("Fuel needed by initial masses: " + solution);
    System.out.println("Fuel needed in total: " + calcRequiredFuelHelper(input));
  }



}
