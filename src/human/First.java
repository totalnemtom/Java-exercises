package human;

import arrayvsarrayList.ArrayVsArrayList;

import java.util.ArrayList;

public class First {

    public static void main(String[] args) {
        String result = censor("a barom nagyon aranyos barom", "barom", "***");
        System.out.println(result);

        EnglishMan secondHumanWhoIsEnglish = new EnglishMan("Lajos", 20);

        String isSecondHumanHasName = secondHumanWhoIsEnglish.printName();

        System.out.println(isSecondHumanHasName);
        System.out.println(secondHumanWhoIsEnglish.englishSpeaking());
        System.out.println(secondHumanWhoIsEnglish.useComputer());

        ArrayList<Human> englishMen = new ArrayList<Human>();
        EnglishMan watson = new EnglishMan("Watson", 27);

        englishMen.add(watson);
        watson = (EnglishMan) englishMen.get(0);
        System.out.println(englishMen.get(0));
        System.out.println((englishMen.get(0).toString()));

    }

    static String censor( String txt, String toChange, String newWord){
        String toReturn = txt.replaceAll(toChange,newWord);

        return toReturn;
    }
}