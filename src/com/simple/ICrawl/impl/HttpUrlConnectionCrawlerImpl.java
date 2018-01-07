package com.simple.ICrawl.impl;

import com.simple.ICrawl.ICrawler;
import com.simple.pojos.CrawlResultPojo;
import com.simple.pojos.UrlPojo;

/**
 * HttpUrlConnection��ʽ
 * 
 * @author ��ʧ������
 *
 */
public class HttpUrlConnectionCrawlerImpl implements ICrawler {

	@Override
	public CrawlResultPojo crawl(UrlPojo urlPojo) {
		CrawlResultPojo crawlResultPojo = new CrawlResultPojo();
		if (urlPojo == null || urlPojo.getUrl() == null) {
			crawlResultPojo.setSuccess(false);
			crawlResultPojo.setPageContent(null);
			return crawlResultPojo;
		}

		return null;
	}

}
