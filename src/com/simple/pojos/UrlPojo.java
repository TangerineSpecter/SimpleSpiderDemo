package com.simple.pojos;

import java.net.MalformedURLException;
import java.net.URL;

import com.simple.pojos.enumeration.TaskLevel;

/**
 * url�����pojo��
 * 
 * @author ��ʧ������
 *
 */
public class UrlPojo {

	private String url;
	private TaskLevel taskLevel = TaskLevel.MIDDLE;

	public UrlPojo(String url) {
		super();
		this.url = url;
	}

	public UrlPojo(String url, TaskLevel taskLevel) {
		super();
		this.url = url;
		this.taskLevel = taskLevel;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public TaskLevel getTaskLevel() {
		return taskLevel;
	}

	public void setTaskLevel(TaskLevel taskLevel) {
		this.taskLevel = taskLevel;
	}

	public String getHost() {
		try {
			URL url = new URL(this.url);
			return url.getHost();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
