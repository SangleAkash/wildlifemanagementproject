package com.wild.daoimpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wild.dao.AnimalDao;

import com.wild.entity.Animal;

@Repository
public class AnimalDaoimpl implements AnimalDao {
	@Autowired
	SessionFactory sf;

	@Override
	public boolean registerAnimal(Animal animal) {
		Session session = null;
		boolean isres = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(animal);
			transaction.commit();
			isres = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isres;
	}

	@Override
	public boolean updateAnimal(Animal animal) {
		Session session = null;
		boolean isUpdate = false;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Animal animaldb = session.get(Animal.class, animal.getID());
			if (animaldb.getID().equals(animal.getID())) {
				session.update(animal);
			}
			transaction.commit();
			isUpdate = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isUpdate;
	}

	@Override
	public String deleteAnimal(String ID) {
		Session session = null;
		String isDel = null;
		try {
			session = sf.openSession();
			Transaction transaction = session.beginTransaction();
			Animal dbanimal = session.get(Animal.class, ID);
			if (dbanimal != null) {
				session.delete(dbanimal);
			}
			transaction.commit();
			isDel = "sucessfully deleted";

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();

		}
		return isDel;
	}

	@Override
	public List<Animal> getAnimalList() {
		Session session = null;
		List<Animal> list = null;
		try {
			session = sf.openSession();
			Criteria criteria = session.createCriteria(Animal.class);
			list = criteria.list();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			 if(session!=null)
	        	   session.close();
		}
		return list;
	}

	@Override
	public Animal getSingleAnimal(String ID) {
		Session session = null;
		Animal animal = null;
		try {
			session = sf.openSession();
			animal = session.get(Animal.class, ID);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		return animal;
	}

}
