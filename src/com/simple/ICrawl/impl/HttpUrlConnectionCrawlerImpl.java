package com.simple.ICrawl.impl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

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

		StringBuilder sb = new StringBuilder();
		HttpURLConnection connection = urlPojo.getConnection();
		if (connection != null) {
			BufferedReader br = null;
			String line = null;
			try {
				System.out.println("����httpConnection����ing...");
				System.out.println("=================");
				br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				crawlResultPojo.setSuccess(true);
				crawlResultPojo.setPageContent(sb.toString());
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					if (br != null) {
						br.close();
					}
				} catch (IOException e) {
					System.out.println("���]�йرգ�");
					e.printStackTrace();
				}
			}
		}
		return crawlResultPojo;
	}

}
