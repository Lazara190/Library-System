public class Book   // implements Serializable
{
  public int isbn;
  public String title, author, object;
  public double price;

  public Book(){
      isbn = 0;
      title = "Game Of Trons";
      author = "George R.R. Martin";
      price = 17.33;
  }
 
  public Book( int isbn, String title, String author, double price){
      this.isbn = isbn;
      this.title = title;
      this.author = author;
      this.price = price;

  }

  @Override
  public String toString(){
      return "\nTitle: " + title + "\nAuthor: " + author + 
            "\nISBN: " + isbn + "\nPrice:" + price + "\n";



  }


}