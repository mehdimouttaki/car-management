package ma.resirvationcar.mycar.service;


import ma.resirvationcar.mycar.entity.Client;
import ma.resirvationcar.mycar.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private  ClientRepository clientRepository;

    public Client add(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> afficher() {
        return clientRepository.findAll();
    }

   /* public List<Client> search(String client) {
        return clientRepository.findClient(client);
    }*/
}
