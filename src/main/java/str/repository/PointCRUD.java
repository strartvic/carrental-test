package str.repository;

import java.util.List;

import org.hibernate.Session;

import str.config.HibernateUtil;
import str.model.PointOfSale;

public class PointCRUD {
	public void save(PointOfSale pos) {
		Session session = HibernateUtil.getSessionFactory(PointOfSale.class).openSession(); // открываем сессию
		session.beginTransaction();
		session.save(pos); // пользуемся ее методами
		session.flush();
		session.close();
	}

	public void delete(PointOfSale pos) {
		Session session = HibernateUtil.getSessionFactory(PointOfSale.class).openSession();
		session.beginTransaction();
		session.delete(pos);
		session.flush();
		session.close();
	}

	public List<PointOfSale> getAll() {
		Session session = HibernateUtil.getSessionFactory(PointOfSale.class).openSession();
		return session.createCriteria(PointOfSale.class).list();
	}

	public PointOfSale getById(Integer id) {
		Session session = HibernateUtil.getSessionFactory(PointOfSale.class).openSession();
		PointOfSale pos = session.get(PointOfSale.class, id);
		return pos;
	}
}
