/* Вычислить n-ое треугольного число (сумма чисел от 1 до n),
   n! (произведение чисел от 1 до n)
*/

public class Sem1_Task1 {
    public static void main(String[] args) {
        int n = 5; // Задайте значение n

        int triangleNumber = calculateTriangleNumber(n);
        long factorial = calculateFactorial(n);

        System.out.println("Треугольное число для n = " + n + ": " + triangleNumber);
        System.out.println("Факториал числа n = " + n + ": " + factorial);
    }

    // Метод для вычисления n-ого треугольного числа
    public static int calculateTriangleNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Метод для вычисления факториала числа n
    public static long calculateFactorial(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}

