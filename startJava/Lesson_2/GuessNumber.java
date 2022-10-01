import java.util.Random;

class GuessNumber {

    Random rnd = new Random();
    private int hiddenNum = rnd.nextInt(100) + 1;
    private Player player1;
    private Player player2;

    GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        System.out.println("Да начнётся новая игра!\n");
        int count = 0;
        int playerNum = 0;
        String playerName = "";
        do {
            Player player = count % 2 == 0 ? player1 : player2;
            playerName = player.getName();
            System.out.print(playerName + " введите число: ");
            player.inputNumber();
            playerNum = player.getNumber();
            if(playerNum > hiddenNum) {
                System.out.println("\nЧисло " + playerNum + " больше того, что загадал компьютер\n");
            } else if(playerNum < hiddenNum) {
                System.out.println("\nЧисло " + playerNum + " меньше того, что загадал компьютер\n");
            }
            count++;
        } while(playerNum != hiddenNum);
        System.out.println("\nЗагаданное число " + hiddenNum + ". Победил игрок " + playerName);
    }
}