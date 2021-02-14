package com.teskinfly;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSorter {//修改文件默认排序
    public static String tmpUrl = FileNameReader.basePath + "\\tmp";
    public static void main(String[] args) throws IOException {
        FileNameReader.read();
        move();
    }

    private static void move() throws IOException {
        //创建tmp目录
        File tmp = new File(tmpUrl);
        if (!tmp.exists())
            tmp.mkdir();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(FileNameReader.sortUrl)));
        //读取sort.txt
        List<File> fileList = new ArrayList<File>();
        List<File> tmpList = new ArrayList<File>();
        String s;
        while ((s = br.readLine()) != null) {
            fileList.add(new File(FileNameReader.basePath + "\\"+s));
            tmpList.add(new File(tmpUrl+"\\"+s));
        }
        //全部复制到tmp目录
        for (int i = 0; i < fileList.size(); i++) {
            fileList.get(i).renameTo(tmpList.get(i));
        }
        //全部复制出来
        for (int i = 0; i < tmpList.size(); i++) {
            tmpList.get(i).renameTo(fileList.get(i));
        }
        //删除目录
        tmp.delete();
    }
}
