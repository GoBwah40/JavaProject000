package simplon.com;


import java.io.FileOutputStream;
import java.io.IOException;

public class AlertMe {

	@Deprecated
	public void doAlert (String rMsg, int rLevel ) throws IOException {
		
		switch (rLevel) {
		case 1: {
			
			System.out.println(rMsg);
			break;
		}
		case 2: {
			 try {
				 String filePath = "C:\\eclipse\\workspace_eclipse\\Devoir000\\src\\simplon\\com\\err_msg.log";
		            FileOutputStream f = new FileOutputStream(filePath, true);   
		            byte[] byteArr = rMsg.getBytes(); //converting string into byte array
		            f.write(byteArr);
		            f.close();
				 } catch (IOException ioe) {
					 System.err.println("IOException: " + ioe.getMessage());

				 }
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + rLevel);
		}
	}
}
