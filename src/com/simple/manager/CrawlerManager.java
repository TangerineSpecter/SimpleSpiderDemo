package com.simple.manager;

import com.simple.ICrawl.ICrawler;
import com.simple.ICrawl.impl.SocketCrawlerImpl;
import com.simple.pojos.CrawlResultPojo;
import com.simple.pojos.UrlPojo;

/**
 * ҵ���߼���ץȡ������
 * 
 * @author ��ʧ������
 *
 */
public class CrawlerManager {

	private ICrawler crawler;

	public CrawlerManager() {
		this.crawler = new SocketCrawlerImpl();
	}

	public CrawlResultPojo crawl(UrlPojo urlPojo) {
		return this.crawler.crawl(urlPojo);
	}

}
