package uz.pdp.task2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.User;
import uz.pdp.task2.projection.UserProjection;

@RepositoryRestResource(path = "user", excerptProjection = UserProjection.class)
public interface UserRepo extends JpaRepository<User, Long> {
}
