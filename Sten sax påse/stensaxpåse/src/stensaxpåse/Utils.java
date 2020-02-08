package stensaxpåse;

public class Utils {

	
	public String checkPickedValue(String str) {
        String val = "";
        if (str.equals(".")) {
            val = "Sten[.]";
        } else if (str.equals("o")) {
            val = "Påse[o]";
        } else if (str.equals("x")) {
            val = "Sax[x]";
        }
        return val;
    }

    public boolean isPlayerWinner(String playerPick, String computerPick) {

        boolean isPlayerWinner;

        if (playerPick.equals(".") && computerPick.equals("x")) {
            isPlayerWinner = true;
        } else if (playerPick.equals("x") && computerPick.equals("o")) {
            isPlayerWinner = true;
        } else if (playerPick.equals("o") && computerPick.equals(".")) {
            isPlayerWinner = true;
        } else {
            isPlayerWinner = false;
        }
        return isPlayerWinner;
    }

}
