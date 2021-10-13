package ma.resirvationcar.mycar.controller;


import ma.resirvationcar.mycar.entity.Client;
import ma.resirvationcar.mycar.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ClientController {
    @Autowired
    private  ClientService clientService;
    @PostMapping(path = "clients")
    public ResponseEntity<Client> add(@RequestBody Client client) {
        clientService.add(client);
        if (client == null) {
            throw new RuntimeException();
        } else {
            return new ResponseEntity<>(client, HttpStatus.CREATED);
        }
    }

    @GetMapping(path = "clients")
    public List<Client> findAll(){
        return clientService.afficher();
    }
  /*  @GetMapping(path = "clients/{client}")
    public List<Client> search(@PathVariable String client){
        return clientService.search(client);
    }*/
}
