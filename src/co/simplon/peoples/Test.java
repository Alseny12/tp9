package co.simplon.peoples;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stubu
		Ville v1 = new Ville("toulouse","france",20000);
		Employer tab[]= new Employer[11];
		tab[0] = new Employer("keita","alseny",26,"87 chemin des tuileries",v1,"airbus",1200);
		tab[1] = new Employer("sylla","djenabou",30,"87 chemin des tuileries",v1,"orange",1500);
		tab[2] = new Employer("bousquet","jerome",22,"87 chemin des tuileries",v1,"netflix",1400);
		tab[3] = new Employer("bah","gando",19,"87 chemin des tuileries",v1,"dsi",1900);
		tab[4] = new Employer("laude","timoté",22,"87 chemin des tuileries",v1,"capgé",1300);
		tab[5] = new Employer("toure","mohamed",29,"87 chemin des tuileries",v1,"sofra",1200);
		tab[6] = new Employer("diallo","fode",30,"87 chemin des tuileries",v1,"art",1100);
		tab[7] = new Employer("benzema","karim",35,"87 chemin des tuileries",v1,"madrid",1800);
		tab[8] = new Employer("cervau","allan",38,"87 chemin des tuileries",v1,"simplon",1600);
		tab[9] = new Employer("wilkinson","aicha",21,"87 chemin des tuileries",v1,"lcl",1700);
		tab[10] = new Employer("conde","alpha",41,"87 chemin des tuileries",v1,"free",1700);
	
	for (int i = 0;i<tab.length;i++)	{
		System.out.println(tab[i]);
	}
		
		

	}

}
