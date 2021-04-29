package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.transaction.Transactional;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class TestServiceImpl implements  TestService{

    @Autowired
    TestRepository testRepository;

    public Page<TestEntity> getPage(int page, int size){

        Pageable p = PageRequest.of(page, size, Sort.by("name").descending().and(Sort.by("details").ascending()));
        return testRepository.findAll(p);

    }

    @Override
    public TestEntity save(TestEntity user) {
        return testRepository.save(user);
    }

    @Override
    public TestEntity uploadProfile(Long id,MultipartFile multipartFile) throws IOException {
        TestEntity user = testRepository.findById(id).get();
        byte[] picInBytes = multipartFile.getBytes();
        user.setPROFILE_PIC(picInBytes);
        return testRepository.save(user);
    }

    @Override
    public List<TestEntity> getAllUser() {
        return testRepository.findAll();
    }

    @Override
    public TestEntity getUser(Long id) {
        return testRepository.findById(id).orElseGet(TestEntity::new);
    }

    @Override
    public List<TestEntity> getUsers(String name) {
        return testRepository.findAll(name);
    }
}
