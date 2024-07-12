public class Main {
    public static void main(String[] args) {

        byte t = 100;
        short a = 15000;
        int b = 130000;
        long c = 500000L;
        float d = 5.340f;
        double e = 2.05846;
        System.out.println("Знчение переменной t c типом byte равно " + t );
        System.out.println("Знчение переменной a c типом short равно " + a );
        System.out.println("Знчение переменной b c типом int равно " + b );
        System.out.println("Знчение переменной c c типом long равно " + c );
        System.out.println("Знчение переменной d c типом float равно " + d );
        System.out.println("Знчение переменной e c типом double равно " + e );


        float aa = 27.12f;
        long bb = 987678965549L;
        double cc = 2.786;
        short dd = 569;
        short ee = -159;
        int ff = 27897;
        byte gg = 67;




        byte studentsLyudmilaPavlovna = 23;
        byte studentsAnnaSergeevna = 27;
        byte studentsEkaterinaSergeevna = 30;
        short paperPurchased = 480;

        int totalStudents = studentsAnnaSergeevna + studentsLyudmilaPavlovna + studentsEkaterinaSergeevna;
        int eachStudentPapers = paperPurchased/totalStudents;

        System.out.println("На каждого ученика расчитано " + eachStudentPapers + " листов бумаги.");




        byte machinePerformanceBottle = 16;
        byte timePerfomanceMinute = 2;

        byte minutesWork = 20;
        int totalBottleTwentyMinutes = (minutesWork/timePerfomanceMinute)*machinePerformanceBottle;

        byte dayWork = 1;
        byte inDayHours = 24;
        byte inHoursMinutes = 60;
        int inDayMinutes = inDayHours*inHoursMinutes;
        int totalBottleDayWork = (inDayMinutes/timePerfomanceMinute)*machinePerformanceBottle;

        byte totalDaysWork = 3;
        int totalBottleThreeDayWork = (((totalDaysWork*inDayHours)*inDayMinutes)/timePerfomanceMinute)*machinePerformanceBottle;

        byte totalMonthWork = 1;
        byte inOneMonthDay = 30;
        int totalDaysInTotalMonthWork = inOneMonthDay*totalMonthWork;
        int totalBottleOneMonthWork = (((totalDaysInTotalMonthWork*inDayHours)*inDayMinutes)/timePerfomanceMinute)*machinePerformanceBottle;

        System.out.println("За " + minutesWork + " минут машина произвела " + totalBottleTwentyMinutes + " штук бутылок");
        System.out.println("За " + dayWork + " сутки машина произвела " + totalBottleDayWork + " штук бутылок");
        System.out.println("За " + totalDaysWork + " дня машина произвела " + totalBottleThreeDayWork + " штук бутылок");
        System.out.println("За " + totalMonthWork + " месяц машина произвела " + totalBottleOneMonthWork + " штук бутылок");



        byte totalAmountPaint = 120;
        byte whitePaintOneCabinet = 2;
        byte brownPaintOneCabinet = 4;
        int onePaintCabinet = whitePaintOneCabinet + brownPaintOneCabinet;
        int totalCabinetSchool = totalAmountPaint/onePaintCabinet;
        int totalWhitePaint = whitePaintOneCabinet*totalCabinetSchool;
        int totalBrownPaint = brownPaintOneCabinet*totalCabinetSchool;

        System.out.println("В школе, где "+ totalCabinetSchool + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски.");




        byte totalBanana = 5;
        byte weightOneBananaGr = 80;
        int totalWeightBanana = weightOneBananaGr*totalBanana;

        short totalMilkMilliliters = 200;
        byte hundredMillilitersMilk = 100;
        byte weightHundredMlMilk = 105;
        int totalWeightMilk=(totalMilkMilliliters/hundredMillilitersMilk)*weightHundredMlMilk;


        byte totalBriquettesIceCream = 2;
        byte weightOneBriquettesIceCreamGr = 100;
        int totalWeightIceCream = weightOneBriquettesIceCreamGr*totalBriquettesIceCream;

        byte totalEggs = 4;
        byte weightOneEggsGr = 70;
        int totalWeightEggsGr = weightOneEggsGr*totalEggs;

        int grTotalWeightBreakfast = totalWeightBanana+totalWeightMilk+totalWeightEggsGr+totalWeightIceCream;
        System.out.println("Вес завтрака составил " + grTotalWeightBreakfast + " гр.");

        int grPerKg=1000;
        float weightKgBreakfast = grTotalWeightBreakfast/(float)grPerKg;
        System.out.println("Вес завтрака в киллограммах составил " + weightKgBreakfast + " кг.");




        byte weigtLossKg = 7;
        int kgPerGr = 1000;
        int weightLossGr = weigtLossKg*kgPerGr;

        short needLoseWeightEveryDayGr = 250;
        int requriedNumberDays = weightLossGr/needLoseWeightEveryDayGr;


        short ifNeedLoseWeightEveryDayGr = 500;
        int thatRequriedNumberDays = weightLossGr/ifNeedLoseWeightEveryDayGr;


        System.out.println("Если сбрасывать каждый день по "+ needLoseWeightEveryDayGr + " гр. необходимо " + requriedNumberDays + " дней.");
        System.out.println("Если сбрасывать каждый день по "+ ifNeedLoseWeightEveryDayGr + " гр. необходимо " + thatRequriedNumberDays + " дней.");






        int incomeMasha = 67760;
        int incomeDenis = 83690;
        int incomeKristina = 76230;

        float incomeIncreases = 0.10f;

        float incomeIncreasesMasha = incomeMasha*incomeIncreases;
        float incomeBecomeMasha = incomeMasha+incomeIncreasesMasha;

        float incomeIncreasesDenis = incomeDenis*incomeIncreases;
        float incomeBecomeDenis = incomeDenis+incomeIncreasesDenis;

        float incomeIncreasesKristina = incomeKristina*incomeIncreases;
        float incomeBecomeKristina = incomeKristina+incomeIncreasesKristina;


        System.out.println("Маша теперь получает " + incomeBecomeMasha + " рублей. Ее годовой доход вырос на " + incomeIncreasesMasha+ " рублей.");
        System.out.println("Маша теперь получает " + incomeBecomeDenis + " рублей. Ее годовой доход вырос на " + incomeIncreasesDenis+ " рублей.");
        System.out.println("Маша теперь получает " + incomeBecomeKristina + " рублей. Ее годовой доход вырос на " + incomeIncreasesKristina+ " рублей.");



    }
}