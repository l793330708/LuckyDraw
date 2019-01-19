package com.lyp.day01;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.compress.utils.IOUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FSDataOutputStream;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.junit.Test;

public class TestHDFS {
	
	/**
	 *  测试上传
	 * @throws IOException 
	 */
	@Test	
	public void upload() throws IOException {
		Configuration conf = new Configuration();
		
		FileSystem fs = FileSystem.get(conf);
		
		FileInputStream io = new FileInputStream("D:/1.txt");
		FSDataOutputStream os = fs.create(new Path("hdfs://192.168.79.131:9000/"));
		IOUtils.copy(io, os);
		
		
	}
	/**
	 * 测试下载
	 */
	@Test
	public void download() {
		
	}
	/**
	 * 列出目录
	 */
	@Test
	public void list() {
		
	}
	/**
	 * 移动目录
	 */
	
	/**
	 * 删除目录
	 */
}
