package str.service;

import java.util.ArrayList;
import java.util.List;

import str.model.Auto;
import str.model.PointOfSale;
import str.repository.AutoCRUD;
import str.repository.PointCRUD;

public class CarrentalService {

	private PointCRUD pointsRep = new PointCRUD();

	private AutoCRUD autosRep = new AutoCRUD();

	public void add(PointOfSale point) {
		pointsRep.save(point);
	}

	public void delete(PointOfSale point) {
		pointsRep.delete(point);
	}

	public List<PointOfSale> getAll() {
		return pointsRep.getAll();
	}

	public PointOfSale get(String name) {
		for (PointOfSale point : pointsRep.getAll()) {
			if (point.getName().equalsIgnoreCase(name)) {
				return point;
			}
		}
		return null;
	}

	public void addAuto(Auto auto) {
		autosRep.save(auto);
	}

	public List<Auto> getAutos(PointOfSale point) {
		List<Auto> temp = autosRep.getAll();
		List<Auto> autos = new ArrayList<Auto>();
		for (Auto auto : temp) {
			if (auto.getPoint().equalsIgnoreCase(point.getName())) {
				autos.add(auto);
			}
		}
		return autos;
	}

	public void deleteAuto(Auto auto) {
		autosRep.delete(auto);
	}

	public Auto getAuto(PointOfSale point, String carModel) {
		for (Auto auto : autosRep.getAll()) {
			if (auto.getCarModel().equalsIgnoreCase(carModel)) {
				return auto;
			}
		}
		return null;
	}
}
