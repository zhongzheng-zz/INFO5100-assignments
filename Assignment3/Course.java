package Assignment3;
import java.util.*;

public class Course {
   private int courseId;
   private String courseName;
   private int maxCapacity;
   private String professorId;
   private int credits;
   private int[] studentIds;
   
   Course(int courseId){
      this.courseId = courseId;
   }
   
   Course(int courseId, String professorId){
	  this.courseId = courseId;
	  this.professorId = professorId;
   }
   
   Course(int courseId, String professorId, int credits){
	  this.courseId = courseId;
	  this.professorId = professorId;
	  this.credits =credits;  
   }
    public void setCourseId(int courseId) {
    	if(courseId > 0) {
    	  this.courseId = courseId;
    	}
    	else {
    	  throw new IllegalArgumentException("courseId should be greater than 0");	
    	}
    } 
    public int getCourseId() {
    	return courseId;
    }
    public void setCourseName(String courseName) {
    	if(courseName.length() >= 10 && courseName.length()<=60) {
       	  this.courseName = courseName;
    	}
    	else {
    	  throw new IllegalArgumentException("the length of the courseName should between 10 and 60");	
    	}
    }
    public String getCourseName() {
    	return courseName;
    }
    public void setMaxCapacity(int maxCapacity) {
    	if(maxCapacity>10 && maxCapacity <100) {
    		this.maxCapacity = maxCapacity;
    	}
    	else {
    		throw new IllegalArgumentException("maxCapacity should not be less than 10 or greater than 100");
    	}
    }
    public int getMaxCapacity() {
    	return maxCapacity;
    }
    public void setProfessorId(String professorId) {
    	if(professorId.length() != 6) {
    	   throw new IllegalArgumentException("the professorId is invaild");
    	}
    	else {
    	   this.professorId = professorId;
    	}
    } 
    public String getProfessorId() {
    	return professorId;
    }
    public void setCredits(int credits) {
    	if(credits > 0 && credits < 10) {
    	   this.credits = credits;
    	}
    	else {
    		throw new IllegalArgumentException("this credits is illegal");
    	}
    
    }
    public int getCredits() {
    	return credits;
    }
    public int[] getStudentIds() {
    	return studentIds;
    }
    public void registerStudent(int studentId) {
    	if (this.studentIds == null) {
    		this.studentIds = new int[]{studentId};
    	} else {
    		int[] rs = this.studentIds;
    		this.studentIds = new int[rs.length+1];
    		for(int i=0; i<rs.length; i++) {
       		 studentIds[i] = rs[i];
       	 } 
    		studentIds[studentIds.length-1]= studentId;
    	}
    }
    public int[] removeDuplicates(int[] studentIds) {
            int[] rd = new int[studentIds.length];
            int al = 0;
            for(int i = 0; i < studentIds.length; i++) {
            	boolean p = false;
    		    for(int j=0; j<al; j++) {
    			    if(rd[j] == studentIds[i]) {
    				    p = true;
    				    break;
    				}
    			}
    		    if (!p) {
    			   rd[al++]=studentIds[i];
    		    }
    		}
            int[] newStudentIds = new int[al];
            for(int q=0; q<al;q++) {
            	newStudentIds[q]= rd[q];
            }
            System.out.println(Arrays.toString(newStudentIds));
    	    return newStudentIds;
    	
    }
    
    public int groupsOfStudents(int[] studentIds) {
    	int p=0;
    	for(int i =0; i<studentIds.length; i++) {
    		for (int j=i+1;j<studentIds.length; j++) {
    			if(studentIds[i] % 2 == 0 && studentIds[j] %2 ==0) {
    				p++;
    			}
    			else if(studentIds[i] % 2 == 1 && studentIds[j] % 2 ==1) {
    				p++;
    			}else {
    				continue;
    			}
    		}
    	}
    	System.out.println(p);
    	return p;
    }
    
    public String countAndSay(int n) {
    	if(n==1) {
    		return "1";
    	}
    	String res = "1";
    	for(int i = 2; i<=n; i++) {
    		StringBuilder sb = new StringBuilder();
    		for(int j=0;j< res.length();) {
    			char now = res.charAt(j);
    			int count = 0 ;
    			while(j< res.length() && res.charAt(j) == now) {
    				count++;
    				j++;
    			}
    			sb.append(count);
    			sb.append(now);
    		}
    		res = sb.toString();
    	}
    	System.out.print(res);
    	return res;
    }
    
    
    
