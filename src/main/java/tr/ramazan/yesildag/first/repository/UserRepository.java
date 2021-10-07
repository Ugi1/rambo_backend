package tr.ramazan.yesildag.first.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tr.ramazan.yesildag.first.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
