//package healthycoderapp;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class BMICalculatorTest {
//
//    @Test
//    void fixMe(){
//        assertTrue(true);
//    }
//
//}



package healthycoderapp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {


    @BeforeEach
    void beforeEach()
    {
        System.out.println("Hello From BeforeEach");
    }
    @BeforeAll
    static void beforeAll(){
        System.out.println("Hello");
    }


    @Test
    void shouldReturnTrueWhenDietRecommeneded(){

        //Given
        double weight=80;
        double height=1.72;

//    when

        boolean recommended = BMICalculator.isDietRecommended(weight,height);

//    then
        assertTrue(recommended);

    }

    @Test
    void shouldReturnFalseWhenDietNotRecommended(){

        //Given
        double weight=80;
        double height=1.80;

//    when

        boolean recommended = BMICalculator.isDietRecommended(weight,height);

//    then
        assertFalse(recommended);

    }


    @Test
    void shouldThrowAruthmeticExceptionWhenHeightIsZero(){

        //Given
        double weight=80.0;
        double height=0.0;

//    when

        Executable executable =()->  BMICalculator.isDietRecommended(weight, height);


//    then
        assertThrows(ArithmeticException.class,executable);

    }






    @Test
    void shouldReturnCoderWithWorstBmiWhenCoderListIsNotEmpty()
    {

        //Given
        List<Coder> coders = new ArrayList<Coder>();

        coders.add(new Coder(1.80,60.0));
        coders.add(new Coder(1.82,98.0));
        coders.add(new Coder(1.82,64.7));

        //When

        Coder coderWithWorstBmi=BMICalculator.findCoderWithWorstBMI(coders);

//        then
        assertAll(
                ()->assertEquals(1.82,coderWithWorstBmi.getHeight()),
                ()->assertEquals(98.0,coderWithWorstBmi.getWeight())
        );





    }



    @Test
    void shouldReturnNullCoderWithWorstBmiWhenCoderListIsEmpty()
    {

        //Given
        List<Coder> coders = new ArrayList<Coder>();


        //When

        Coder coderWithWorstBmi=BMICalculator.findCoderWithWorstBMI(coders);

//        then

        assertNull(coderWithWorstBmi);




    }




    @Test
    void shouldReturnBmiScoreArray(){


        List<Coder> coders = new ArrayList<Coder>();

        coders.add(new Coder(1.80,60.0));
        coders.add(new Coder(1.82,98.0));
        coders.add(new Coder(1.82,64.7));

        double[] expected = {18.52,29.59,19.53};


        double[] bmiscores = BMICalculator.getBMIScores(coders);

        assertArrayEquals(expected,bmiscores);




    }


}

