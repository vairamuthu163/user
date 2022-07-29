package com.example.user.controller;

import com.example.user.document.User;
import com.example.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin(value = "*")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/update-profile")
    public User updateProfile(@RequestBody User user){
        int id = user.getId();
        User checkUser = userService.findById(id);
        if(checkUser==null){
            return userService.save(user);
        }
        else{
            user.setId(checkUser.getId());
            return userService.save(user);
        }
    }

    @PostMapping(value = "/profile/{id}")
    public User getProfile(@PathVariable("id") int id){
        return userService.findById(id);
    }


//    @PostMapping("/update-product")
//    public void updateProduct(@RequestBody Product productDto){
//        int id = productDto.getId();
//        Product product = productService.findById(id);
//        productDto.setId(product.getId());
//        productService.save(productDto);
//    }
}
