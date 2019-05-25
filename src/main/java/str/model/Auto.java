package str.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Auto {
	
	/**
	 * ������ ����
	 */
	private String carModel;
	
	/**
	 * ����� ����
	 */
	private String number;
	
	/**
	 * �������
	 */
	private List<History> history = new ArrayList<History>();
	
	private class History{
	   /**
	   * ���� ������ �������
	   */
	   public Date dateBegin;
	
	   /**
	   * ���� ��������� �������
	   */
	   public Date dateEnd;
	
	   /**
	   * ���������
	   */
	   public String renter;
	   
	   public History(Date _dateBegin, Date _dateEnd, String _renter) {
		   dateBegin = _dateBegin;
		   dateEnd = _dateEnd;
		   renter = _renter;
	   }
	   
	    public String getRentel(){
	    	return renter;
	    }
	    
	    public String getDateBegin(){
	    	return dateBegin.toString();
	    }
	    
	    public String getDateEnd(){
	    	return dateEnd.toString();
	    }
	}
	
    public Auto(final String _carModel, final String _number) {
    	carModel = _carModel;
    	number = _number;
    }
    
    public String getCarModel(){
    	return carModel;
    }
    
    public String getNumber(){
    	return number;
    }
    
    public List<History> getHistory(){
    	return history;
    }
    
    public void addToHistory(Date _dateBegin, Date _dateEnd, String _renter){
    	history.add(new History(_dateBegin, _dateEnd, _renter));
    }
    

}

