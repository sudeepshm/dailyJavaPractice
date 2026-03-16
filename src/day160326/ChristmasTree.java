package day160326;

public class ChristmasTree {
    public static void main(String[] args) {
        int height = 10; // You can change this to make the tree taller

        // Part 1: The Foliage (The leafy part)
        for (int i = 1; i <= height; i++) {
            // Print leading spaces to center the stars
            for (int j = height; j > i; j--) {
                System.out.print(" ");
            }

            // Print the stars (Odd numbers: 1, 3, 5, 7...)
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Part 2: The Trunk
        // We'll make the trunk 2 rows high and centered
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j < height; j++) {
                System.out.print(" ");
            }
            System.out.println("| |"); // Using pipes for a "woody" look
        }
    }
}