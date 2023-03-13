package objectPoolPattern2;

public class Student {

	
    private int rollNo;
    private String name;
    private Books book;

       
    private static int computerBookUsingCount = 0;
    private static int biologyBookUsingCount = 0;
    private static int scienceBookUsingCount = 0;
    
    private static Books pool[] = new Books[3];
    
    public Student( int enroll,String name, String bookName)
    {
        this.name = name;
        this.rollNo = enroll;
        this.book = initBook(bookName);
        
    }
    
    public Books initBook(String name)
    {
        
        if(name =="csBook")
        {
            if(computerBookUsingCount == 0)
            {
                pool[0] = new ComputerScienceBook();
                computerBookUsingCount++;
                return pool[0];
            }
            else {
                return null;

            }
            
        }
        else
        {
            if(name == "scienceBook")
            {
                if(scienceBookUsingCount == 0)
                {
                    pool[1] = new ScienceBook();
                    scienceBookUsingCount++;
                        
                    return pool[1];
                }
                else {
                    return null;

                }
            }
            else
            {
            	if(name == "bioBook") {
                if(biologyBookUsingCount == 0)
                {
                    pool[2] = new BiologyBook();
                    biologyBookUsingCount++;
                    return pool[2];
                }
                else
                {
                  return null;
                }
            	}
            }
            return null;
        }
    }
    
    public Books getBook()
    {
        return book;
    }
    
    public String getName()
    {
        return name;
    }
    
    public int getEnroll()
    {
        return rollNo;
    }
    
   
    
    public static void  releaseReference(Student studentRelease)
    {
        if(studentRelease.book == pool[0])
        {
        	computerBookUsingCount--;
        }
        else
        {
            if(studentRelease.book == pool[1])
            {
            	scienceBookUsingCount--;
            }
            else
            {
            	biologyBookUsingCount--;
            }
        }
    }
 
    
     public static int getBiologyBookUsingCount()
    {
        return biologyBookUsingCount;
    }
    
    public static int getComputerBookUsingCount()
    {
        return computerBookUsingCount;
    }
    
    public static int getScienceBookUsingCount()
    {
        return scienceBookUsingCount;
    }
    
    
}
