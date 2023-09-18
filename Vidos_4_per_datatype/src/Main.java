//Переменные и типы данных

/* Переменная - ячейка в памяти компьютера,
в которой хранятся данные
 */

public class Main {
    public static void main(String[] args) {

        int integer;
        integer = 23454546;
        System.out.println(integer);

        integer = 7;
        System.out.println(integer);

        //Быстро написать "System.out.println()": sout -> enter

        //Вывод текста и переменной вместе:
        System.out.println("Бебебе " + integer + " бабаба)))");

        /*
        тип byte - для небольших целых чисел от -128 до 127;
        для хранения небольших чисел лучше использовать byte, а не int, так как
        для хранения переменной типа byte требуется один байт, а для int - 4 байта.
         */

        byte aoao = 127;
        System.out.println(aoao);

        /*
        Другие типы данных для хранения целых чисел:
        Тип short: от -32768 до 32767 (занимает 2 байта);
        Тип int: от -2147483648 до 2147483647 (занимает 4 байта);
        Тип long: от -9 223 372 036 854 775 808 до -9 223 372 036 854 775 807 (занимает 8 байт).
         */

        //Числа с точкой:
        float n = 56.78f; //в конце добавляется буква f
        System.out.println(n);
        double nn = 567.899; /*можно написать в 2 раза больше цифр после запятой,
        чем в float; не нужно писать букву в конце (по желанию можно поставить букву d) */
        double nnn = 567.899789d;
        System.out.println(nn + " n " + nnn);

        //Символы и строки:
        char simvol = 'b'; //одинарные кавычки!! В char хранится один символ (не обязательно буква);
        String stroka = "brlbrllrblrbl"; //двойные кавычки; хранится больше одного символа.
        System.out.println(simvol);
        System.out.println(stroka);

        //True/false:
        boolean YESNO = true;
        boolean NOYES = false;
        }
    }
