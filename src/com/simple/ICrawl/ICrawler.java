package com.simple.ICrawl;

import com.simple.pojos.CrawlResultPojo;
import com.simple.pojos.UrlPojo;

public interface ICrawler {

	public CrawlResultPojo crawl(UrlPojo urlpojo);
}
