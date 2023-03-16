package commandPattern;

public class CommandApplication {
	
	public static void main(String[] args) {
		
		TextFileOperationExecutor textFileOperationExecutor	= new TextFileOperationExecutor();
		
		System.out.println(textFileOperationExecutor.executeOperation(new OpenTextFileOperation(new TextFile("designPattern.txt"))));
		
		System.out.println(textFileOperationExecutor.executeOperation(new SaveTextFileOperation(new TextFile("angular.txt"))));
	}


}
