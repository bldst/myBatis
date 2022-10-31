package com.example.mybatis;

import com.example.mybatis.Card.Card;
import com.example.mybatis.mapper.Cardmapper;
import com.example.mybatis.student.student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CardTest {
    @Autowired
    com.example.mybatis.mapper.Cardmapper map;

    @Test
    public void testGetOne() throws Exception {
        Card card;
        card= map.selectByid(1);
        System.out.println(card.toString());
    }
}