package com.generator.mapper;

import com.generator.domain.ao.ElecBillAO;
import com.generator.domain.vo.ElecBillVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author LENOVO
* @description 针对表【item(商品表)】的数据库操作Mapper
* @createDate 2025-04-16 10:22:06
* @Entity generator.domain.Item
*/
@Mapper
public interface ItemMapper {

    List<ElecBillVO> getElecBill(ElecBillAO elecBillAO);
}




