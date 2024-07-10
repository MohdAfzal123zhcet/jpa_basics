package com.example.jpa_basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class userController {
@Autowired
userservice us;
@PostMapping("/add")
public String addUser(@RequestBody user u)
{
    return us.adduser(u);

}
@GetMapping("/getAllUsers")
    public List<user> getAllUsers(@RequestBody user u)
{
    return us.getAllUsers(u);
}
@GetMapping("/getUser")
    public user getuser(@RequestParam ("userid") int userid)
{
   return  us.getuser(userid);
}
}