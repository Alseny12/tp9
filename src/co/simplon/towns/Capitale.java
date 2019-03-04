package co.simplon.towns;

public class Capitale extends Ville {
	String monument;
	public Capitale (String monument,String nom, String pays, int nbHabitants) {
		super(nom,pays,nbHabitants);
		this.monument = monument;	
	}
	public String toString() {
		String str = monument;
		str += super.toString();
		return str;
	}
}
