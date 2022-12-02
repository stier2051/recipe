package kz.mun.recipe.domain.services.impl;

import kz.mun.recipe.domain.models.Dish;
import kz.mun.recipe.domain.repository.DishRepository;
import kz.mun.recipe.domain.services.DishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DishServiceImpl implements DishService {
    private final DishRepository dishRepository;

    @Override
    public List<Dish> getAllDishes() {
        return dishRepository.findAll();
    }
}
