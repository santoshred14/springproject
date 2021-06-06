package com.example.springproject;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.RequestModels.user;

@RestController
public class domaincontoller {

	@RequestMapping(value="getval",method = RequestMethod.GET)
	public String method() {
		System.out.print("insde the get api ");
		return "all good";
	}
	
	@RequestMapping(value="postval",method = RequestMethod.POST)
	public String application(@RequestBody user _userBody )
	{
		user newuser=new user();
		String emailName=_userBody.getEmail();
		newuser.setEmail(emailName);
		newuser.setName(_userBody.getName());
		return "santosh "+newuser.getEmail()+" "+newuser.getName()+" "+"santosh";
	}
	
	@RequestMapping(value="deleteval/{id}",method = RequestMethod.DELETE)
	public int start(@PathVariable("id")int idgiven )
	{
		return idgiven;
	}
	@RequestMapping(value="putval/{id}",method = RequestMethod.PUT)
	public user putmethod(@RequestBody user _userBody) {
		user newuser=new user();
		String emailName=_userBody.getEmail();
		newuser.setEmail(emailName);
		newuser.setName(_userBody.getName());
		return newuser;
	}
	
	@RequestMapping(value="putvalnew/{id}",method = RequestMethod.PUT)
	public user putmethodnew(@RequestBody user _userBody) {
		user newuser=new user();
		String emailName=_userBody.getEmail();
		newuser.setEmail(emailName);
		newuser.setName(_userBody.getName());
		return newuser;
	}
	
	
	

}




