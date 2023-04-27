package com.wild.service;

import com.wild.entity.Admin;

public interface AdminService {
	
public boolean login(Admin admin);

public boolean register(Admin admin);

public String deleteAdmin(String ID);

public boolean updateProfile(Admin admin);


}
