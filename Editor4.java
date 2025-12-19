import java.awt.Color;

public class Editor4 {

	public static void main (String[] args){
		String fileName1 = args[0];
		String fileName2 = args[1];
		int n = Integer.parseInt(args[2]);
		Color[][] image1 = Runigram.read(fileName1);
		Color[][] image2 = Runigram.read(fileName2);
		Runigram.setCanvas(image1);
		Runigram.display(image1);
		StdDraw.pause(2000);
		for (int i = 0; i <= n; i++) {
			double alpha = (double) (n - i) / n;
			Color[][] blended = Runigram.blend(image1, image2, alpha);
			Runigram.display(blended);
			StdDraw.pause(500);
		}
	}
}
