package com.simple.pojos;

/**
 * 抓取结果的封装
 * 
 * @author 丢失的橘子
 *
 */
public class CrawlResultPojo {
	/** 返回结果 */
	private boolean isSuccess;
	/** 网页内容 */
	private String pageContent;
	/** 请求状态码 */
	private int httpStatusCode;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getPageContent() {
		return pageContent;
	}

	public void setPageContent(String pageContent) {
		this.pageContent = pageContent;
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

}
