public class Treadmill implements Barrierable {

    private String name;
    private int length;

    public Treadmill(String name, int length){
        this.name = name;
        this.length = length;
    }

    @Override
    public boolean barriers(Participantsble j) {
        System.out.println("Беговая дорожка " + getLength() + " м");

        j.run();

        if(getLength() < j.getRunDistance()){
            System.out.println("Успешно пробежал");
            return true;
        }else {
            System.out.println("Не смог пробежать");
            return false;
        }



    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }
}
