package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("app")
public class TestController {

    @Autowired
    TestService testService;

    @PostMapping("user")
    public ResponseEntity<TestEntity> saveUser(@RequestBody TestEntity user){
        return ResponseEntity.ok(testService.save(user));
    }
    @PutMapping("user/profile/{id}")
    public ResponseEntity<TestEntity> uploadProfilePic(@PathVariable("id") Long id, @RequestParam("image") MultipartFile multipartFile){
       try{
           return ResponseEntity.ok(testService.uploadProfile(id, multipartFile));
       }catch (Exception e){
           return ResponseEntity.status(400).body(new TestEntity());
       }

    }

    @GetMapping("user")
    public ResponseEntity<List<TestEntity>> getAllUsers(){
            return ResponseEntity.ok(testService.getAllUser());
    }

    @GetMapping("user/{id}")
    public ResponseEntity<TestEntity> getUser(@PathVariable("id") Long id){
        return ResponseEntity.ok(testService.getUser(id));
    }

    @GetMapping("user/search/{name}")
    public ResponseEntity<List<TestEntity>> getUsers(@PathVariable("name") String name){
        return ResponseEntity.ok(testService.getUsers(name));
    }
}
