package str.service;

import java.util.ArrayList;
import java.util.List;

import str.model.Auto;
import str.model.PointOfSale;
import str.repository.AutoCRUD;
import str.repository.PointCRUD;

public class Carrental implements ICarrental {

	private List<PointOfSale> points = new ArrayList<PointOfSale>();

	private PointCRUD pos = new PointCRUD();

	private AutoCRUD auto = new AutoCRUD();

	@Override
	public void add(PointOfSale point) {
		pos.save(point);
	}

	@Override
	public void delete(PointOfSale point) {
		pos.delete(point);
	}

	@Override
	public List<PointOfSale> getAll() {
		return pos.getAll();
	}

	@Override
	public PointOfSale get(String name) {
		for (PointOfSale point : pos.getAll()) {
			if (point.getName().equalsIgnoreCase(name)) {
				return point;
			}
		}
		return null;
	}

	@Override
	public void addAuto(PointOfSale point, Auto auto) {
		point.addAuto(auto);
	}

	@Override
	public List<Auto> getAutos(PointOfSale point) {
		return point.getAutos();
	}

	@Override
	public void deleteAuto(PointOfSale point, Auto auto) {
		point.removeAuto(auto);
	}

	@Override
	public Auto getAuto(PointOfSale point, String carModel) {
		for (Auto auto : point.getAutos()) {
			if (auto.getCarModel().equalsIgnoreCase(carModel)) {
				return auto;
			}
		}
		return null;
	}
}
