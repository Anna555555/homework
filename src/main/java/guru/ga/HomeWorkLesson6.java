package guru.ga;

public class HomeWorkLesson6 {

public static void main(String[]args){

    byte aByte = 100;
    byte fByte = 101;
    System.out.println("aByte+fByte"); //переполнение

    int a = 15;
    int b = 7;
    System.out.println("Сумма: a + b = " + (a + b));
    System.out.println("Разность: a - b = " + (a - b));
    System.out.println("Умножение: a * b = " + (a * b));
    System.out.println("Деление: a / b = " + (a / b));
    System.out.println("Остаток от деления: a % b = " + (a % b));

    if (a>b) {
        System.out.println(true);
    }
    else {
        System.out.println(false);
    }
}
}