public class PlayerManager {
	
public static void main(String[] args) {
            //creating a team
            Team t1 = new Team("Penn State", "Nittany Lions");

            Player pl1 = new Player("Christian", "Campbell", "Cornerback", "Alabama", "Central");
            System.out.println(pl1.getInfo());
            //for example, adding one player to the team t1 created above.

            t1.addPlayer(pl1); 
            //you can repeat this step for adding all the teams

            Player pl2 = new Player("Marcus", "Allen", "Safety", "Maryland", "Dr. Henry A. Wise, Jr");
            System.out.println(pl2.getInfo());
            Player pl3 = new Player("Tommy", "Stevens", "Quarterback", "Indiana", "Decatur Central");
            System.out.println(pl3.getInfo());
            Player pl4 = new Player("Nyeem", "Wartman-White", "Linebacker", "Pennsylvania", "Valley View");
            System.out.println(pl4.getInfo());
            Player pl5 = new Player("George", "Foreman", "Defensive back", "Georgia", "Parkview");
            System.out.println(pl5.getInfo());
            Player pl6 = new Player("Andre", "Robinson", "Right Tackle", "Pennsylvania", "Bishop McDevitt");
            System.out.println(pl6.getInfo());
            Player pl7 = new Player("Malik", "Golden", "Safety", "Connecticut", "Chesire Academy");
            System.out.println(pl7.getInfo());
            Player pl8 = new Player("Koa", "Farmer", "Safety", "California", "Notre Dame");
            System.out.println(pl8.getInfo());
            Player pl9 = new Player("Jake", "Zembiec", "Quarterback", "New York", "Aquinas Institute");
            System.out.println(pl9.getInfo());
            Player pl10 = new Player("Brandon", "Polk", "Wide Receiver", "Virgina", "Briar Woods");
            System.out.println(pl10.getInfo());
            Player pl11 = new Player("Trace", "McSorley", "Quarterback", "Virgina", "Briar Woods");
            System.out.println(pl11.getInfo());

        }

    }
