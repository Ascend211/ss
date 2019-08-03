//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.fh.shop.producr.po;


import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;
@Data
public class Product implements Serializable {
    private static final long serialVersionUID = -5636511995112428289L;
    private Integer id;

    @TableField("name")
    private String proName;
    private String classifyName;
    private String imageProUrl;
    private String gc1;
    private String gc2;
    private String gc3;
    private Float price;
    @DateTimeFormat(
            pattern = "yyyy-MM-dd"
    )
    private Date createDate;
    private Integer status;
    private int ishot;
    private Integer brandId;
    public Product() {
    }


}
