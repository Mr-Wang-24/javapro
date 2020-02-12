package com.neuede.test2;

import java.io.*;

public class Copy1 {
    public static void main(String[] args) {
        File form = new File("d:/Test.java");
        File parent = new File("d:/a");
        if (!parent.exists()){
            parent.mkdirs();
        }
        File to = new File("d:/a/"+form.getName());
        InputStream inputStream = null;
        OutputStream outputStream = null;
        byte[] b = new byte[1024];
        try {
            inputStream = new FileInputStream(form);
            outputStream = new FileOutputStream(to);
            int len = inputStream.read(b);
            while (len!=-1){
                outputStream.write(b,0,len);
                outputStream.flush();
                len = inputStream.read(b);
            }
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (outputStream!=null)
                  outputStream.close();
                if (inputStream!=null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
