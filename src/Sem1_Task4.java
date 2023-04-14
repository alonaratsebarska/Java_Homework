/* Задано уравнение вида q + w = e, q, w, e >= 0.
   Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
   Требуется восстановить выражение до верного равенства.
   Предложить хотя бы одно решение или сообщить, что его нет.
*/

import java.util.Scanner;

public class Sem1_Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите уравнение в формате q + w = e (например, 2? + ?5 = 69): ");
        String equation = scanner.nextLine();

        String[] parts = equation.split(" \\+ | = ");
        if (parts.length != 3) {
            System.out.println("Некорректный формат уравнения!");
            return;
        }

        boolean foundSolution = false;
        for (int q = 0; q <= 9; q++) {
            for (int w = 0; w <= 9; w++) {
                for (int e = 0; e <= 9; e++) {
                    String qStr = Integer.toString(q);
                    String wStr = Integer.toString(w);
                    String eStr = Integer.toString(e);

                    String qCandidate = parts[0].replace('?', qStr.charAt(0));
                    String wCandidate = parts[1].replace('?', wStr.charAt(0));
                    String eCandidate = parts[2].replace('?', eStr.charAt(0));

                    int qNumber = Integer.parseInt(qCandidate);
                    int wNumber = Integer.parseInt(wCandidate);
                    int eNumber = Integer.parseInt(eCandidate);

                    if (qNumber + wNumber == eNumber) {
                        System.out.printf("Решение: %s + %s = %s%n", qCandidate, wCandidate, eCandidate);
                        foundSolution = true;
                        break;
                    }
                }
                if (foundSolution) {
                    break;
                }
            }
            if (foundSolution) {
                break;
            }
        }

        if (!foundSolution) {
            System.out.println("Решение не найдено.");
        }
    }
}
