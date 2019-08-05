package com.lonelywolf.boot;

import com.lonelywolf.boot.localdatasource.mydemo.service.ITestUserService;
import com.lonelywolf.boot.localdatasource.mydemo.vo.TestUserVO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootTestApplicationTests {
    @Autowired
    private ITestUserService iTestUserService;

    @Test
    public void contextLoads() {
        TestUserVO testUserVO = new TestUserVO();
        testUserVO.setCurrent(1);
        testUserVO.setPageSize(10);
        iTestUserService.queryUserByPage(testUserVO);
    }

}
