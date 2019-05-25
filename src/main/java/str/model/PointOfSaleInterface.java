package str.model;

import java.util.List;

public interface PointOfSaleInterface {
	
	public void add(PointOfSale _point);
	
	public void delete(PointOfSale _point);
	
	public List<PointOfSale> getAll();
	
	public PointOfSale get(String _name);
	
	public void addAuto(PointOfSale _point, Auto _auto);

}
