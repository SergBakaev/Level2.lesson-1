public class Main {
    public static void main(String[] args) {
        
    Participantsble[] participants = {
        new Human("Сергей", 300, 2),
        new Cat("Мурзик", 250,4),
        new Robot("Терминатор", 50, 5)
     };


    Barrierable[] barrier = {
        new Treadmill("Беговая дорожка", 200),
        new Wall("Стена", 3)
        
     };

        for( int i = 0; i < participants.length; i++) {
            boolean result = true;
            for(int j = 0; j < barrier.length; j++){
                result = barrier[j].barriers(participants[i]);
                if(!result){
                    break;
                }
            }

            if (result) {
                System.out.println("Выполнил");
            } else {
                System.out.println("Не выполнил");
            }
        }

    }
}
