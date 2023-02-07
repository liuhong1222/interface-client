package main.java.cn.service;

import main.java.cn.common.BackResult;
import main.java.cn.domain.UserAccountDomain;

public interface UserAccountBusService {

	/**
	 * 根据手机号码 查询
	 * @param mobile
	 * @return
	 */
	BackResult<UserAccountDomain> findByMobile(String mobile);		
	
	/**
	 * 消费条数
	 * @param creUserId
	 * @param count
	 * @return
	 */
	BackResult<Boolean> consumeAccount(String creUserId,String count);
	
	/**
	 * 修改检测结果压缩包密码
	 * @param mobile
	 * @return
	 */
	BackResult<String> updateResultPwd(String mobile,String resultPwd);
	
	/**
	 * 获取检测结果压缩包密码
	 * @param mobile
	 * @return
	 */
	BackResult<String> getResultPwd(String creUserId);
}
