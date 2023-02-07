package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

public class NumberCheckLogDomain implements Serializable {

	private static final long serialVersionUID = -4485824618569344811L;

	private String id;
	
	private Long userId;
	
	private Integer dayInt;

    private String consumptionNum;
    
    private String fileName;
    
    private Long commitCount;

    private Long count;

    private Long realCount;
    
    private Long emptyCount;
    
    private Long silentCount;
    
    private Long riskCount;

    private Integer status;

    private Date createTime;

    private Date updateTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Integer getDayInt() {
		return dayInt;
	}

	public void setDayInt(Integer dayInt) {
		this.dayInt = dayInt;
	}

	public String getConsumptionNum() {
		return consumptionNum;
	}

	public void setConsumptionNum(String consumptionNum) {
		this.consumptionNum = consumptionNum;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Long getCommitCount() {
		return commitCount;
	}

	public void setCommitCount(Long commitCount) {
		this.commitCount = commitCount;
	}

	public Long getCount() {
		return count;
	}

	public void setCount(Long count) {
		this.count = count;
	}

	public Long getRealCount() {
		return realCount;
	}

	public void setRealCount(Long realCount) {
		this.realCount = realCount;
	}

	public Long getEmptyCount() {
		return emptyCount;
	}

	public void setEmptyCount(Long emptyCount) {
		this.emptyCount = emptyCount;
	}

	public Long getSilentCount() {
		return silentCount;
	}

	public void setSilentCount(Long silentCount) {
		this.silentCount = silentCount;
	}

	public Long getRiskCount() {
		return riskCount;
	}

	public void setRiskCount(Long riskCount) {
		this.riskCount = riskCount;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}
