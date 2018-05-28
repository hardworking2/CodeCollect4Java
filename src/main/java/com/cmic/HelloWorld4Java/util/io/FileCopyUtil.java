package com.cmic.HelloWorld4Java.util.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.cmic.HelloWorld4Java.help.Link;
import com.cmic.HelloWorld4Java.help.Tips;

@Tips(description = "几种文件复制的方法")
@Link(link2Where = "https://blog.csdn.net/u014263388/article/details/52098719", link4What = "介绍四种文件复制操作")
public class FileCopyUtil {

	@Tips(description = "经典的IO流写法", riskPoint = "比较慢")
	private static void copyFileUsingFileStreams(File source, File dest) throws IOException {
		InputStream in = null;
		OutputStream out = null;
		if (!source.isFile()) {
			System.out.println("不是文件");
		} else if (!dest.isFile()) {
			System.out.println("不是文件");
		}
		in = new FileInputStream(source);
		out = new FileOutputStream(dest);
		byte[] b = new byte[1024];
		int size;
		while ((size = in.read(b)) > 0) {
			out.write(b, 0, size);
		}
		in.close();
		out.close();
	}
}
