package human;

public class EnglishMan extends Human implements ModernHuman {


    public EnglishMan(String name, int age) {
        super(name, age);
    }

    String englishSpeaking(){

        return "I can speak English";
    }

    public String useComputer(){

        return "Modern human can use computer";

    }
}
