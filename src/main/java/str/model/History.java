package str.model;

import java.util.Date;

public class History {
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

	public String getRenter() {
		return renter;
	}

	public String getDateBegin() {
		return dateBegin.toString();
	}

	public String getDateEnd() {
		return dateEnd.toString();
	}

}
