package ma.resirvationcar.mycar.repository;

import ma.resirvationcar.mycar.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {


}
