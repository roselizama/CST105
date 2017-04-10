
public class OffensivePlayers {

	
	public static void main(String[] args) { 
        int w = Integer.parseInt(args[0]);
        int[] touchdown = {
            3,554
        };
     

        String[] categories = {
            "Tom Brady TD",
            "Matt Ryan TD",
            "Bantam Weight",
            "Super Bantam Weight",
            "Feather Weight",
            "Super Feather Weight",
            "Light Weight",
            "Super Light Weight",
            "Welter Weight",
            "Super Welter Weight",
            "Middle Weight",
            "Super Middle Weight",
            "Light Heavy Weight",
            "Super Light Heavy Weight",
            "Cruiser Weight",
            "Super Cruiser Weight",
            "Heavy Weight",
            "Super Heavy Weight"
        };

        for (int i = 0; i < touchdown.length; i++) {
            if (w < touchdown[i]) {
                System.out.println(categories[i]);
                break;
            }
        }
    }
}
