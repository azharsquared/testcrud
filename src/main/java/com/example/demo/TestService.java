package com.example.demo;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public interface TestService {

    public Page<TestEntity> getPage(int page, int size);

    TestEntity save(TestEntity user);
    TestEntity uploadProfile(Long id,MultipartFile multipartFile) throws IOException;

    List<TestEntity> getAllUser();

    TestEntity getUser(Long id);

    List<TestEntity> getUsers(String name);
}
