package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.entity.Beverage;
@Repository
public interface BeverageRepository extends JpaRepository <Beverage, Integer> {

}
