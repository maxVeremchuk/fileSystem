/** Created by ahoma on 28/03/2019. Copyright (c) 2019 Andrii Khoma. All rights reserved. */
public class umask {
  /**
   * The name of this program. This is the program name that is used when displaying error messages.
   */
  public static final String PROGRAM_NAME = "umask";

  /**
   * Change umask
   *
   * @exception java.lang.Exception if an exception is thrown by an underlying operation
   */
  public static void main(String[] argv) throws Exception {
    // initialize the file system simulator kernel
    Kernel.initialize();

    // make sure we got the correct number of parameters
    if (argv.length != 1) {
      System.err.println(
          PROGRAM_NAME + ": usage: java " + PROGRAM_NAME + " octal number from 000 to 777");
      Kernel.exit(1);
    }

    // give the parameters more meaningful names
    String umask = argv[0];

    int intUmask = Integer.parseInt(umask, 8);

    Kernel.umask((short) intUmask);

    Kernel.exit(0);
  }
}
