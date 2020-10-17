package com.ytc.model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class AlipayConfig implements Serializable {
    private static final long serialVersionUID = 7903728454546159876L;
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016102600763977";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQC0z0mtjzhrqJywLLtYzkerxPP5XAqSPPCrG3UGAq+AkiUayvGelMs2krVvvRS1fJAKw3ysEWR1pNRTcylzbwzvfp5inz7g7opQOl7kdt2Ud09GoLXV/KVtdyrBdaF22VsBW2H+sfb/IvGaOlHBVMKoMQ8ZjH72NTYC71JzuVqVA7DUipIOgwGoNIHTKLKBPhFGK9mw8vrL+H24eOT8P1KCEPGibWXHvS6q/A3yS3yQnCG5oi6zwvowW4LqHEB8rnQIHrUiUe/oDHpNyIi4vztC/otsSaNpMS0QdnTzcRnNF1KH5zLyKiW+F7oR5MZN3mulcd7PJDM7P/qiNXv4cDVJAgMBAAECggEAftT5hfn1Re/dGegG82Cf/eoGimD6OWLuH9j+2dyAZ9wckxLRMsCFXB7Fj0A/ip96G1LN3ZXFtpCNMIyUAxlfJZDYYa37WaV6+JQ5hGGtRTv8LDsH0reLA6KYJ2TwgoItyGHl99e2v3ovqFRIjSl78qeXRAC9/s+Mt7pRSEQ5OlVSmszhGW1wO+AqJFQyO632HP/ifhkyJZJ5cNwXxVVQDM3VU3J5W3mNBrz+bkscyRI7H7uLguPlaaLl53R7od6S9/kB+vfY0/koVaiThRxn3AEm4kna2/cVlAfRZg0z3chxuHN/DnDAErhRafK+qc+HDoIdYvzqAFbzJcV4M2TtUQKBgQDXhV9IIK0w3Nl9tcz89PxWdC2SSoL51mreQLVZ0+0tWfTxzXB4UH1cEZzH99jjxWu4valejzvsYezH/a6pUXEwFweGXIZRor8GoFLodPcckc0CxU3gD657GM7UsoOmH0njyI8NHAXrPaY4V+1/yM01xPJoV6LNYdK7kIAHuMa5+wKBgQDWxO/WweVamVMvv16RfHxByW3D5zUs9UKbr1R60ok425YS2OMbaDhboTlJ+CrEVtU9YdzRfOS9DZQtER+AXnsBZNQgNI5R9aNc1KKXb0i6Hu8YaiAnMh5XHWyoWeH4SMORW16zAEN3LiMfTi3YK0+1KfmG902mGqQWv5oRXiCOiwKBgQC2sd2iY+jMifpoISvCpt4dX2CeKUG8DfILs2jH2+mrTx1fuJoFs52A5YE01jnqYxk8wrIHcX4HlL9GjRp5d4tui6caU+ac30v1jwSY/0XW1xWlqqGoNULgIJh8H1OQB+f4CrSRFVdDIcB89LRkZVDnqqsenmNonOspioWthgoX7wKBgCvSKw2qql1+A1cuuOD+gWv66YabWmI9+MVDVP1qj80mIMzfrBcfgMBReRr6o99DyGap3SBxV0qrxpwbbk4G+RojtJSNpKxcbmS2jiZP8ornXOmiXcUhmMc1ncIL9OtwDVdPSVdEqn9azpfIn9oHnE/erKc5NoK51Nk/ZvQ8PHBZAoGBALajiljV+EVadccfsaiI+yHgL9eCbdc0o9BceuW0I+nmHTRZQf1xjwq9MtlUckihGIFy/goqRG1iMkY4c5TpMWq65/tZZxpm+p5U8zPKm/n+mR6Vhi6Kyddn/PwxmY+qIy+iyT1XTa4vYoysBu4barVdSFnyLgASPpvmJUreHKsf";

    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAtM9JrY84a6icsCy7WM5Hq8Tz+VwKkjzwqxt1BgKvgJIlGsrxnpTLNpK1b70UtXyQCsN8rBFkdaTUU3Mpc28M736eYp8+4O6KUDpe5HbdlHdPRqC11fylbXcqwXWhdtlbAVth/rH2/yLxmjpRwVTCqDEPGYx+9jU2Au9Sc7lalQOw1IqSDoMBqDSB0yiygT4RRivZsPL6y/h9uHjk/D9SghDxom1lx70uqvwN8kt8kJwhuaIus8L6MFuC6hxAfK50CB61IlHv6Ax6TciIuL87Qv6LbEmjaTEtEHZ083EZzRdSh+cy8iolvhe6EeTGTd5rpXHezyQzOz/6ojV7+HA1SQIDAQAB";

    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = "http://kyd.free.idcfengye.com/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://kyd.free.idcfengye.com/returnUrl";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
