public class Robot implements Participantsble {
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight ){
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public void run() {
        System.out.println(name + " бегает " + getRunDistance() + " м");
    }

    @Override
    public void jump() {
        System.out.println(name + " перепрыгивает " + getJumpHeight() + " м");
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeight() {
        return this.jumpHeight;
    }
}
