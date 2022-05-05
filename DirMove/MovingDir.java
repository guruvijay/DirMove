package DirMove;

import java.io.File;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

public class MovingDir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Stream<Path> paths = Files.list(Path.of("C:\\SourceFolder"));
			//paths.filter(Files::isRegularFile);
			
			File source = new File("C:\\SourceFolder");
			File destination = new File("D:\\DestFolder");
			if(!destination.exists()) {
				destination.mkdir();
			}
			try {
				Files.move(source.toPath(), destination.toPath(),StandardCopyOption.REPLACE_EXISTING);
				System.out.println(" Files are moved ");
			}
			catch(DirectoryNotEmptyException e) {
				e.printStackTrace();
			}
			
			}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
