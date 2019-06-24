package str.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "history")
public class History {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column
	public Date dateBegin;

	@Column
	public Date dateEnd;

	@Column
	public String renter;

	@Column
	public String carModel;

	@Column
	public String point;

	@Column
	public String number;

	public History() {

	}

	public History(Date dateBegin, Date dateEnd, String renter, String carModel, String point, String number) {
		this.dateBegin = dateBegin;
		this.dateEnd = dateEnd;
		this.renter = renter;
		this.point = point;
		this.carModel = carModel;
		this.number = number;
	}

	public String getRenter() {
		return renter;
	}

	public String getDateBegin() {
		return dateBegin.toString();
	}

	public String getDateEnd() {
		return dateEnd.toString();
	}

	public String getCarModel() {
		return carModel;
	}

	public String getPoint() {
		return point;
	}

	public String getNumber() {
		return number;
	}
}
