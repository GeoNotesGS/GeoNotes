package modelService;

import java.util.List;

import model.User;

public interface ServiceUser {
	
	/**
	 * Enregistre un user en base
	 * @param user
	 */
	public void persistUser(User user);
	/**
	 * Delete un user de la base
	 * @param user
	 */
	public void deleteUser(User user);
	
	/**
	 * delete un user par id en base
	 * @param Id
	 */
	public void deleteUserById(Integer Id);
	
	
	public List<User> getAllUser();
	public User getUserById(Integer Id);
	public List<User> getUserByName(String name);
	public List<User> getListAdmin();
	

}
