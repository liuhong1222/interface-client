package main.java.cn.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * CvsFilePathDomain 对象
 * @author
 *
 */
public class CvsFilePathDomain implements Serializable{

	private static final long serialVersionUID = -8341959716843462358L;

	private String id;
	
	private String thereFilePath;
	
	private String thereFileSize;
	
	private String thereCount;
	
	private String sixFilePath;
	
	private String sixFileSize;
	
	private String sixCount;
	
	private String shutFilePath;
	
	private String shutFileSize;
	
	private String shutCount;
	
	private String unknownFilePath; 
	
	private String unknownFileSize;
	
	private String unknownSize;
	
	private String zipName;
	
	private String zipPath;
	
	private String zipSize;
	
	private String userId;
	
	private Date createTime;
	
	private String isDeleted = "0";
	
	private String fileCode; // 对应的文件id

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getThereFilePath() {
		return thereFilePath;
	}

	public void setThereFilePath(String thereFilePath) {
		this.thereFilePath = thereFilePath;
	}

	public String getSixFilePath() {
		return sixFilePath;
	}

	public void setSixFilePath(String sixFilePath) {
		this.sixFilePath = sixFilePath;
	}

	public String getUnknownFilePath() {
		return unknownFilePath;
	}

	public void setUnknownFilePath(String unknownFilePath) {
		this.unknownFilePath = unknownFilePath;
	}
	
	public String getZipPath() {
		return zipPath;
	}

	public void setZipPath(String zipPath) {
		this.zipPath = zipPath;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getZipSize() {
		return zipSize;
	}

	public void setZipSize(String zipSize) {
		this.zipSize = zipSize;
	}

	public String getThereFileSize() {
		return thereFileSize;
	}

	public void setThereFileSize(String thereFileSize) {
		this.thereFileSize = thereFileSize;
	}

	public String getSixFileSize() {
		return sixFileSize;
	}

	public void setSixFileSize(String sixFileSize) {
		this.sixFileSize = sixFileSize;
	}
	
	public String getShutFilePath() {
		return shutFilePath;
	}

	public void setShutFilePath(String shutFilePath) {
		this.shutFilePath = shutFilePath;
	}

	public String getShutFileSize() {
		return shutFileSize;
	}

	public void setShutFileSize(String shutFileSize) {
		this.shutFileSize = shutFileSize;
	}

	public String getShutCount() {
		return shutCount;
	}

	public void setShutCount(String shutCount) {
		this.shutCount = shutCount;
	}

	public String getUnknownFileSize() {
		return unknownFileSize;
	}

	public void setUnknownFileSize(String unknownFileSize) {
		this.unknownFileSize = unknownFileSize;
	}

	public String getThereCount() {
		return thereCount;
	}

	public void setThereCount(String thereCount) {
		this.thereCount = thereCount;
	}

	public String getSixCount() {
		return sixCount;
	}

	public void setSixCount(String sixCount) {
		this.sixCount = sixCount;
	}

	public String getUnknownSize() {
		return unknownSize;
	}

	public void setUnknownSize(String unknownSize) {
		this.unknownSize = unknownSize;
	}

	public String getZipName() {
		return zipName;
	}

	public void setZipName(String zipName) {
		this.zipName = zipName;
	}

	/**
	 * @return the isDeleted
	 */
	public String getIsDeleted() {
		return isDeleted;
	}

	/**
	 * @param isDeleted the isDeleted to set
	 */
	public void setIsDeleted(String isDeleted) {
		this.isDeleted = isDeleted;
	}

	/**
	 * @return the fileCode
	 */
	public String getFileCode() {
		return fileCode;
	}

	/**
	 * @param fileCode the fileCode to set
	 */
	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}
	
	
}
