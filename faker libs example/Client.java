public class Client {

    public String name;
    public String phoneNumber;

    public Client(String name,String phoneNumber ){
      this.name = name;
      this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
      return "Client [name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }

    

    
}