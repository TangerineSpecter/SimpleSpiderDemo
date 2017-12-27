package com.simple.pojos;

import com.simple.pojos.enumeration.TaskLevel;

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

}
