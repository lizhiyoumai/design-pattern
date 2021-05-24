package com.design.pattern.store;

import java.util.Map;

/**
 * 发奖接口
 * 所有的奖品无论是实物、虚拟还是第三方，都需要通过我们的程序实现此接口进行处理。
 */
public interface ICommodity {

    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;

}
