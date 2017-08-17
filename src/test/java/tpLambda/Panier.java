package tpLambda;

import java.util.ArrayList;
import java.util.List;

public class Panier {
	private List<Article> articles;

	public Panier() {
		articles = new ArrayList<>();
	}

	public ArrayList<Article> filtre() {

		ArrayList<Article> articleEnStock = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.isEnRupture() == false) {
				articleEnStock.add(article);
				System.out.println(article.getReference());
			}

		}
		return articleEnStock;
	}

	public ArrayList<Article> filtreGenerique(boolean stock, int prix) {
		System.out.println("\n");
		ArrayList<Article> articleEnStockGenerique = new ArrayList<Article>();
		for (Article article : articles) {
			if (article.isEnRupture() == stock && article.getPrix() <= prix) {
				articleEnStockGenerique.add(article);
				System.out.println(article.getReference());
			} else if (article.isEnRupture() == stock && article.getPrix() <= prix) {
				articleEnStockGenerique.add(article);
				System.out.println(article.getReference());
			}
		}
		return articleEnStockGenerique;

	}

	public ArrayList<Article> filtreBis(IFiltre filtre) {
		ArrayList<Article> articleTemp = new ArrayList<Article>();
		for (Article article : articles) {
			if (filtre.accept(article) == true) {
				articleTemp.add(article);
				System.out.println(article.getReference());
			}
		}
		return articleTemp;
	}

	
	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
