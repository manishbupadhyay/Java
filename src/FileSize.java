import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;

// Java Program to calculate Size
// of a file on the Internet.
public class FileSize {
	public static void main(String[] args) throws Exception {
		
		BigInteger size = new BigInteger("1");
		
		// get the url of web page
        URL url = new URL("https://file-examples-com.github.io/uploads/2017/10/file-example_PDF_1MB.pdf");
      
     // create a connection
        HttpURLConnection conn;
        try
        {
                  
            // open stream to get size of page
            conn = (HttpURLConnection)url.openConnection();
              
            // set request method.
            conn.setRequestMethod("HEAD");
              
            // get the input stream of process
            conn.getInputStream();
              
            // store size of file
            size = BigInteger.valueOf(conn.getContentLength());
              
            // print the size of downloaded file
            System.out.println("The Size of file is:" + size + " bytes");
            if(size.compareTo(size.ONE) > 0) {
            	System.out.println("Test PASS");
            }
            else System.out.println("Test FAIL");
            conn.getInputStream().close();
        }
        catch (Exception e)
        {
            System.out.println("Connection failed");
        }
	}

}