    public void reverseWords(String sen){
    	  String[] newSen = sen.split(" ");
    	  for(int i=0; i<newSen.length; i++) {
    		  System.out.print(newSen[i]+ " ");
    	  }
    	  System.out.println();
    	  for(int j=newSen.length-1; j>=0;j--) {
    		  System.out.print(newSen[j]+ " ");
    	  }
    	  
    }
    
    public int[] spiralOrder(int[][] matrix) {
		 List<Integer> so = new ArrayList<Integer>();
    	 int last_row = matrix.length-1;
		 int last_col = matrix[0].length-1;
		 int p=0;
		 int j=0;
		 int i;
		 while(p <= last_row && j<= last_col) {
			 for(i=j;i<=last_col;i++) {
				 so.add(matrix[p][i]);
			 }
			 p++;
			 for(i=p; i<=last_row; i++) {
				 so.add(matrix[i][last_col]);
			 }
			 last_col--;
			 if(p<=last_row) {
				 for(i=last_col;i>=j;i--) {
					 so.add(matrix[last_row][i]);
				 }
				 last_row--; 
			 }
			 if(j<last_col) {
				 for(i=last_row; i>=p;i--) {
					 so.add(matrix[i][j]);
				 }
				 j++;
			 }
			    
		 }
		 int[] d = new int[so.size()];
		 for(int e=0; e<so.size(); e++) {
			 d[e]= so.get(e);	
		 }
		 System.out.print(Arrays.toString(d));
		 return d;	 
    }
    
    
    
    public String convert(String s, int numRows) {
    	 int length = s.length();
    	 int count=0;
    	 int N = numRows * 2 - 2;
    	 char[] cv = new char[length];
    	 String CV = String.valueOf(cv);
    	 for(int i=0;i<numRows;i++) {
    		 int M = N - i * 2; 
    		 for(int j=i;j<length;j=j+N) {
    			 cv[count]= s.charAt(j);
    			 count++;
    			 if(M>0 && M<N && j+M<length) {
    				 cv[count]= s.charAt(j+M);
    				 count++;
    			 }
    		 }
    	 }
    	 System.out.print(cv);
    	 return CV;
    }   
    
    
    
    
    
    
    
    
    
    
    
    public static void main(String args[]) {
	 Course course = new Course(1);
	 course.registerStudent(1);
	 course.registerStudent(6);
	 course.registerStudent(2);
	 course.registerStudent(3);
	 course.registerStudent(2);
	 course.registerStudent(4);
	 course.registerStudent(5);
	 course.registerStudent(6);
	 System.out.println(Arrays.toString(course.getStudentIds()));
     
	 course.removeDuplicates(course.getStudentIds());
	 
	 course.groupsOfStudents(course.getStudentIds());
	 
	 String sen = "the sky is blue";
	 course.reverseWords(sen);
	 System.out.println();
	 
	 int[][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
     course.spiralOrder(matrix);
     System.out.println();

     String s = "PAYPALISHIRING";
     course.convert(s, 3);
     System.out.println();
     course.convert(s, 4);
     
     System.out.println();
     course.countAndSay(5);
     System.out.println();
     System.out.println("---------------");
     System.out.println("Encapsulation is a way to protect your data from malicious modification.");
     System.out.println("For example, a book called “A”, the price of A has been defined as “B”. ");
     System.out.println("If the price is not encapsulated, when someone come to buy A, he can change the price of A to whatever value he wants. ");
     System.out.println("This will cause a very bad result. But if the price is encapsulated, he can only buy A in price B.");
     System.out.println("---------------");
     System.out.println("Encapsulation means you define the data as private and you can give the data a value or not. Then set a getter and a setter method.");
     System.out.println("If someone want to use this data, he can use the getter method to get the access on using this data.");
     System.out.println("And if someone want to set a value of this data, he needs to use setter method to change the value.");
     System.out.println("Abstraction means focus on essential things rather than details. ");
     System.out.println("For example, when we first describe an object, such as a machine, this machine can work");
     System.out.println("you don’t need to give specific details on how this machine works, whether it by using man power or wind power or electricity.");
     System.out.println("it is not important");
    
    
    
    
    
    }
}


