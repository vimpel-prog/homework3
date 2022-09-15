public class Main {
    public static void main(String[] args) {
//        Zadacha 1
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e = 5;
        double f = 6;

        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной b с типом short равно " + b);
        System.out.println("Значение переменной c с типом int равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

//        Zadacha 2
        float q = 27.12f;
        long w = 987678965549L;
        byte r = 2;
        short t = 786;
        boolean isGood = false;
        float y = -159;
        int u = 897;
        char i = 67;

//        Zadacha 3
        short lists = 480;
        byte ludaStudents = 23;
        byte anyaStudents = 27;
        byte kateStudents = 30;
        int listsForEachStudent = lists / (ludaStudents + anyaStudents + kateStudents);
        System.out.println("На каждого ученика рассчитано " + listsForEachStudent + " листов бумаги");

//        Zadacha 4
        int bottlePerTwoMinutes = 16;
        System.out.println("За 20 минут машины произвела бутылок " + bottlePerTwoMinutes * 10 + " штук ");
        System.out.println("За сутки машины произвела бутылок " + bottlePerTwoMinutes * 30 * 24 + " штук ");
        System.out.println("За 3 дня машины произвела бутылок " + bottlePerTwoMinutes * 30 * 24 * 3 + " штук ");
        System.out.println("За месяц машины произвела бутылок " + bottlePerTwoMinutes * 30 * 24 * 30 + " штук ");

//        Zadacha 5
        byte paintNeeded = 120;
        byte whitePaintNeededForOneClass = 2;
        byte brownPaintNeededForOneClass = 4;
        int classes = paintNeeded / (whitePaintNeededForOneClass + brownPaintNeededForOneClass);
        System.out.println("В школе, где " + classes + " классов, нужно " + whitePaintNeededForOneClass * classes +
                " банок белой краски и " + brownPaintNeededForOneClass * classes + " банок коричневой краски");

//        Zadacha 6
        short bananaNeeded = 5;
        short oneBananaWeight = 80;
        short milkNeededMl = 200;
        short inOneHundredMlMilkGram = 105;
        short iceCreamNeededBriquette = 2;
        short oneBriquetteWeight = 100;
        short eggsNeeded = 4;
        short oneEggWeight = 70;
        int fullWeightProteinCocktailGram = bananaNeeded * oneBananaWeight + milkNeededMl / 100 * inOneHundredMlMilkGram +
                iceCreamNeededBriquette * oneBriquetteWeight + eggsNeeded * oneEggWeight;
        float fullWeightProteinCocktailKg = (float)fullWeightProteinCocktailGram / 1000;
        System.out.println("Вес спорт-завтрака в килограммах равен " + fullWeightProteinCocktailKg);

//        Zadacha 7
        byte nuzhnoSbrosit = 7;
        float variant1 = 0.25f;
        float variant2 = 0.5f;
        float days1 = nuzhnoSbrosit / variant1;
        float days2 = nuzhnoSbrosit / variant2;
        System.out.println(days1);
        System.out.println(days2);
        System.out.println((days2 + days1) / 2);

//        Zadacha 8
        int mashaCash = 67760;
        int denisCash = 83690;
        int kristinaCash = 76230;
        int newMashaCash = mashaCash + mashaCash / 10;
        int newDenisCash = denisCash + denisCash / 10;
        int newKristinaCash = kristinaCash + kristinaCash / 10;
        int mashaRaznica = newMashaCash - mashaCash;
        int denisRaznica = newDenisCash - denisCash;
        int kristinaRaznica = newKristinaCash - kristinaCash;
        System.out.println("Маша теперь получает " + newMashaCash + " рублей. Годовой доход вырос на " + mashaRaznica + " рублей");
        System.out.println("Денис теперь получает " + newDenisCash + " рублей. Годовой доход вырос на " + denisRaznica + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaCash + " рублей. Годовой доход вырос на " + kristinaRaznica + " рублей");


    }
}