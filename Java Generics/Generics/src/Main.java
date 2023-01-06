public class Main {
    public static void main(String[] args) {
        FootBallPlayer joe = new FootBallPlayer("Joe");
        BaseBallPlayer tim = new BaseBallPlayer("Tim");
        SoccerPlayer messi = new SoccerPlayer("Messi");

        Team<FootBallPlayer> CSG = new Team<>("CSG");
        CSG.addPlayer(joe);
        //CSG.addPlayer(tim);
        //CSG.addPlayer(messi);

        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago cubs");
        baseBallPlayerTeam.addPlayer(tim);

        //Team<String> stringTeam = new Team<>("this should not work");
        //stringTeam.addPlayer("no-one");

        Team<SoccerPlayer> soccerTeam = new Team<>("argentina club");
        soccerTeam.addPlayer(messi);

        System.out.println(CSG.numPlayers());
    }
}