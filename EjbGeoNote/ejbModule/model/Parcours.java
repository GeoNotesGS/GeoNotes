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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@Table(name = "parcours")
@XmlRootElement
public class Parcours implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue
    @Basic(optional = false)
    @Column(name = "ParcoursId")
	 public Integer id;
	@Basic(optional = false)
    @Column(name = "nom")
	public String nom;
	@Basic(optional = false)
    @Column(name = "com")
	public String com;
	@Basic(optional = false)
    @Column(name = "longueur")
	public Float longueur;
	 @JoinColumn(name = "Coordonnees", referencedColumnName = "cooId")
	    @ManyToMany
	    private List<Coordonnees>coordonees;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCom() {
		return com;
	}
	
	public Float getLongueur() {
		return longueur;
	}
	
	public List<Coordonnees> getCoordonees() {
		return coordonees;
	}
	
	public Parcours(String nom, String com, Float longueur,
			List<Coordonnees> coordonees) {
		super();
		this.nom = nom;
		this.com = com;
		this.longueur = longueur;
		this.coordonees = coordonees;
	}
	
	 
	 
	 
}
