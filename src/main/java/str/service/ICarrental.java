package str.service;

import java.util.List;

import str.model.Auto;
import str.model.PointOfSale;

public interface ICarrental {

	void add(PointOfSale _point);

	void delete(PointOfSale _point);

	List<PointOfSale> getAll();

	PointOfSale get(String _name);

	void addAuto(PointOfSale _point, Auto _auto);

	void deleteAuto(PointOfSale _point, Auto _auto);

	List<Auto> getAutos(PointOfSale _point);

	Auto getAuto(PointOfSale _point, String _carModel);
}
