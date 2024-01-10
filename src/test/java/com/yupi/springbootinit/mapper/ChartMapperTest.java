package com.yupi.springbootinit.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ChartMapperTest {

    @Resource
    private ChartMapper chartMapper;

    @Test
    void queryChartData() {
        String chartId = "1734927592228405250";
        String querySql = String.format("select * from chart_%s",chartId);
        List<Map<String, Object>> maps = chartMapper.queryChartData(querySql);
        System.out.println(maps);

    }
}