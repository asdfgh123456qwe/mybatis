package org.com.generator.controller;


import org.com.generator.domain.ao.ElecBillAO;
import org.com.generator.domain.vo.ElecBillVO;
import org.com.generator.service.ItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


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
