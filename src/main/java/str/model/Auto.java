package str.model;

import java.util.Date;

public class Auto {
	
	/**
	 * ������
	 */
	private String carModel;
	
	/**
	 * Номер авто
	 */
	private String number;
	
	/**
	 * дата взятия в прокат
	 */
	private Date dateBegin;
	
	/**
	 * дата окончания проката
	 */
	private Date dateEnd;
	
	/**
	 * Арендатор
	 */
	private String renter;
	
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

