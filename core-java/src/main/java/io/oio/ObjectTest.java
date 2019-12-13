package io.oio;

import java.io.*;

public class ObjectTest {

    public static void case1() throws IOException, ClassNotFoundException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("core-java\\src\\main\\java\\io\\oio\\Bean.bin")
        );
        objectOutputStream.writeObject(new Bean("Ling"));

        ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("core-java\\src\\main\\java\\io\\oio\\Bean.bin")
        );

        Bean bean = (Bean) objectInputStream.readObject();
        System.out.println(bean.getName());


    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectTest.case1();
    }

    public static class Bean implements Serializable {
        private String name;

        public Bean(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
}
