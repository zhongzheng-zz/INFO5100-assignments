package Q2;

public class SadObject extends MoodyObject{
     protected String getMood() {
    	 String a = "sad";
    	 return a;
     }
     
     public void expressFeelings() {
    	 System.out.println("'wah' 'boo hoo' 'weep' 'sob' 'weep'"); 
     }
     
     public String toString() {
    	 String b = "Subject cries a lot";
    	 return b;
     }
}

