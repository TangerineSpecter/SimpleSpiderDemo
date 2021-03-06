package com.simple.manager;

import com.simple.ICrawl.ICrawler;
import com.simple.ICrawl.impl.HttpUrlConnectionCrawlerImpl;
import com.simple.ICrawl.impl.SocketCrawlerImpl;
import com.simple.pojos.CrawlResultPojo;
import com.simple.pojos.UrlPojo;

/**
 * 业务逻辑的抓取管理器
 * 
 * @author 丢失的橘子
 *
 */
public class CrawlerManager {

	private ICrawler crawler;

	public CrawlerManager(boolean isSocket) {
		if (isSocket) {
			this.crawler = new SocketCrawlerImpl();
		} else {
			this.crawler = new HttpUrlConnectionCrawlerImpl();
		}
	}

	public CrawlResultPojo crawl(UrlPojo urlPojo) {
		return this.crawler.crawl(urlPojo);
	}

}
