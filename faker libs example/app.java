import java.util.ArrayList;
import java.util.List;
import com.github.javafaker.Faker;



public class app {

    public static void main(String[] args) {
        
        List<Client> clients = new ArrayList<>();
        Faker faker = new Faker();

        for (int i =0 ;  i <5 ; i++){
            clients.add( new Client(faker.funnyName().name(),faker.number().phoneNumber()));
        }

        for (Client client : clients) {
            System.out.println(client);
        }
       
        
    }
}