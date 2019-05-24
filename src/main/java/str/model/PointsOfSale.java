package str.model;

/**
 * Точки продаж
 * @author SkyWalker
 *
 */
public class PointsOfSale {
	
	/**
	 * Название точки
	 */
    private String name;
    
    private String lastName;
 
    public PointsOfSale() {
 
    }
 
    public PointsOfSale(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String firstName) {
        this.name = firstName;
    }
 
    public String getLastName() {
        return lastName;
    }
 
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
