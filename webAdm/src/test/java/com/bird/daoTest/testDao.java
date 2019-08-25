package com.bird.daoTest;

import com.bird.file.bean.File;
import com.bird.file.bean.User;
import com.bird.file.dao.FileMapper;
import com.bird.file.dao.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/application.xml")
public class testDao {

    @Resource
    UserMapper userMapper;
    @Resource
    FileMapper fileMapper;
    @Test
    public void inseret(){
        User user=new User();
        user.setUserName("王二小");
        user.setPasswd("123456");
        user.setUserMail("123.com");
        userMapper.insert(user);
    }
    @Test
    public void inseretfILE(){
        File f=new File();
        f.setFileId("1235");
        f.setFilePath("d//fff");
        fileMapper.insert(f);
    }

}
