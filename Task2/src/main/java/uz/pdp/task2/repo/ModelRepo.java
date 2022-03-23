package uz.pdp.task2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Model;
import uz.pdp.task2.projection.ModelProjection;

@RepositoryRestResource(path = "model", excerptProjection = ModelProjection.class)
public interface ModelRepo extends JpaRepository<Model, Long> {
}
