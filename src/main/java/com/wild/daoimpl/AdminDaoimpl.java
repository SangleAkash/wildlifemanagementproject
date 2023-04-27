package com.wild.daoimpl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wild.dao.AdminDao;
import com.wild.entity.Admin;

@Repository
public class AdminDaoimpl implements AdminDao {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean login(Admin admin) {
		Session session = null;
		boolean islogin = false;
		try {
			session = sf.openSession();
			Admin resisterAdmin = session.get(Admin.class, admin.getID());
			if (resisterAdmin != null) {
				if (resisterAdmin.getID().equals(admin.getID())) {
					if (resisterAdmin.getPassword().equals(admin.getPassword())) {
						islogin = true;
					} else {
						islogin = false;
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return islogin;
	}

	@Override
	public boolean register(Admin admin) {
		Session session = null;
		boolean isRes = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(admin);
			transaction.commit();
			isRes = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isRes;
	}

	public Admin getAdmin(String id) {
		Session session=null;
		Admin admin=null;
		try {
           session = sf.openSession();
           admin = session.get(Admin.class, id);
           
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session!=null)
				session.close();
		}
		return admin;
	}

	@Override
	public String deleteAdmin(String ID) {
		Session session = null;
		String isDel = null;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
              Admin admin = session.get(Admin.class, ID);
              if(admin!=null) {
            	  session.delete(admin);
              }
              transaction.commit();
              isDel="sucessfully deleted";
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isDel;
	}

	@Override
	public boolean updateProfile(Admin admin) {
		Session session = null;
		boolean isUpdate = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Admin dbadmin = session.get(Admin.class, admin.getID());
			if(dbadmin.getID().equals(admin.getID())) {
				session.update(admin);
			}
			isUpdate=true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isUpdate;
	}

}
