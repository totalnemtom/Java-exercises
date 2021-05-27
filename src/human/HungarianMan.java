package human;

public final class HungarianMan extends Human {

    private final String origin;

    @Override
    public String toString() {
        return "HungarianMan{" +
                "origin='" + origin + '\'' +
                "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                '}';
    }

    public HungarianMan(String name, int age){
        super(name, age);
        this.origin = "Hungarian";
    }

    public String getOrigin() {
        return origin;
    }


}
