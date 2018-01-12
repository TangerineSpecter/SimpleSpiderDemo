package com.simple.test;

import com.simple.ICrawl.impl.HttpUrlConnectionCrawlerImpl;
import com.simple.pojos.CrawlResultPojo;
import com.simple.pojos.UrlPojo;

public class SocketCrawText {

	public static void main(String[] args) {
		String url = "http://www.baidu.com";
		// CrawlerManager manage = new CrawlerManager();
		UrlPojo urlPojo = new UrlPojo(url);
		// CrawlResultPojo crawl = manage.crawl(urlPojo);
		HttpUrlConnectionCrawlerImpl httpUrlConnectionCrawlerImpl = new HttpUrlConnectionCrawlerImpl();
		CrawlResultPojo crawl = httpUrlConnectionCrawlerImpl.crawl(urlPojo);
		System.out.println(crawl.getPageContent());
		System.out.println("‘À––Ω· ¯£°");
	}
}
