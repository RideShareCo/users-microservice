package io.mcore.ride.sharing.users.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import io.mcore.ride.sharing.users.dao.UsersDAO;
import io.mcore.ride.sharing.users.model.User;

@Controller
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class UsersController {

	@Autowired
	UsersDAO userDao;

	@PreAuthorize("#oauth2.hasScope('openid')")
	@RequestMapping("/users")
	@ResponseBody
	public Iterable<User> getUsers() {
		return userDao.findAll();
	}

	@RequestMapping("/users2")
	@ResponseBody
	public Iterable<User> getUsers2() {
		return userDao.findAll();
	}

	/*
	@Configuration
	@EnableResourceServer
	protected static class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

		@Override
		public void configure(HttpSecurity http) throws Exception {
			http.requestMatchers().antMatchers("/users").and().authorizeRequests().antMatchers("/users")
			.access("#oauth2.hasScope('openid')").and().requestMatchers().antMatchers("/users2").and().authorizeRequests().antMatchers("/users2")
			.authenticated();
		}

	}*/

}
