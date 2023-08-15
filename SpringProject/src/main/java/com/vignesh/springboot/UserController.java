package com.vignesh.springboot;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.vignesh.springboot.pojos.User;

@RestController("/users")
@RequestMapping("/users")
public class UserController {
	
  private ArrayList<User> userList=new ArrayList<>();
  
  @JsonProperty("field_name")
  @PostMapping("/")
  public User adduser(@RequestBody User user)
  {
	  userList.add(user);
	  return user ;
  }
  
  
  @GetMapping("/{id}")
  public User DisplayUser(@PathVariable String id)
  {
	  return userList.get(Integer.parseInt(id));
  }
  
  @GetMapping("/")
  public ArrayList<User> DisplayUsers( )
  {
	  return userList;
  }

}
