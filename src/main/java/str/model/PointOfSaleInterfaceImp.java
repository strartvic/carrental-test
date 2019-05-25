package str.model;

import java.util.ArrayList;
import java.util.List;

public class PointOfSaleInterfaceImp implements PointOfSaleInterface {
	
	private List<PointOfSale> points = new ArrayList<PointOfSale>();

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
		// TODO Auto-generated method stub
		
	}

}
