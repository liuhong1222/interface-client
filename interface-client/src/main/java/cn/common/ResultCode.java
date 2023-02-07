package main.java.cn.common;

public class ResultCode {

	/**
	 * 成功
	 */
	public static final String RESULT_SUCCEED ="000000";
	
	/**
	 * 失败
	 */
	public static final String RESULT_FAILED  ="999999";
	
	/**
	 * 密码错误
	 */
	public static final String RESULT_PASSWORD_ERROR  ="999991";
	
	/**
	 * 业务异常
	 */
	public static final String RESULT_BUSINESS_EXCEPTIONS = "999998";
	
	/**
	 * 参数异常
	 */
	public static final String RESULT_PARAM_EXCEPTIONS = "999997";
	
	/**
	 * 数据不存在
	 */
	public static final String RESULT_DATA_EXCEPTIONS = "999995";
	
	/**
	 * session 登录过期
	 */
	public static final String RESULT_SESSION_STALED = "999994";
	
	public static final String RESULT_SENDMAIL_FAILED = "999987";
	
	/**
	 * ip黑名单
	 */
	public static final String RESULT_API_NOTIPS = "999986";
	
	/**
	 * 对外api接口校验商户剩余可使用条数不够
	 */
	public static final String RESULT_API_NOTCOUNT = "999985";
	
	/**
	 * 请求方不能并发请求
	 */
	public static final String RESULT_API_NOTCONCURRENT = "999984";
	
	/**
	 * 请求数量超过阀值
	 */
	public static final String RESULT_API_MORE_THAN = "999983";
	
	/**
	 * 域名为空
	 */
	public static final String DOMAIN_NULL = "999982";
	
	/**
	 * 已登录别的域名
	 */
	public static final String DOMAIN_ERROR  ="999981";
	
	/**
	 * 短信营销 ip地址测试超过了10次
	 */
	public static final String IP_TEST_OVERCOMMITED  ="999980";
	
	/**
	 * 文件检测完成
	 */
	public static final String TEST_SUCCESS  ="999979";
}
