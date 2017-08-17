package tpLambda;

import java.util.List;

public class TestPanier {

	public static void main(String[] args) {
		Panier panier = new Panier();
		panier.getArticles().add(new Article("Coca-Cola", "Boisson", 2.5, false));
		panier.getArticles().add(new Article("Orangina", "Boisson", 2.5, false));
		panier.getArticles().add(new Article("Bière sans alcool", "Boisson", 4.2, true));
		panier.getArticles().add(new Article("Spaghetti", "Pates", 1.8, false));
		panier.getArticles().add(new Article("Lasagnes", "Pates", 3.1, true));
		panier.getArticles().add(new Article("Ramen", "Pates", 3.5, false));
		panier.getArticles().add(new Article("Beurre salé", "Produits laitiers", 1.8, true));
		panier.getArticles().add(new Article("Camembert", "Produits laitiers", 2.8, false));
		panier.getArticles().add(new Article("Yaourth", "Produits laitiers", 3.1, false));
		// En méthode impérative:
		
	//panier.filtre();

		// a- écrire une méthode dans la classe panier qui filtre les articles et retourne
		// uniquement les articles du panier qui sont en stock (enRupture=false)
	//panier.filtreGenerique(true, 3);
		// b- écrire une méthode dans la classe panier un peu plus générique
		// qui prend en parameter stock=O/N et un prix maximum et qui retourne la liste
		// des articles du panier qui correspondent aux critères (cf. exemple 1)
		// c- vérifier que la méthode fonctionne en testant divers cas de figures.
		// Exemple (1) de ce qu’il faut obtenir
	//	List<Article> articles = panier.filtrer(true, 3);
		//assert articles.size()==4;
		// Ecrire maintenant une interface Filtre qui a une seule méthode :
		// boolean accept(Article article)
		// Ajouter une annotation à cette interface de manière à ce qu’elle ne puisse avoir
		// qu’une seule méthode
		// Ecrire une classe qui implémente l’interface Filtre. La méthode de cette classe
		// retourne true uniquement si l’article est en stock.

		// Ecrire une classe qui implémente l’interface Filtre. La méthode de cette classe
		// retourne true uniquement si l’article est en stock et si son prix n’excède pas un
		// montant (en dur pour l’instant).
		// Modifier la méthode de la classe panier précédente afin qu'elle prenne en paramètre un
		// filtre. Exemple ci-dessous :
	//	articles = 
		//panier.filtreBis(new FiltrePrix());
		IFiltre filtreAnonyme = article -> !article.isEnRupture();
		
		IFiltre filtreAnonymebis = (Article article) -> 
			 !article.isEnRupture();
		
		IFiltre filtreAnonymeter = (Article article) -> {
				return !article.isEnRupture();};
		
		IFiltre filtreAnonymequad = new IFiltre() {
			@Override
			public boolean accept(Article article) {
				return article.isEnRupture();
			}
		};
		
		List<Article> articles = panier.filtreBis(filtreAnonyme);
		
		// Appeler cette même méthode panier.filtrer avec une classe anonyme qui fait la même
		// chose qu’une des 2 classes précédemment créées.
	//	articles = ...;
		// Appeler la méthode filtrer avec une expression lambda
	//	articles = ...;

	}



}
