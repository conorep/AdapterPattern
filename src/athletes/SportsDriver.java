package athletes;

public class SportsDriver
{
    public static void main(String[] args)
    {
        SportsNews news = new SportsNews();

        BaseballAthlete nick = new BaseballAthlete("Nick", "Notnick");
        nick.addStat("batting average", 0.12);
        nick.addStat("homeruns", 30);
        FootballAthlete kramer = new FootballAthlete("Kramer", 'L', "Kramingston");
        kramer.newStat("touchdowns", 10);
        kramer.newStat("rushing yards", 500);

        BaseballAthlete caren = new BaseballAthlete("Caren", "Noners");
        caren.addStat("batting average", 0.20);
        caren.addStat("homeruns", 5);

        FootballAthlete craren = new FootballAthlete("Craren", 'C', "Elamianist");
        craren.newStat("touchdowns", 0);
        craren.newStat("rushing yards", 28.5);


        news.trackAthlete(new BaseballAdapter(nick));
        news.trackAthlete(new FootballAdapter(kramer));
        news.trackAthlete(new BaseballAdapter(caren));
        news.trackAthlete(new FootballAdapter(craren));

        news.printStats();
    }
}
