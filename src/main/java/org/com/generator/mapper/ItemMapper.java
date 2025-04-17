package org.com.generator.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.com.generator.domain.vo.ElecBillVO;
import org.com.generator.domain.ao.ElecBillAO;

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




