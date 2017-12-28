package com.simple.ICrawl.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import com.simple.ICrawl.ICrawler;
import com.simple.pojos.CrawlResultPojo;
import com.simple.pojos.UrlPojo;

public class SocketCrawlerImpl implements ICrawler {

	@Override
	public CrawlResultPojo crawl(UrlPojo urlPojo) {
		CrawlResultPojo crawlResultPojo = new CrawlResultPojo();
		if (urlPojo == null || urlPojo.getUrl() == null) {
			crawlResultPojo.setSuccess(false);
			crawlResultPojo.setPageContent(null);
			return crawlResultPojo;
		}

		String host = urlPojo.getHost();
		if (host == null) {
			crawlResultPojo.setSuccess(false);
			crawlResultPojo.setPageContent(null);
			System.out.println("host为空，请检查你的url！");
			return crawlResultPojo;
		}
		BufferedWriter bw = null;
		BufferedReader br = null;
		try {
			@SuppressWarnings("resource")
			Socket socket = new Socket(host, 80);
			System.out.println("进行soket连接ing...");
			System.out.println("=================");
			// 发送命令
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			bw.write("GET " + urlPojo.getUrl() + " HTTP/1.0\r\n");
			bw.write("HOST:" + host + "\r\n");
			bw.write("\r\n");// http head输出给服务器完成
			bw.flush();// 清空缓存流

			// 接受返回的结果
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (bw != null) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("流没有关闭，请检查！");
			}
		}
		return null;
	}

	public static void main(String[] args) {
		SocketCrawlerImpl socketCrawlerImpl = new SocketCrawlerImpl();
		UrlPojo urlPojo = new UrlPojo("http://www.baidu.com");
		socketCrawlerImpl.crawl(urlPojo);
		System.out.println("运行结束！");
	}

}
