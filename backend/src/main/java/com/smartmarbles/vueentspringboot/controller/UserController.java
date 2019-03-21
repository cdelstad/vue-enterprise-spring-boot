package com.smartmarbles.vueentspringboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.smartmarbles.vueentspringboot.model.UserInfo;


@RestController()
@RequestMapping("/api")
public class UserController {

    private static final Logger LOG = LoggerFactory.getLogger(UserController.class);

    @RequestMapping(path = "/session", produces = "application/json", method = RequestMethod.POST)
    public @ResponseBody UserInfo authUser(@RequestBody UserInfo userInfo) {
        LOG.info("In /session POST");
        
        // This is not a good way to check validity of users. Just mimicking logic in Vue Enterprise Boilerplate
		if (userInfo.getUsername().equals("admin")) { 
			userInfo.setId(1);
			userInfo.setName("Vue Master");
			userInfo.setToken("valid-token-for-admin");
			userInfo.setPassword(null);
	    } else if (userInfo.getUsername().contentEquals("user1")) { 
			userInfo.setId(2);
			userInfo.setName("User One");
			userInfo.setToken("valid-token-for-user1");
			userInfo.setPassword(null);
	    } else { 
	    	//"Invalid user credentials."
			LOG.info("No matching user");
			userInfo.setId(0);
			userInfo.setName("No Match");
			userInfo.setToken(null);
			userInfo.setPassword(null);
	    }
        
        return userInfo;        
    }
    
    @RequestMapping(path = "/session", produces = "application/json", method = RequestMethod.GET)
    public String pingUser() {
    	// Vue Enterprise makes a GET call on logout and navigating to /profile. 
    	// TODO Enhance this with more enterprise login/logout/validate request mappings.
    	return "{\"id\":1,\"username\":\"admin\",\"name\":\"Vue Master\",\"token\":\"valid-token-for-admin\"}";    
    }

}
