package modelService;

import java.util.Date;
import java.util.List;

import model.Category;
import model.Note;

public interface ServiceNote {
	public void persistNote(Note note);
	public void deleteNote(Note note);
	public void deleteNoteById(Integer Id);
	
	public Note getNoteById(Integer Id);
	public List<Note> getNoteByDate(Date date);
	public List<Note> getNotesByCat(Category cat);
}
