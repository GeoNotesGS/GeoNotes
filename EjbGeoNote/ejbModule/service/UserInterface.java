package service;

import java.util.List;

import model.Category;
import model.Coordonnees;
import model.Parcours;


public interface UserInterface {
	
	public void SynchroParcours();
	public List<Parcours> SelectParcours(Coordonnees coo,Category cat);
	public Parcours SelectParcoursById(Integer Id);
	
}
 