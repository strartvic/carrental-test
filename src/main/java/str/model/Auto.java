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
import javax.persistence.Transient;

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

	@Transient
	private List<History> history = new ArrayList<History>();

	public Auto() {

	}

	public Auto(final String _carModel, final String _number, final String _point) {
		carModel = _carModel;
		number = _number;
		point = _point;
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

	public void setCarModel(String _carModel) {
		this.carModel = _carModel;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String _number) {
		this.number = carModel;
	}

	public List<History> getHistory() {
		List<History> temp = new HistoryCRUD().getAll();
		for (History his : temp) {
			if (his.getPoint().equalsIgnoreCase(point) && his.getCarModel().equalsIgnoreCase(carModel)) {
				history.add(his);
			}
		}
		return history;
	}

	public void addToHistory(Date _dateBegin, Date _dateEnd, String _renter) {
		history.add(new History(_dateBegin, _dateEnd, _renter, carModel, point, number));
		new HistoryCRUD().save(new History(_dateBegin, _dateEnd, _renter, carModel, point, number));
	}

	public String getPoint() {
		return point;
	}

	public void setPoint(String _point) {
		this.point = _point;
	}
}
