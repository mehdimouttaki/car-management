package ma.resirvationcar.mycar.repository;

import ma.resirvationcar.mycar.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
    @Query("select c from Client c where "
            +"(:firstName is null or c.firstName = :firstName)"
            +" and (:lastName is null or c.lastName = :lastName)"
            +"and (:phone is null or c.phone=:phone)"
            +"and (:mail is null or c.mail=:mail)"
            +"and (:cin is null or c.cin=:cin)")
    List<Client> findClient(
                            @Param("firstName") String firstName,
                            @Param("lastName") String lastName,
                            @Param("phone") String phone,
                            @Param("mail") String mail,
                            @Param("cin") String cin);



}
