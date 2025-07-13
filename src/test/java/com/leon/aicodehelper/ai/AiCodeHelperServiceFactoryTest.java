package com.leon.aicodehelper.ai;

import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AiCodeHelperServiceFactoryTest {

    @Resource
    private AiCodeHelperService aiCodeHelperService;

    @Test
    void chatWithMemory() {
        String result = aiCodeHelperService.chat("你好，我是程序员leon");
        System.out.println(result);
        result = aiCodeHelperService.chat("你好，我是谁来着？");
        System.out.println(result);
    }
}