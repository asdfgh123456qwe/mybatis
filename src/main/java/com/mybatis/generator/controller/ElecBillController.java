package com.mybatis.generator.controller;


import com.mybatis.generator.domain.ao.ElecBillAO;
import com.mybatis.generator.domain.vo.ElecBillVO;
import com.mybatis.generator.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.ExecutionException;


/**
 * MyBatis练习
 *
 * @author LENOVO
 * @since 2024/9/10 15:45
 */
@Slf4j
@RestController
@RequestMapping("member")
public class ElecBillController {

    @Autowired
    private ItemService itemService;

    @PostMapping("/risk")
    public List<ElecBillVO> getElecBill(@RequestBody ElecBillAO elecBillAO) throws ExecutionException, InterruptedException {

        log.info("用户查询入参：{}", elecBillAO);

        List<ElecBillVO> list = itemService.getElecBill(elecBillAO);

        return list;

    }
}
