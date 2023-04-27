package com.wild.serviceimpl;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wild.dao.DataDao;
import com.wild.entity.Data;
import com.wild.entity.Event;
import com.wild.service.DataService;

@Service
public class DataServiceimpl implements DataService {
	@Autowired
	DataDao dd;

	@Override
	public boolean inserData(Data data) {
		// TODO Auto-generated method stub
		return dd.inserData(data);
	}

	@Override
	public boolean updateData(Data data) {
		// TODO Auto-generated method stub
		return dd.updateData(data);
	}

	public boolean updateData(Event event) {
		
		return dd.updateData(event);
	}

	@Override
	public boolean deleteData(int id) {
		// TODO Auto-generated method stub
		return dd.deleteData(id);
	}

	@Override
	public List<Data> data() {
		// TODO Auto-generated method stub
		return dd.data();
	}

	@Override
	public Map<String, Object> uploadDataFromSheet(CommonsMultipartFile file, HttpSession httpSession) {
		// TODO Auto-generated method stub
		return dd.uploadDataFromSheet(file, httpSession);
	}

	@Override
	public List<Event> getList() {
		// TODO Auto-generated method stub
		return dd.getList();
	}

}
