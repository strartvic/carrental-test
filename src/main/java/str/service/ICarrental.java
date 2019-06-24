package str.service;

import java.util.List;

import str.model.Auto;
import str.model.PointOfSale;

public interface ICarrental {

	void add(PointOfSale point);

	void delete(PointOfSale point);

	List<PointOfSale> getAll();

	PointOfSale get(String name);

	void addAuto(PointOfSale point, Auto auto);

	void deleteAuto(PointOfSale point, Auto auto);

	List<Auto> getAutos(PointOfSale point);

	Auto getAuto(PointOfSale point, String carModel);
}
