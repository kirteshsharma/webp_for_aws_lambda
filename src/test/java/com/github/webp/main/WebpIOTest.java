package com.github.webp.main;

import java.io.File;

/**
 * @author kirtesh
 *
 */
public class WebpIOTest {

  // @Test
  public void testConvert() {
    File src = new File(WebpIOTest.class.getResource("/heng.webp").getPath());
    // System.out.println(src);
    File dest = new File("heng.png");

    WebpIO.toNormalImage(src, dest);
    WebpIO.close();
  }

  public static void main(String[] args) {
    String osName = System.getProperty("os.name");
    String osArch = System.getProperty("os.arch");
    System.out.println(osName.replace(" ", "") + "_" + osArch);
  }
}
