package create_and_destory;

import java.io.*;

/**
 * @program: fresh-java-practice
 * @Date: 2019/8/9 20:40
 * @Author: Ling Chen
 * @Description:
 */
public class TryResources {

    private static String firstLineOfFile1() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("/var/log/file"))) {
            return reader.readLine();
        }
    }

    private static String firstLineOfFile2() {
        try (BufferedReader reader = new BufferedReader(new FileReader("/var/log/file"))) {
            return reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
            byte[] bytes = new byte[2048];
            int n;
            while ((n = in.read(bytes)) >= 0)
                out.write(bytes, 0, n);
        }
    }
}
