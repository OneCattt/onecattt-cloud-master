package com.dsl.service.base;

/**
 * @Description:  状态码定义（建议：系统级别(1000以下)，服务处理标识状态:10000-20000以内, 业务提示码(20000以上提供相应友好提示文案)）
 * Created by HYF on 2019/6/24
 */
public class CodeConstant {

    /*
    * 系统提示
    * */
    //success
    public static final int CODE_SUCCESS = 200;
    // fail
    public static final int FAIL = 400;
    //访问凭证无效---重新登陆
    public static final int RELOAD = 401;
    //缺失门店标识
    public static final int NONE_TARGET = 402;
    //拒绝访问---没有访问权限
    public static final int NO_ACCESS_RIGHTS = 405;
    //未授权
    public static final int NONE_GRANT_AUTH = 406;
    //重试
    public static final int RETRY_OPERATION = 407;

    //exception
    public static final int CODE_ERROR = 500;
    //小程序，微信交互处理异常
    public static final int CODE_HANDLE_FAIL = 800;
    //Invalid response  系统服务交互出现错误
    public static final int CODE_INVALID_RESPONSE = 900;
    //param incalid
    public static final int CODE_PARAM_INVALID = 10011;



    /*
    * 货品提示
    * */
    //库存不足
    public static final int GOODS_STOCK_NONE = 20004;

    /*
    * 活动提示
    * */
    //执行促销失败
    public static final int PROM_EXCUTE_FAIL = 20001;

    /*
    * 订单提示
    * */
    //确认订单失败
    public static final int ORDER_CONFIRM_FAIL = 20005;
    //订单支付失败
    public static final int ORDER_PAY_FAIL = 20006;

    /*
    * 支付提示
    * */
    public static final int ORDER_PAID = 50009;//订单已支付
    public static final int ORDER_CLOSED = 50010;//订单已关闭
    public static final int OUT_TRADE_NO_USED = 50011; //不接受--订单号重复，重复请求
    public static final int NO_TENOUGH = 50012;//余额不足
    public static final int PAY_DONING = 50000;//支付中
    // 50013 至 50024 详见:WxResultEnum;//调起支付失败
    public static final int CALL_PAY_FAIL = 20025;



}