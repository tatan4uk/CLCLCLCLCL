package org.example;

public abstract class AbstractCalculator {
    int a = 0;
    int b = 0;


    /**
     * Метод вывода числа в разных СС
     * @param t - число
     */
    static void print(int t) {
        System.out.println("2СС = " + Integer.toBinaryString(t));
        System.out.println("8СС = " + Integer.toOctalString(t));
        System.out.println("10СС = " + t);
        System.out.println("16СС = " + Integer.toHexString(t));
    }


    /**
     * Метод устанавливает значение первого операнда
     * @param x - строка, которую нужно преобразовать в число
     * @return - успешность преобразования
     */
    public boolean setA(String x) {
        try {
            a = Integer.parseInt(x);
            System.out.println("число");
            return true;
        } catch (Exception e) {
            System.out.println("Ошибка преобразования строки в десятичное число");
            return false;
        }
    }

    /**
     * Метод устанавливает значение второго операнда
     * @param x - строка, которую нужно преобразовать в число
     * @return - успешность преобразования
     */
    public boolean setB(String x) {
        try {
            b = Integer.parseInt(x);
            System.out.println("число");
            return true;
        } catch (Exception e) {
            System.out.println("Ошибка преобразования строки в десятичное число");
            return false;
        }
    }

    /**
     * Метод сложения
     * @return - результат сложения
     */
    public int plus() {
        int result = a + b;
        print(result);
        return result;
    }

    /**
     * Метод вычитания
     * @return - результат вычитания
     */
    public int minus() {
        int result = a - b;
        print(result);
        return result;
    }

    /**
     * Метод умножения
     * @return - результат умножения
     */
    public int multiplication() {
        int result = a * b;
        print(result);
        return result;
    }

    /**
     * Метод деления
     * @return - результат деления
     */
    public int divide() {
        try {
            if (b == 0) {
                throw new Exception("Нельзя делить на ноль");
            }
            int result = a / b;
            print(result);
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}
