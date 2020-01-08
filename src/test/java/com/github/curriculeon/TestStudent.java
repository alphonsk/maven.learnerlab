package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {
    /*


Create a testLearn method that ensures a Student's totalStudyTime instance variable is incremented by the specified numberOfHours by invoking the .learn method.
     */


    //given
    private void testInstanceOf() {
        Student student = new Student(1, "quan");

        // then
        Assert.assertTrue( student instanceof Person);
        Assert.assertTrue( student instanceof Learner);
    }

    //given
    private void testLearn ( ) {
        Student student = new Student(1, "quan");

        // when
        double currentStudyTime = student.getTotalStudyTime();
        student.learn(10);
        double incrementedStudyTime = student.getTotalStudyTime();
        double expectedStudyTime = currentStudyTime + 10;

        // then
        Assert.assertEquals(expectedStudyTime, );

    }

    @Test
    public void instanceofTest() {
        testInstanceOf() ;
    }



}