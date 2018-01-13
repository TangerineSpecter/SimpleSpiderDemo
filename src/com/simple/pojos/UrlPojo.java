package com.simple.pojos;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import com.simple.enumeration.TaskLevel;

/**
 * url任务的pojo类
 * 
 * @author 丢失的橘子
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

	public HttpURLConnection getConnection() {
		try {
			URL url = new URL(this.url);
			URLConnection connection = url.openConnection();
			if (connection instanceof HttpURLConnection) {
				return (HttpURLConnection) url.openConnection();
			} else {
				throw new Exception("connection is error!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public String getHost() {
		try {
			URL url = new URL(this.url);
			return url.getHost();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
