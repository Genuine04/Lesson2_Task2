package uz.pdp.task2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Car;
import uz.pdp.task2.projection.CarProjection;

@RepositoryRestResource(path = "car", excerptProjection = CarProjection.class)
public interface CarRepo extends JpaRepository<Car, Long> {
}
