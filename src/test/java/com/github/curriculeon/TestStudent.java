package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

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
        double numberOfHoursToLearn = 101 ;
        double currentStudyTime = student.getTotalStudyTime();
        double expectedStudyTime = currentStudyTime + numberOfHoursToLearn;

        // when
        student.learn(numberOfHoursToLearn);
        double incrementedStudyTime = student.getTotalStudyTime();

        // then
        Assert.assertEquals(incrementedStudyTime, expectedStudyTime, 0);

    }

    @Test
    public void instanceofTest() {
        testInstanceOf() ;
    }

    @Test
    public void testLearnTest() {
        testLearn() ;
    }



}