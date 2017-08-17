package tpLambda;

public class FiltrePrix implements IFiltre {

	public boolean accept(Article article) {
		//int prixMax = 1;
		if (article.isEnRupture() == false && article.getPrix()<= 2) {
			return true;
		} else {
			return false;
		}
	}
}
