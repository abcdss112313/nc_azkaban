package azkaban.webapp;

import java.io.File;

/**
 * Created by liyangzhou on 17-1-17.
 */
public class Test {
    public  static  void main(String args []) throws  Exception{
        System.out.println(System.getProperty("java.io.tmpdir"));
        File files = new File("/home/liyangzhou/litest");

        System.out.print(files.toURI().toURL());
    }

}
