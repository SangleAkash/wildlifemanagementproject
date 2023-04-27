package com.wild.daoimpl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.fasterxml.jackson.databind.ser.std.StdKeySerializers.Default;
import com.wild.dao.DataDao;
import com.wild.entity.Animal;
import com.wild.entity.Data;
import com.wild.entity.Event;

@Repository
public class DataDaoimpl implements DataDao {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean inserData(Data data) {
		Session session = null;
		boolean inseted = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(data);
			transaction.commit();
			inseted = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return inseted;
	}

	@Override
	public boolean updateData(Data data) {
		Session session = null;
		boolean isUpdate = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Data data2 = session.get(Data.class, data.getNo());

			int a = data.getNo();
			if (data2 != null) {
				switch (a) {
				case 1: {

					session.update(data2);

					isUpdate = true;
					break;
				}
				case 2: {
					session.update(data2);

					isUpdate = true;
					break;
				}
				case 3: {
					session.update(data2);

					isUpdate = true;
					break;
				}
				case 4: {
					session.update(data2);

					isUpdate = true;
					break;
				}
				default: {

					break;
				}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isUpdate;
	}

	public boolean updateData(Event event) {
		Session session = null;
		boolean isUpdate = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Event event2 = session.get(Event.class, event.getNo());
			int a = event.getNo();
			if (event2 != null) {
				switch (a) {
				case 1: {
					session.update(event2);
					isUpdate = true;
					break;
				}
				case 2: {
					session.update(event2);

					isUpdate = true;
					break;
				}
				case 3: {
					session.update(event2);

					isUpdate = true;
					break;
				}
				case 4: {
					session.update(event2);

					isUpdate = true;
					break;
				}
				default: {

					break;
				}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isUpdate;
	}

	@Override
	public boolean deleteData(int id) {
		Session session = null;
		boolean isDel = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Data data = session.get(Data.class, id);
			if (data != null) {
				session.delete(data);
			}
			transaction.commit();
			isDel = true;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isDel;
	}

	@Override
	public List<Data> data() {
		Session session = null;
		List<Data> list = null;
		try {
			session = sf.openSession();
			Criteria criteria = session.createCriteria(Data.class);
			list = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return list;
	}

	@Override
	public Map<String, Object> uploadDataFromSheet(CommonsMultipartFile file, HttpSession httpSession) {

		return null;
	}

	@Override
	public List<Event> getList() {
		Session session = null;
		List<Event> list = null;
		try {
			session = sf.openSession();
			Criteria criteria = session.createCriteria(Event.class);
			list = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return list;
	}
}
