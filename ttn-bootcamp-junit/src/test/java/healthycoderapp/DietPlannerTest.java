//package healthycoderapp;
//
//class DietPlannerTest {
//
//}



package healthycoderapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)
class DietPlannerTest {


    private DietPlanner dietPlanner;


    @AfterEach
    void afterEach(){
        System.out.println("Hello");
    }
    @BeforeEach
    void setup()
    {
        this.dietPlanner = new DietPlanner(20,30,50);
    }


    @Test
    void shouldReturnCorrectDietPlanWhenCorrectCoder(){
        //given

        Coder coder = new Coder(1.82,75.0,26,Gender.MALE);
        DietPlan expected = new DietPlan(2202,110,73,275);
        //when

        DietPlan actual = dietPlanner.calculateDiet(coder);


        //then
        assertAll(

                ()->assertEquals(expected.getCalories(),actual.getCalories()),
                ()->assertEquals(expected.getCarbohydrate(),actual.getCarbohydrate()),
                ()->assertEquals(expected.getFat(),actual.getFat()),
                ()->assertEquals(expected.getProtein(),actual.getProtein()));


    }




}

