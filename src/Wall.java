public class Wall implements Barrierable {

    private String name;
    private int height;


    public Wall(String name,  int height){
        this.name = name;
        this.height = height;
    }


    @Override
    public boolean barriers(Participantsble j) {
        System.out.println("Cтена " + getHeight() + " м");

        j.jump();

        if(getHeight() < j.getJumpHeight()){
            System.out.println("Перепрыгнул");
            return true;
        }else {
            System.out.println("Не перепрыгнул");
            return false;
        }




    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }
}
