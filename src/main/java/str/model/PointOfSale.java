package str.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import str.repository.AutoCRUD;

@Entity
@Table(name = "points")
public class PointOfSale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Transient
	private List<Auto> autos = new ArrayList<Auto>();

	public PointOfSale() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PointOfSale(String _name) {
		this.name = _name;
	}

	public String getName() {
		return name;
	}

	public void setName(String _name) {
		this.name = _name;
	}

	public void addAuto(Auto _auto) {
		autos.add(_auto);
		new AutoCRUD().save(_auto);
	}

	public void removeAuto(Auto _auto) {
		autos.remove(_auto);
		new AutoCRUD().delete(_auto);
	}

	public List<Auto> getAutos() {
		List<Auto> temp = new AutoCRUD().getAll();
		for (Auto auto : temp) {
			if (auto.getPoint().equalsIgnoreCase(name)) {
				autos.add(auto);
			}
		}
		return autos;
	}

}
