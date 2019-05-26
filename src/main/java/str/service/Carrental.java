package str.service;

import java.util.ArrayList;
import java.util.List;

import str.model.Auto;
import str.model.PointOfSale;

public class Carrental implements ICarrental {

	private List<PointOfSale> points = new ArrayList<PointOfSale>();

	public Carrental() {
		points.add(new PointOfSale("������ 101"));
		points.add(new PointOfSale("���� ������ 45"));

		points.get(0).addAuto(new Auto("Lada", "�723��"));
		points.get(0).addAuto(new Auto("KIA", "�763��"));
		points.get(0).addAuto(new Auto("SOLARIS", "�123��"));
	}

	@Override
	public void add(PointOfSale _point) {
		points.add(_point);
	}

	@Override
	public void delete(PointOfSale _point) {
		points.remove(_point);
	}

	@Override
	public List<PointOfSale> getAll() {
		return points;
	}

	@Override
	public PointOfSale get(String _name) {
		for (PointOfSale point : points) {
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
