package co.simplon.peoples;

public class Personne {
	private String nom;
	private String prenom;
	private int age;
	private String adress;
	private Ville ville;
	public Personne() {
		this.nom="rien";
		this.prenom="rien";
		this.age=0;
		
	}	public Personne(String nPersonne,String pPersonne,int agPersonne,String aPersonne,Ville ville) {
		this.nom = nPersonne;
		this.prenom = pPersonne;
		this.age = agPersonne;
		this.adress = aPersonne;
		this.ville = ville;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne p1 = new Personne ("keita","mamady",30,"87 chemin des tuileries",new Ville("nice","fr",20000));
		p1.toString();
	}
	public String toString() {
		ville.display();
		return "Non" + nom + " prenom " + prenom + " Age " + age + " adress " + adress;
		
	}

}

