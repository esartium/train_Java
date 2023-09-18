// УСЛОВНЫЕ КОНСТРУКЦИИ

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                            Scanner ob = new Scanner(System.in);
                            System.out.println("Введите первое число ");
                            int bebebe = ob.nextInt();
                            System.out.println("Введите второе число ");
                            int bababa = ob.nextInt();

                            //ОПЕРАТОР SWITCH-CASE:
        int res;
        if (bebebe > bababa) {
            res = bebebe + bababa;
            System.out.println("Результат: " + res);
        } else {
            res = bebebe - bababa;
            System.out.println("Результат: " + res);
        }

// язык java чувствителен к регистру

        //Тип данных boolean:
        boolean yesorno = false; //установили такое значение по приколу
        if (yesorno == false) {
            System.out.println("brblblrl");
        }
        //равносильная запись:
        if (!yesorno) {
            System.out.println("ыыыы");
        }
        //если надо проверить, true ли переменная:
        if (yesorno) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        /*Оператор else if: дополнительный if на случай,
        если предыдущий if был неверный;
        Записывается между if(первым) и else,
        нигде в других местах его писать нельзя;
        операторов else if может быть сколько угодно;
         */
                        Scanner ob_2 = new Scanner(System.in);
                        System.out.println("Введите число: ");
                        float cifra_1 = ob_2.nextFloat();
                        System.out.println("Введите еще одно число: ");
                        float cifra_2 = ob_2.nextFloat();
        if (cifra_1 == cifra_2) {
            System.out.println("fkgklgbktgd");
        } else if (cifra_1 < cifra_2) {
            System.out.println("nnn");
        } else if (cifra_1 > cifra_2) {
            System.out.println("ggg");
        } else {
            System.out.println("gfgh");
        }

        //Несколько условий:
        if (!yesorno || cifra_1 > cifra_2) {
            System.out.println("Или то, или то");
        } else if (!yesorno && cifra_1 == cifra_2) {
            System.out.println("Должны выполняться оба условия");
        }

                            //ОПЕРАТОР SWITCH-CASE:
        /*
        суть: берём переменную и проверяем её
        на множество разных значений; это можно делать
        и с помощью if-else, но switch-case удобнее;

        case - кейсы, то есть случаи;
        с помощью данной конструкции мы проверяем эти случаи;

        проверяем только на равенство какому-либо значению,
        тут нет операций больше/меньше и т.д.
         */

        Scanner ob_3 = new Scanner(System.in);
        System.out.println("Введите еще че-нибудь: ");
        int per = ob_3.nextInt(); //так можно проверять любые типы данных
        switch (per) {
            case 1: //проверяем, не равна ли переменная единице
                System.out.println("bebebe");
                break; //break нужен, чтобы выйти из switch-case
            case 2:
                System.out.println("bububu");
                break;
            case 567:
                System.out.println("567");
                break;
            default: /* играет роль else; то есть,
            если не выполнится ни один из кейсов,
            то выполнится default;

            после default можно не писать break, так как
            он все равно последний, и после него
            нет никаких условий (но можно и написать break)
            */
                System.out.println("default");
            }
        }
    }