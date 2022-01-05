package superexample.codingslice;


public class Main {

    public static void main(String[] args) {

        Football john = new Football("John");
        BasketBall david = new BasketBall("David");
        Soccer james = new Soccer("Abbott");

        Team<Football> liverPool = new Team<>("liver pool");
        liverPool.addPlayer(john);
        System.out.println(liverPool.numPlayers());

    }

}
