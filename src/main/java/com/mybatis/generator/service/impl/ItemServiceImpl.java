package com.mybatis.generator.service.impl;

import com.mybatis.generator.domain.ao.ElecBillAO;
import com.mybatis.generator.domain.vo.ElecBillVO;
import com.mybatis.generator.mapper.ItemMapper;
import com.mybatis.generator.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LENOVO
 * @description 针对表【item(商品表)】的数据库操作Service实现
 * @createDate 2025-04-16 10:22:06
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<ElecBillVO> getElecBill(ElecBillAO elecBillAO) {
        //        ExecutorService pool = Executors.newFixedThreadPool(5);
//
//        List<String> list = new ArrayList<>();
//
//        List<Future<String>> futures =  new ArrayList<>();
//
//        for (int i = 1; i<=3;i++){
//            Future<String> submit = pool.submit(() -> {
//                return Thread.currentThread().getName();
//            });
//
//            futures.add(submit);
//        }
//
//        for (Future<String> future : futures) {
//            System.out.println(future.get());
//        }
//
//        return list;
        return itemMapper.getElecBill(elecBillAO);
    }
}




