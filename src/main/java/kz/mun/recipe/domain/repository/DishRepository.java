package kz.mun.recipe.domain.repository;

import kz.mun.recipe.domain.models.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface DishRepository extends JpaRepository<Dish, Long> {
}
