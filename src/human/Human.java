package human;

public abstract class Human {
    private String name;
    private int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    String printName(){

        return this.name == null ? "Nincs név" : "Név: " + this.name;
    }

    String getName(){

        return this.name;
    }

    int getAge(){

        return this.age;
    }

    @Override
    public String toString(){
        return "[name: " + this.name +
                " age: " + this.age + "]";
    }

}
