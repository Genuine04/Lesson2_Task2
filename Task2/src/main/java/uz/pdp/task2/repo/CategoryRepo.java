package uz.pdp.task2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Category;
import uz.pdp.task2.projection.CategoryProjection;

@RepositoryRestResource(path = "category", excerptProjection = CategoryProjection.class)
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
