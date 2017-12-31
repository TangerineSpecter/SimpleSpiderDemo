package com.simple.test;

import com.simple.manager.CrawlerManager;
import com.simple.pojos.CrawlResultPojo;
import com.simple.pojos.UrlPojo;

public class SocketCrawText {

	public static void main(String[] args) {
		String url = "http://www.baidu.com";
		CrawlerManager manage = new CrawlerManager();
		UrlPojo urlPojo = new UrlPojo(url);
		CrawlResultPojo crawl = manage.crawl(urlPojo);
		System.out.println(crawl.getPageContent());
		System.out.println("‘À––Ω· ¯£°");
	}
}
