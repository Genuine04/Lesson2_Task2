package uz.pdp.task2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.task2.entity.SellerType;
import uz.pdp.task2.projection.SellerTypeProjection;

@RepositoryRestResource(path = "sellerType", excerptProjection = SellerTypeProjection.class)
public interface SellerTypeRepo extends JpaRepository<SellerType, Long> {
}
