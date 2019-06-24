package str.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import str.repository.HistoryCRUD;

@Entity
@Table(name = "autos")
public class Auto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "carModel")
	private String carModel;

	@Column(name = "number")
	private String number;

	@Column(name = "point")
	private String point;

	public Auto() {

	}

	public Auto(final String model, final String num, final String point) {
		this.carModel = model;
		this.number = num;
		this.point = point;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = carModel;
	}

	public List<History> getHistory() {
		List<History> temp = new HistoryCRUD().getAll();
		List<History> history = new ArrayList<History>();
		for (History his : temp) {
			if (his.getPoint().equalsIgnoreCase(point) && his.getCarModel().equalsIgnoreCase(carModel)) {
				history.add(his);
			}
		}
		return history;
	}

	public void addToHistory(Date dateBegin, Date dateEnd, String renter) {
		new HistoryCRUD().save(new History(dateBegin, dateEnd, renter, carModel, point, number));
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String point) {
		this.point = point;
	}
}
