package str.model;

import java.util.List;

public interface AutoInterface {

	public void add(Auto _auto);
	
	public void delete(Auto _auto);
	
	public List<Auto> getAll();
	
	public Auto get(String _carModel);

}
