package Skedaret;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LibraPreferuar {

    private static final String filePath = "C:\\TCT\\libra.txt";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistemi i Menaxhimit te Librave ===");

        while (true) {

            System.out.println("\nZgjidhni 1 opsion:");
            System.out.println("1. Shto nje liber");
            System.out.println("2. Trego librin me te perzgjedhur");
            System.out.println("3. Dil");

            System.out.print("Zgjedhje: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addNewBook(scanner);
                    break;
                case "2":
                    showMostFavoriteBook(scanner);
                    break;
                case "3":
                    System.out.println("Programi po mbyllet! Mireupafshim");
                    scanner.close();
                    return;
                default:
                    System.out.println("Zgjedhje jo e saktë. Provo përsëri.");
            }
        }
    }

    //Shto 1 liber
    private static void addNewBook(Scanner scanner) {
        while (true) {
            System.out.println("\n=== Shto nje liber te ri ===");

            System.out.print("Vendos ISBN (ose shtyp back per tu kthyer ne menun fillestare): ");
            String isbn = scanner.nextLine().trim();
            if (isbn.equalsIgnoreCase("back")) return;

            System.out.print("Vendos titullin: ");
            String title = scanner.nextLine().trim();

            System.out.print("Vendos autorin: ");
            String author = scanner.nextLine().trim();

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // append
                writer.write(isbn + ";" + title + ";" + author);
                writer.newLine();
                System.out.println("Libri u ruajt me sukses!");
            } catch (IOException e) {
                System.out.println("Gabim ne ruajtjen e filit: " + e.getMessage());
            }

            System.out.print("Deshiron te shtosh nje liber tjeter? (po/jo): ");
            String again = scanner.nextLine().trim();
            if (again.equalsIgnoreCase("jo")) return;
        }
    }
    //Libri i preferuar
    private static void showMostFavoriteBook(Scanner scanner) {
        while (true) {
            String[] titleArray = new String[100];
            int[] countArray = new int[100];
            int uniqueTitles = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;

                while ((line = reader.readLine()) != null) {
                    if (line.trim().isEmpty()) continue;

                    String[] parts = line.split(";");
                    if (parts.length < 2) continue; // make sure Title exists

                    String currentTitle = parts[1].trim(); // count only the title

                    boolean found = false;

                    for (int i = 0; i < uniqueTitles; i++) {
                        if (titleArray[i].equalsIgnoreCase(currentTitle)) {
                            countArray[i]++;
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        titleArray[uniqueTitles] = currentTitle;
                        countArray[uniqueTitles] = 1;
                        uniqueTitles++;
                    }
                }

            } catch (IOException e) {
                System.out.println("Gabim ne leximin e filit: " + e.getMessage());
                return;
            }

            int maxCount = 0;
            String mostFavoriteTitle = "";

            for (int i = 0; i < uniqueTitles; i++) {
                if (countArray[i] > maxCount) {
                    maxCount = countArray[i];
                    mostFavoriteTitle = titleArray[i];
                }
            }

            if (maxCount <= 1) {
                System.out.println("\nNuk ka libra te perzgjedhur me shume se nje here");
            } else {
                System.out.println("\nLibri i preferuar:");
                System.out.println("Titulli: " + mostFavoriteTitle);
                System.out.println("Sa here eshte zgjedhur: " + maxCount);
            }

            System.out.print("\nShtyp enter per tu rikthyer ne menun fillestare...");
            scanner.nextLine();
            return;
        }
    }
}
