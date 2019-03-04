package co.simplon.peoples;
//op
public class Employer extends Personne{
	private String entreprise;
	private int salaire;
	private Ville ville;
	public Employer(String nPersonne,String pPersonne,int agPersonne,String aPersonne,Ville ville,String entreprise,int salaire) {
		super(nPersonne,pPersonne,agPersonne, aPersonne,ville);
		this.entreprise=entreprise;
		this.salaire=salaire;
		
	}
	public String toString() {
		
		String str = super.toString()+" "+this.entreprise + this.salaire;
		return str;
	}
}
