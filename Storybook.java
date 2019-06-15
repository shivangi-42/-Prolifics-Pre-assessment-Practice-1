package building;
import library.Book;
 class story{
	
	Book aa=new Book();
	story(){
	aa.author="shivangi";
	 System.out.println(aa.author);
	}
}
public class Storybook extends Book {
  
   Storybook(){
	   
	   
	   System.out.println(author);
   }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(new story());
		 System.out.println(new Storybook());
	}

}
