package human;

public final class HungarianMan extends Human {

    private final String origin;

    public HungarianMan(String name, int age, String origin){
        super(name, age);
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }
}
