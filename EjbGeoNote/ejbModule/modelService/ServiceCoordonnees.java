package modelService;

import model.Coordonnees;

public interface ServiceCoordonnees {
	public void persistCoo(Coordonnees coo);
	public void deleteCoo(Coordonnees coo);
	public void deleteCooById(Integer Id);
	
	
	public Coordonnees getCooById(Integer Id);
}
