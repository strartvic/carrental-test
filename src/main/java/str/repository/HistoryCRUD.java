package str.repository;

import java.util.List;

import org.hibernate.Session;

import str.config.HibernateUtil;
import str.model.Auto;
import str.model.History;

public class HistoryCRUD {
	public void save(History pos) {
		Session session = HibernateUtil.getSessionFactory().openSession(); // открываем сессию
		session.beginTransaction();
		session.save(pos); // пользуемся ее методами
		session.flush();
		session.close();
	}

	public void delete(Auto pos) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(pos);
		session.flush();
		session.close();
	}

	public List<History> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.createCriteria(History.class).list();
		return session.createCriteria(History.class).list();
	}

	public History getById(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		History pos = session.get(History.class, id);
		return pos;
	}
}
