package com.generator.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户查询出参
 *
 * @author LENOVO
 * @since 2024/9/10 15:48
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ElecBillVO {

    private String id;

    private String name;

    private String price;

    private String stock;

    private String image;

    private String category;

    private String brand;

    private String spec;

    private String sold;

    private String comment_count;

    private String isAD;

    private String status;

    private String create_time;

    private String update_time;

    private String creater;

    private String updater;

}
