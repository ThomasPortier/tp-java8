package lambdas;

public class TestClassAnonym {

	public static void main(String[] args) {
		
		// Premiere etape : on supprime le code " admnistritif" de la methode
		// Seconde etape : je peux supprimer les accolades , ET le return, a droite de la fleche car
		// car le corps de la methode me contient qu'une seule ligne de code;
		// Troisieme etape : je peux supprimer le type du parametre d'entree car java les connais deja.
		Mapper mapper = compte ->  new Personne(compte.getSolde());
		
        // Mapper mapper = (CompteCourant compte) ->  new Personne(compte.getSolde());
		// TODO Auto-generated method stub
		CompteCourant cc = new CompteCourant();
		cc.setSolde(150.0);

		Personne personne = mapper.map(cc);
		System.out.println(personne.getSolde());
	}

}
