package com.wild.dao;

import com.wild.entity.Admin;

public interface AdminDao {
	
public boolean login(Admin admin);

public boolean register(Admin admin);

public Admin getAdmin(String id);

public String deleteAdmin(String ID);

public boolean updateProfile(Admin admin);


}
