package modelService;

import java.util.List;

import model.Category;

public interface ServiceCategory {
	public void	persistCategory(Category cat);
	public void deleteCategory(Category cat);
	public void deleteCategoryById(Integer Id);
	
	public Category getCatById(Integer Id);
	public List<Category> getAllCategory();
	public Category getCategoryByName(String name); 
	
}
