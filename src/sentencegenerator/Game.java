package sentencegenerator;

public class Game {

    public String generator(){

        String[] FirstWord = {"kutya", "cica", "hörcsög", "majom"};
        String[] SecondWord = {"csont", "játék", "alom"};
        String[] ThirdWord = {"törés", "megérdemelt", "sok"};

        int firstLength = FirstWord.length;
        int secondLength = SecondWord.length;
        int thirdLength = ThirdWord.length;

        int random1 = (int) (Math.random()*firstLength);
        int random2 = (int) (Math.random()*secondLength);
        int random3 = (int) (Math.random()*thirdLength);

        String sentence = FirstWord[random1] + " " + SecondWord[random2] + " " + ThirdWord[random3];

        return sentence;

    }


}
