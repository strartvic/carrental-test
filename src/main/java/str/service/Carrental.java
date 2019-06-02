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
	public void add(PointOfSale _point) {
		pos.save(_point);
	}

	@Override
	public void delete(PointOfSale _point) {
		pos.delete(_point);
	}

	@Override
	public List<PointOfSale> getAll() {
		return pos.getAll();
	}

	@Override
	public PointOfSale get(String _name) {
		for (PointOfSale point : pos.getAll()) {
			if (point.getName().equalsIgnoreCase(_name)) {
				return point;
			}
		}
		return null;
	}

	@Override
	public void addAuto(PointOfSale _point, Auto _auto) {
		_point.addAuto(_auto);
	}

	@Override
	public List<Auto> getAutos(PointOfSale _point) {
		return _point.getAutos();
	}

	@Override
	public void deleteAuto(PointOfSale _point, Auto _auto) {
		_point.removeAuto(_auto);
	}

	@Override
	public Auto getAuto(PointOfSale _point, String _carModel) {
		for (Auto auto : _point.getAutos()) {
			if (auto.getCarModel().equalsIgnoreCase(_carModel)) {
				return auto;
			}
		}
		return null;
	}
}
