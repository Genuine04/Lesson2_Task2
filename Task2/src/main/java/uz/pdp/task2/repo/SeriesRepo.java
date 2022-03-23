package uz.pdp.task2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.Series;
import uz.pdp.task2.projection.SeriesProjection;

@RepositoryRestResource(path = "series", excerptProjection = SeriesProjection.class)
public interface SeriesRepo extends JpaRepository<Series, Long> {
}
