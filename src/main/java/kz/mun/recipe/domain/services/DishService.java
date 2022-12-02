package kz.mun.recipe.domain.services;

import kz.mun.recipe.domain.models.Dish;

import java.util.List;

public interface DishService {
    List<Dish> getAllDishes();
}
