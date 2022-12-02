package kz.mun.recipe.rest.controllers;

import kz.mun.recipe.domain.models.Dish;
import kz.mun.recipe.domain.services.DishService;
import kz.mun.recipe.rest.Constants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(Constants.API_BASE + "/v1/dish")
@RequiredArgsConstructor
public class DishController {
    private final DishService dishService;

    @GetMapping(value = "/list")
    public List<Dish> getDishList() {
        return dishService.getAllDishes();
    }
}
