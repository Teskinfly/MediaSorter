package com.teskinfly;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class FileNameReader {
    final static String basePath = "..";
//    final static String basePath = "H:\\";
    final static String sortUrl = basePath + "\\executor\\sort.txt";
    public static void read() throws IOException {//读取文件夹目录下的所有文件，将sort.txt中没有的数据存入sort.txt，并过滤sort.txt的无效文件
        File root = new File(basePath);
        List<String> recordFileList = new ArrayList();
        List<String> fileList = new ArrayList();
        List<String> deleteCandidate = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(sortUrl)));
        String[] fileNames = root.list();
        String s;
        while ((s = br.readLine()) != null) {//读取sort.txt
            if (s.equals("")|| Pattern.matches("^\\s+$", s)) continue;
            recordFileList.add(s.trim());
        }
//        System.out.println(recordFileList);
        for (int i = 0; i < fileNames.length; i++) {    //读取原文件
            File file = new File(basePath + "//" + fileNames[i]);
            if (!file.isDirectory())
                fileList.add(fileNames[i]);
        }
        //删除sort.txt无效文件名
        System.out.println(recordFileList);
        for (String fileName : recordFileList) {
            if (!fileList.contains(fileName)) {
//                System.out.println(fileName);
                deleteCandidate.add(fileName);
            }
        }
        for (String fileName: deleteCandidate) {
            recordFileList.remove(fileName);
        }
        for (String fileName : fileList) {            //添加新的文件名
            if (!recordFileList.contains(fileName)) {
                recordFileList.add(fileName);
            }
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sortUrl)));
        for (String fileName : recordFileList) {
            bw.write(fileName);
            bw.newLine();
        }
//        System.out.println(recordFileList);
        bw.flush();
        bw.close();
    }
}
