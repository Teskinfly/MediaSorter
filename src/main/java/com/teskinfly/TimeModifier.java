package com.teskinfly;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import static com.teskinfly.FileNameReader.basePath;
import static com.teskinfly.FileNameReader.sortUrl;

public class TimeModifier {//批量修改时间
    public static void main(String[] args) throws IOException {
        FileNameReader.read();
        write();
    }
    public static void write() throws IOException {
        List<String> newFileList = new ArrayList();
        int len = newFileList.size();
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(sortUrl)));
        String s;
        while ((s = br.readLine()) != null) {
            if (s.trim().equals("")) continue;
            newFileList.add(s.trim());
            System.out.println(s);
        }
        for (String name : newFileList) {
            name = basePath + "\\" + name;
            File file = new File(name);
            if (file.exists()) {
                file.setLastModified(System.currentTimeMillis() + (len--) * 100000);
            }
        }
        br.close();
    }

}