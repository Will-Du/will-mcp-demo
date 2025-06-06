package com.demo.mcp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @description: 健康检查
 * @author: will9
 * @date: 2025/6/6 10:06
 */
@RestController
public class HealthController {

    @RequestMapping(value = {"","/","/check","/health","/will-mcp-demo/info"})
    public Object check() {
        Map<String, String> result = new HashMap<>();
        result.put("name", "c");
        result.put("version", "1.0.0");
        return result;
    }
}
