package service;

import java.util.Date;

public interface AdminInterface {
	public void CreerNote(String com,Date date);
	public void CreerParcours(String nom,String com);
	public void SynchroParcours();
}
