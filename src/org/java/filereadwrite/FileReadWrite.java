package org.java.filereadwrite;

import java.io.*;

public class FileReadWrite {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Aldri\\OneDrive\\Documents\\Projects\\ReadFile.txt");
        InputStream stream = new FileInputStream(file);
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        StringBuilder sb = new StringBuilder();
        String line;
        while((line= reader.readLine())!=null){
            sb.append(line);
        }

        System.out.println(sb.toString());

        sb.append(" write data successful");
        byte[] bytes = sb.toString().getBytes();
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Aldri\\OneDrive\\Documents\\Projects\\ReadFile.txt");
        outputStream.write(bytes);

    }

}
