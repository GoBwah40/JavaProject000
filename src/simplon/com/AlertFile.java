package simplon.com;

import java.io.FileOutputStream;
import java.io.IOException;

public class AlertFile implements IAlert {
	
	public void doAlert (String rMsg) {
		 try {
			 String filePath = "C:\\eclipse\\workspace_eclipse\\Devoir000\\src\\simplon\\com\\err_msg.log";
	            FileOutputStream f = new FileOutputStream(filePath, true);   
	            byte[] byteArr = rMsg.getBytes(); //converting string into byte array
	            f.write(byteArr);
	            f.close();
			 } catch (IOException ioe) {
				 System.err.println("IOException: " + ioe.getMessage());

			 }
	}


}
