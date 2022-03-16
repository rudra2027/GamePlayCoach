package jwtsecurity.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import jwtsecurity.model.ERole;
import jwtsecurity.model.Role;

public interface RoleRepository extends MongoRepository<Role, String> {
	  Optional<Role> findByName(ERole name);
	}
