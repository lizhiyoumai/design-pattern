package com.design.pattern;

import com.design.pattern.store.ICommodity;
import com.design.pattern.store.impl.CardCommodityService;
import com.design.pattern.store.impl.CouponCommodityService;
import com.design.pattern.store.impl.GoodsCommodityService;

/**
 * 商店工厂
 */
public class StoreFactory {

    public ICommodity getCommodityService(Integer commodityType) {
        if (null == commodityType) return null;
        if (1 == commodityType) return new CouponCommodityService();
        if (2 == commodityType) return new GoodsCommodityService();
        if (3 == commodityType) return new CardCommodityService();
        throw new RuntimeException("不存在的商品服务类型");
    }

}
