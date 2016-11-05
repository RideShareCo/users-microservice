package io.mcore.ride.sharing.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.mcore.ride.sharing.users.dao.UsersDAO;
import io.mcore.ride.sharing.users.model.User;

@Controller
public class UsersController {
	
	@Autowired UsersDAO userDao;
	
	@RequestMapping("/users")
	@ResponseBody
	public Iterable<User> getUsers() {
		return userDao.findAll();
	}

}
