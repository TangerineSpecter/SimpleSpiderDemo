package com.simple.pojos;

/**
 * ץȡ����ķ�װ
 * 
 * @author ��ʧ������
 *
 */
public class CrawlResultPojo {
	/** ���ؽ�� */
	private boolean isSuccess;
	/** ��ҳ���� */
	private String pageContent;
	/** ����״̬�� */
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
