package battleship;

import java.util.ArrayList;

public class DotCom {
	private ArrayList<String> locationCells;
	private String name;

	public void setLocaitonCells(ArrayList<String> loc) {
		locationCells = loc;
	}

	public void setName(String n) {
		name = n;
	}

	public String checkYourself(String userInput) {
		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);
			if (locationCells.isEmpty()) {
				System.out.println("Ouch! You sunk " + name + "     :( ");
				result = "kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}

}
