public class Main {
    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer tim = new BaseBallPlayer("Tim");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team CSG = new Team("CSG");
        CSG.addPlayer(joe);
        CSG.addPlayer(tim);
        CSG.addPlayer(messi);

        System.out.println(CSG.numPlayers());
    }
}