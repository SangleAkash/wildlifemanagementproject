package com.wild.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.wild.entity.Data;
import com.wild.entity.Event;
import com.wild.service.DataService;

@Controller
public class DataViewController {
	@Autowired
	DataService ds;

	@PostMapping(value = "/insertdata")
	public boolean inserData(@RequestBody Data data) {
		boolean inserData = ds.inserData(data);

		return inserData;
	}

	
	@PostMapping(value = "/updateData")
	public boolean updateData(@RequestBody Data data) {
		boolean updateData = ds.updateData(data);
		return updateData;
	}

	
	@PostMapping(value = "/updateEvent")
	public boolean updateData(@RequestBody Event event) {
		boolean updateData = ds.updateData(event);
		return updateData;
	}

	@DeleteMapping(value = "/deletedata/{id}")
	public boolean deleteData(@PathVariable int id) {
		boolean deleteData = ds.deleteData(id);
		return deleteData;
	}

	@GetMapping(value = "/list")
	public List<Data> data() {
		List<Data> data = ds.data();
		return data;
	}

	@PostMapping(value = "uploadsheet")
	public Map<String, Object> uploadDataFromSheet(CommonsMultipartFile file, HttpSession httpSession) {
		Map<String, Object> uploadDataFromSheet = ds.uploadDataFromSheet(file, httpSession);
		return uploadDataFromSheet;
	}

	@GetMapping(value = "/eventList")
	public List<Event> getList() {
		List<Event> list = ds.getList();
		return list;

	}
}
