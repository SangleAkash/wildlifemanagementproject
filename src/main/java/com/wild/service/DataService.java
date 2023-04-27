package com.wild.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wild.entity.Data;
import com.wild.entity.Event;

public interface DataService {
	
public boolean inserData(Data data);

public boolean updateData(Data data);

public boolean updateData(Event event);

public boolean deleteData(int id );

public List<Data> data();

public Map<String, Object> uploadDataFromSheet(CommonsMultipartFile file, HttpSession httpSession);

public List<Event> getList();

}
