import org.apache.commons.logging.*;

public class Main {

	public static void main(String[] args) {
		Log logger = LogFactory.getLog(Main.class);
		if(args.length != 2){
			logger.error("‹N“®ˆø”‚Ì”‚ªˆÙí: "+ args.length);
		}
	}
}
