package str.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс торговых точек
 * @author SkyWalker
 *
 */
public class PointOfSale {
	
	/**
	 * Имя точки
	 */
    private String name;
    
    private List<Auto> autos = new ArrayList<Auto>();
 
    public PointOfSale() {
 
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
    }
    
    public void removeAuto(Auto _auto) {
    	autos.remove(_auto);
    }
    
    public List<Auto> getAutos() {
    	return autos;
    }
    
    
}
