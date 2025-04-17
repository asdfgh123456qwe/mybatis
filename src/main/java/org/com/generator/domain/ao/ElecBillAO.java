package org.com.generator.domain.ao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * 用户查询入参
 *
 * @author LENOVO
 * @since 2024/9/10 15:48
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ElecBillAO {

    private List<String> id;

    private String category;

    private Integer pageSize;

    private Integer pageNo;

}
