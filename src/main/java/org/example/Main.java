package org.example;

import java.util.Scanner;

public class Main {
    public static int inputForMenu(Scanner scanner) {
        try {
            int menuInput;
            while (true) {
                String inputText = scanner.nextLine();
                if (inputText.matches("^\\d{0,10}$")) { // проверяем это циферы?
                    menuInput = Integer.parseInt(inputText);
                    break;
                } else {
                    throw new Exception("Введено не число");
                }

            }
            return menuInput;
        } catch (Exception e) {
            System.out.println("Повторите выбор пункта меню");
            return 0;
        }
    }

    // 2сс 8сс 10сс 16сс, + - / * ,
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean firstMenu = true;
        boolean secondMenu = false;
        int menuInput;

        while (firstMenu) {
            System.out.println(
                    """
                            \nВыберете систему счисления для вычисления:
                            1. Двоичная
                            2. Восьмеричная
                            3. Десятичная
                            4. Шестнадцатиричная
                            5. Выход

                            """);
            menuInput = inputForMenu(scan);
            switch (menuInput) {
                case 1:
                    System.out.println("Выбрана Двоичная система счисления\n");
                    firstMenu = false;
                    secondMenu = true;
                    break;
                case 2:
                    System.out.println("Выбрана Восьмиричная система счисления\n");
                    firstMenu = false;
                    secondMenu = true;
                    break;
                case 3:
                    System.out.println("Выбрана Десятичная система счисления\n");
                    firstMenu = false;
                    secondMenu = true;
                    break;
                case 4:
                    System.out.println("Выбрана Шестнадцатиричная система счисления\n");
                    firstMenu = false;
                    secondMenu = true;
                    break;
                case 5:
                    System.out.println("Выход из программы...\n");
                    firstMenu = false;
                    secondMenu = false;
                    break;
                default:
                    System.out.println("Пункт меню с таким номером отсутсвует");
                    firstMenu = true;
                    secondMenu = false;
                    break;
            }
            while (secondMenu) {
                boolean firstNumber = false;
                boolean secondNumber = false;
                System.out.println(
                        """
                                \nВыберете операцию:
                                1. Сложение
                                2. Вычитание
                                3. Умножение
                                4. Деление
                                5. Выбор системы счистления
                                6. Выход
                                """);
                menuInput = inputForMenu(scan);
                switch (menuInput) {
                    case 1:

                        System.out.println("Сложение\n");
                        System.out.println("Введите первое число\n");
                        System.out.println("Введите второе число\n");
                        System.out.println();
                        if(firstNumber && secondNumber)
                        {System.out.println("Ответ:");}
                        else {
                            if(!firstNumber){
                                System.out.println("Первое число введено неверно");
                            }
                            if(!secondNumber){
                                System.out.println("Второе число введено неверно");
                            }
                        }
                        System.out.println("---");
                        firstMenu = false;
                        secondMenu = true;
                        break;
                    case 2:
                        System.out.println("Вычитание\n");
                        System.out.println("Введите первое число\n");
                        System.out.println("Введите второе число\n");
                        System.out.println();
                        if(firstNumber && secondNumber)
                        {System.out.println("Ответ:");}
                        else {
                            if(!firstNumber){
                                System.out.println("Первое число введено неверно");
                            }
                            if(!secondNumber){
                                System.out.println("Второе число введено неверно");
                            }
                        }
                        System.out.println("---");
                        firstMenu = false;
                        secondMenu = true;
                        break;
                    case 3:
                        System.out.println("Умножение\n");
                        System.out.println("Введите первое число\n");
                        System.out.println("Введите второе число\n");
                        System.out.println();
                        if(firstNumber && secondNumber)
                        {System.out.println("Ответ:");}
                        else {
                            if(!firstNumber){
                                System.out.println("Первое число введено неверно");
                            }
                            if(!secondNumber){
                                System.out.println("Второе число введено неверно");
                            }
                        }
                        System.out.println("---");
                        firstMenu = false;
                        secondMenu = true;
                        break;
                    case 4:
                        System.out.println("Деление\n");
                        System.out.println("Введите первое число\n");
                        System.out.println("Введите второе число\n");
                        System.out.println();
                        if(firstNumber && secondNumber)
                        {System.out.println("Ответ:");}
                        else {
                            if(!firstNumber){
                                System.out.println("Первое число введено неверно");
                            }
                            if(!secondNumber){
                                System.out.println("Второе число введено неверно");
                            }
                        }
                        System.out.println("---");
                        firstMenu = false;
                        secondMenu = true;
                        break;
                    case 5:
                        firstMenu = true;
                        secondMenu = false;
                        break;
                    case 6:
                        System.out.println("Выход из программы...\n");
                        firstMenu = false;
                        secondMenu = false;
                        break;
                    default:
                        System.out.println("Пункт меню с таким номером отсутсвует");
                        firstMenu = false;
                        secondMenu = true;
                        break;
                }
            }
        }

    }
}