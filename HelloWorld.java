/* This is a simple Java program.
   FileName : "HelloWorld.java". */
class HelloWorld
{
    // Your program begins with a call to main().
    // Prints "Hello, World" to the terminal window.
    public static void main(final String args[])
    {
        System.out.println("Hello, World!");
        // for each arguments, and print reverse input
        for (final String arg : args) {
            // Print from the last char (n-1) to 0 (first char) in the string
            for(int i = arg.length() - 1; i >= 0; i--) {
                final char ch = arg.charAt(i);
                System.out.print(Character.toUpperCase(ch));
            }
            System.out.println();
        }
    }
}
