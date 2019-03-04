package co.simplon.peoples;

public class Ville {
	private String nom;
	 private String pays; // nom du Pays private 
	 int nbHabitants; // nombre d'habitant
	 public Ville(String nom, String pays, int nbHabitants) {
		 this.nom = nom; 
		 this.pays = pays; 
		 this.nbHabitants = nbHabitants;
	 }
		 public void display() {
			 System.out.println(nom + " " + pays + " " + nbHabitants);
		 }
		 
			// getter 
			 public String getNom() {
			  return nom;
			 }
	    	// setter 
		    public void setNom(String nom) { 
		    	this.nom = nom;
		    }
		 // getter 
		    public String getPays() {
		    	return pays;
		    }
		 // setter 
		    public void setPays(String pays) {
		    	this.pays = pays;
		    }
		 // getter 
		    public int getNbHabitants() { 
		    	return nbHabitants;
		    }
		 // setter 
		    public void setNbHabitants(int nbHabitants) { 
		    	if(nbHabitants < 0){ nbHabitants = 0;
		    }// A MODIFIER 
		    	else {
		    		System. out. println(nbHabitants) ; 
		    		}
		    	 this.nbHabitants = nbHabitants; 
		    	 }
		    	}
		    
