package uz.pdp.task2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.DealTank;
import uz.pdp.task2.projection.DealTankProjection;

@RepositoryRestResource(path = "dealTank", excerptProjection = DealTankProjection.class)
public interface DealTankRepo extends JpaRepository<DealTank, Long> {
}
