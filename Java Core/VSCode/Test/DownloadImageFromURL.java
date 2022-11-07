
import java.util.*;

class DownloadImageFromURL{
	public static void main(String[] args) {
		String urlImage = "https://playingcardsio.s3.amazonaws.com/games/joking-hazard/001.png";
		// for(int i = 1; i <= 360; ++i){

		// }
		saveImage(urlImage);
	}

	public static void saveImage(String imageUrl) throws IOException {
	URL url = new URL(imageUrl);
	String fileName = url.getFile();
	String destName = "./figures" + fileName.substring(fileName.lastIndexOf("/"));
	System.out.println(destName);
 
	InputStream is = url.openStream();
	OutputStream os = new FileOutputStream(destName);
 
	byte[] b = new byte[2048];
	int length;
 
	while ((length = is.read(b)) != -1) {
		os.write(b, 0, length);
	}
 
	is.close();
	os.close();
}
}