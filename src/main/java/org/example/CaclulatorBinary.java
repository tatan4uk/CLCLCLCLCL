package org.example;

public class CaclulatorBinary extends CalculatorDecimal {


    @Override
    public boolean setA(String x) {
        try {
            a = 0;
            a = Integer.parseInt(x, 2);
            System.out.println("число");
            print(a);
            return true;
        } catch (Exception e) {
            System.out.println("Ошибка преобразования строки в бинарное число");
            return false;
        }
    }

    @Override
    public boolean setB(String x) {
        try {
            b = 0;
            b = Integer.parseInt(x, 2);
            System.out.println("число");
            print(b);
            return true;
        } catch (Exception e) {
            System.out.println("Ошибка преобразования строки в бинарное число");
            return false;
        }
    }
}