//Данные от пользователя, математические операции

                        //ВВОД ДАННЫХ:

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cinner = new Scanner(System.in); /*cinner - объект
        класса Scanner; в этой строчке мы выделили память для этого объекта;
        параметр System.in значит, что in - даннын вводятся, мы получаем их
        от пользователя
        */

        cinner.nextLine(); /* вызвали метод объекта;
        эта функция значит, что следующую строку нужно будет считать
        (следующая строка - та, которую вводит пользователь);
        можем вводить что угодно, но оно будет считаться строкой.
        */

        //Как сохранить введённые данные в переменную:
        Scanner noviy = new Scanner(System.in);
        System.out.println("Введите бррбрлррбрл");
        String brlbrbr = noviy.nextLine();
        System.out.println("Брллблрбрл: " + brlbrbr);

        //Как получить НЕ строки:
        Scanner ob_2 = new Scanner(System.in);
        System.out.println("Введите число");
        int chislo = ob_2.nextInt(); //если ввести через этот метод строку, то будет ошибка
        System.out.println("Введённое число: " + chislo);

        //Другие методы:
        // byte per1 = ob_2.nextByte();
        // boolean per2 = ob_2.nextBoolean();
        // float per3 = ob_2.nextFloat();
        // и т.п.;

                        //МАТЕМАТИЧЕСКИЕ ОПЕРАЦИИ:

        short a = 50, b = 10; /*при инициализации
        переменные одного типа можно писать в одну строку */

        // c = a + b;
        /*ошибка, так как есть риск выйти
        за границы допустимого для этого типа диапазона
        */
        //решение ошибки:
        int c = a + b;
        System.out.println("Результат: " + c);

        /* аналогично, с помощью знаков "-", "*",
        выполняются операции вычитания и умножения;
        при делении, если используются целочисленные типы данных,
        цифры после точки отбрасываются;
        остаток от деления - "%";
         */

        //Сокращённые математические действия:
        //вместо
        //c = c + 7;
        //пишем:
        //c += 7;
        /*
        также можно:
        -=
        *=
        /=
        %=
        */
        // ИЛИ c--, c++;

                            // КАЛЬКУЛЯТОР:

        Scanner ob = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        float n_1 = ob.nextFloat();
        System.out.println("Введите второе число: ");
        float n_2 = ob.nextFloat();

        float res1 = n_1 + n_2;
        float res2 = n_1 - n_2;
        float res3 = n_1 * n_2;
        float res4 = n_1 / n_2;
        float res5 = n_1 % n_2;

        System.out.println("Результат: ");
        System.out.println(res1 + "\n" + res2 + "\n" + res3 + "\n" + res4 + "\n" + res5 );













        }
    }
