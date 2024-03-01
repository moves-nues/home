public class Main {
    public static void main(String[] args) {
        nt i = 0;
        int month = 0;
        while (i <= 2459000) {
            i = i + 15000;
            month = month + 1;
            System.out.println("Месяц " + month + " , денег будет накоплено " + i + " руб");
        }

        i = 0;
        while (i < 10) {
            i = i + 1;
            System.out.print(i + " ");
        }
        System.out.println();
        int c = 11;
        for (; c > 1;) {
            c = c - 1;
            System.out.print(c + " ");
        }
        System.out.println();

        int totalPeople = 12000000;
        int b = 0;
        while (b < 10) {
            b = b + 1;
            totalPeople = totalPeople / (1000 + 17 -9) + totalPeople ;
            System.out.println("Год " + b + " , численность населения составит " + totalPeople + " человек");
        }



        int totalMonth = 0;
        for (int d = 15000; d <= 12000000; d = (int) (d * 0.07 + d)) {
            totalMonth = totalMonth + 1;
            System.out.println("Месяц " + totalMonth + " , сумма накоплений равна " + d + " рублей");
        }

        int totalMonths = 0;
        int e = 15000;
        while (e < 12000000) {
            e = e + e / 100*7;
            totalMonths = totalMonths + 1;
            if (totalMonths % 6 == 0) {
                System.out.println("Месяц " + totalMonths + " , сумма накоплений равна " + e + " рублей"); }
        }


        int d = 15000;
        int month2 = 0;
        while (month2 < 9*12) {
            month2 = month2 + 1;
            d = d + d/100*7;
            if (month2 % 6 == 0){
                System.out.println("За каждые " + month2 + " месяцев сумма накоплений будет равна " + d + " рублей");
            }
        }


        int f = 1;
        while (f <= 31) {
            System.out.println("Сегодня пятница, " + f + "-е число. Нужно дпоисать отчет");
            f = f + 7;
        }


        int year = 2017;
        int one = 0;
        int two = year + 100;
        while (one < two) {
            if (one > year - 200) {
                System.out.println(one); }
            one = one + 79;
        }

    }
}