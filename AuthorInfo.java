public class AuthorInfo{

    protected String name; 
    protected String email;
    protected String nationality;

    public AuthorInfo() {}

    public AuthorInfo(String name){
        this.name = name;
    }
    
    public AuthorInfo(String name, String email, String nationality){
        this.name = name;
        this.email = email;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    } 

    public String getNationality() {
        return nationality;
    }
    
    
    @Override
    public String toString(){
      return "\nName: " + name + "\nemail: " + email + 
            "\nnationality: " + nationality;



    }
}