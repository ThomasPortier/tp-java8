package tpLambda;


@FunctionalInterface

public interface IFiltre {
	
	boolean accept(Article article);
}
