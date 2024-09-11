public class Library_System 
{
    /**
     * this is the main method  of my program 
     * @pram - array of String args from th console
     */
    public static void main(String [] arg){
        AuthorInfo a1 = new AuthorInfo("carlos", "this@this.com", "German");
        Book b1 = new Book();
        System.out.println(a1);
        System.out.println(b1);
    }
}