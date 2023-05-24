package org.example;

public class CalculatorDecimal extends AbstractCalculator {

    @Override
    public boolean setA(String x) {
        try {
            a = 0;
            a = Integer.parseInt(x, 10);
            System.out.println("число");
            print(a);
            return true;
        } catch (Exception e) {
            System.out.println("Ошибка преобразования строки в десятичное число");
            return false;
        }
    }

    @Override
    public boolean setB(String x) {
        try {
            b = 0;
            b = Integer.parseInt(x, 10);
            System.out.println("число");
            print(b);
            return true;
        } catch (Exception e) {
            System.out.println("Ошибка преобразования строки в десятичное число");
            return false;
        }
    }
}
