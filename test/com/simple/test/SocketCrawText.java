package com.simple.test;

import com.simple.ICrawl.impl.SocketCrawlerImpl;
import com.simple.pojos.CrawlResultPojo;
import com.simple.pojos.UrlPojo;

public class SocketCrawText {

	public static void main(String[] args) {
		SocketCrawlerImpl socketCrawlerImpl = new SocketCrawlerImpl();
		UrlPojo urlPojo = new UrlPojo("http://www.baidu.com");
		CrawlResultPojo crawl = socketCrawlerImpl.crawl(urlPojo);
		System.out.println(crawl.getPageContent());
		System.out.println("‘À––Ω· ¯£°");
	}
}
