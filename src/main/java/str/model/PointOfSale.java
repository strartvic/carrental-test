package str.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import str.repository.AutoCRUD;

@Entity
@Table(name = "points")
public class PointOfSale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String name;

	public PointOfSale() {

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PointOfSale(String auto) {
		this.name = auto;
	}

	public String getName() {
		return name;
	}

	public void setName(String auto) {
		this.name = auto;
	}

	public void addAuto(Auto auto) {
		new AutoCRUD().save(auto);
	}

	public void removeAuto(Auto auto) {
		new AutoCRUD().delete(auto);
	}

	public List<Auto> getAutos() {
		List<Auto> temp = new AutoCRUD().getAll();
		List<Auto> autos = new ArrayList<Auto>();
		for (Auto auto : temp) {
			if (auto.getPoint().equalsIgnoreCase(name)) {
				autos.add(auto);
			}
		}
		return autos;
	}

}
