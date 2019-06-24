package str.repository;

import java.util.List;

import org.hibernate.Session;

import str.config.HibernateUtil;
import str.model.Auto;

public class AutoCRUD {
	public void save(Auto pos) {
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

	public List<Auto> getAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.createCriteria(Auto.class).list();
		return session.createCriteria(Auto.class).list();
	}

	public Auto getById(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Auto pos = session.get(Auto.class, id);
		return pos;
	}
}
