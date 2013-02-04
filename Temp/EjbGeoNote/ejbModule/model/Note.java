package model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "note")
@XmlRootElement

public class Note implements Serializable {

	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "noteId")
    public Integer id;
    @Basic(optional = false)
    @Column(name = "com")
	public String com;
    @Basic(optional = false)
    @Column(name = "date")
	public Date date;
	 @JoinColumn(name = "category", referencedColumnName = "catId")
	    @ManyToOne(optional = true)
	    private Category cat;
	 
	 
	 
	 public Note(String com, Date date, Category cat) {
		super();
	
		this.com = com;
		this.date = date;
		this.cat = cat;
	}
	public Note(String com, Date date) {
		super();
	
		this.com = com;
		this.date = date;
	}
	public Integer getId() {
			return id;
		}
	
		public String getCom() {
			return com;
		}
		public void setCom(String com) {
			this.com = com;
		}
		public Date getDate() {
			return date;
		}
		public void setDate(Date date) {
			this.date = date;
		}
		public Category getCat() {
			return cat;
		}
		public void setCat(Category cat) {
			this.cat = cat;
		}
	 
}


