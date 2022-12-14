package simplon.com;

public class MainAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (!(args.length > 2)) {
			switch (Integer.parseInt(args[1])) {
			
			case 1: {
				IAlert alertLog = new AlertLog();
				alertLog.doAlert(args[0]);
			}
			
			case 2: {
				IAlert alertFile = new AlertFile();
				alertFile.doAlert(args[0]);
			}
			default:
		}
	} else {
		System.out.println("Erreur mon pauvre ami...");
	}
		
		

}
}