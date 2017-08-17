package tpLambda;



public class Filtre implements IFiltre {


	public boolean accept(Article article) {
		if (article.isEnRupture() == false) {
			return true;
		} else {
			return false;
		}
	}
}
