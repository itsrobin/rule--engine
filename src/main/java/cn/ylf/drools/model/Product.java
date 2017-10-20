package cn.ylf.drools.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author lifeng
 * @version 1.0 on 2017/9/5.
 */
@Getter
@Setter
public class Product {
    /**
     * 钻石
     */
    public static final String DIAMOND = "0";

    /**
     * 黄金
     */
    public static final String GOLD = "1";

    private String type;

    private int discount;
}
