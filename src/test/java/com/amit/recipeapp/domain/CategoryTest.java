package com.amit.recipeapp.domain;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    static Category category;

    @BeforeAll
    public static void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        Long idVal = 4L;

        category.setId(idVal);

        assertEquals(idVal, category.getId());
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}