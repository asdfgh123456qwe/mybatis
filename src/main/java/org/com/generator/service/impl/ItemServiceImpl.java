package org.com.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.com.generator.domain.vo.ElecBillVO;
import org.com.generator.mapper.ItemMapper;
import org.com.generator.service.ItemService;
import org.com.generator.domain.ao.ElecBillAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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




