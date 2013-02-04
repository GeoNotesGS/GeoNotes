package modelService;

import java.util.List;

import model.Coordonnees;
import model.Parcours;

public interface ServiceParcours {
	public void persistParcours(Parcours parcours);
	public void deleteParcours(Parcours parcours);
	public void deleteParcoursById(Integer Id);
	
	
	public Parcours getParcoursById(Integer Id);
	public List<Parcours> getParcoursByName(String Name);
	public List<Parcours> getParcoursByPoint(Coordonnees coo);
	public List<Parcours> getParcoursByLongueur(Float longueur);
	
}
