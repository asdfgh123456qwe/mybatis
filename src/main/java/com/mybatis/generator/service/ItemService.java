package com.mybatis.generator.service;

import com.mybatis.generator.domain.ao.ElecBillAO;
import com.mybatis.generator.domain.vo.ElecBillVO;

import java.util.List;

/**
* @author LENOVO
* @description 针对表【item(商品表)】的数据库操作Service
* @createDate 2025-04-16 10:22:06
*/
public interface ItemService{

    List<ElecBillVO> getElecBill(ElecBillAO elecBillAO);

}
