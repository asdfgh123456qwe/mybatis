package org.com.generator.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.com.generator.domain.vo.ElecBillVO;
import org.com.generator.domain.ao.ElecBillAO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author LENOVO
* @description 针对表【item(商品表)】的数据库操作Service
* @createDate 2025-04-16 10:22:06
*/
@Service
public interface ItemService{

    List<ElecBillVO> getElecBill(ElecBillAO elecBillAO);

}
