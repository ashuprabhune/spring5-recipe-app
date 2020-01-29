package ashish.springframework.spring5recipeapp.services;


import ashish.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface RecipeService {
    Set<Recipe> getRecipes();
}
