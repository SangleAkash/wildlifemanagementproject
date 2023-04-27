package com.wild.serviceimpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wild.dao.AdminDao;
import com.wild.dao.AnimalDao;
import com.wild.entity.Admin;
import com.wild.service.AdminService;
import com.wild.service.AnimalService;
@Service
public class AdminServiceimpl implements AdminService{
@Autowired
AdminDao addmindao;
	@Override
	public boolean login(Admin admin) {

		return addmindao.login(admin);
	}

	@Override
	public boolean register(Admin admin) {
		// TODO Auto-generated method stub
		return addmindao.register(admin);
	}

	@Override
	public String deleteAdmin(String ID) {
		// TODO Auto-generated method stub
		return addmindao.deleteAdmin(ID);
	}

	@Override
	public boolean updateProfile(Admin admin) {
		// TODO Auto-generated method stub
		return addmindao.updateProfile(admin);
	}

}
