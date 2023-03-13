package objectPoolPattern2;

public class Library {
    public static void main(String[] args) throws InterruptedException {
    	
    	
        Student student1 = new Student(101,"arun","csBook");
        
        
        System.out.println(student1.getBook());
                        
        Student student2 = new Student(102,"marshall","bioBook");
        
        System.out.println(student2.getBook());
        
      //  Student.releaseReference(student2);
        
        Student student3 = new Student(102,"marshall","bioBook");

        System.out.println(student3.getBook());

        
       
        
 
        
    }
}

