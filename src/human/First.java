package human;

public class First {

    public static void main(String[] args) {
        String result = censor("a barom nagyon aranyos barom", "barom", "***");
        System.out.println(result);

        EnglishMan secondHumanWhoIsEnglish = new EnglishMan("Lajos", 20);

        String isSecondHumanHasName = secondHumanWhoIsEnglish.printName();

        System.out.println(isSecondHumanHasName);
        System.out.println(secondHumanWhoIsEnglish.englishSpeaking());
        System.out.println(secondHumanWhoIsEnglish.useComputer());


    }

    static String censor( String txt, String toChange, String newWord){
        String toReturn = txt.replaceAll(toChange,newWord);

        return toReturn;
    }
}