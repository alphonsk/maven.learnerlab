package com.github.curriculeon;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    /*
Create a testTeach method that ensures when an Instructor invokes the teach method,
a respective student's totalStudyTime instance variable is incremented by the specified numberOfHours.
Create a testLecture method that ensures when an Instructor invokes the lecture method,
a respective array of students' totalStudyTime instance variables is incremented by numberOfHours/students.length.

     */
    // given
    private void testLecture(){
      Instructor instructor = new Instructor(1,"quan");

      // when
        instructor.lecture(Learner);

    }


    // given
    private void testTeach() {
        Learner learner = null; // "quan";
        Instructor instructor = new Instructor(1, "quan");
        double numberOfHours = 0;
        double preStudyTime = learner.getTotalStudyTime();
        double expectedStudyTime = preStudyTime + numberOfHours;


        // when
        instructor.teach(learner, numberOfHours);
        double postStudyTime = learner.getTotalStudyTime();


        // then
        Assert.assertEquals(postStudyTime, expectedStudyTime, 0);
    }


    @Test
    // given
    public void testInstanceOf() {
        Instructor instructor = new Instructor(1, "quan");

        // then
        Assert.assertTrue(instructor instanceof Teacher);
        Assert.assertTrue(instructor instanceof Person);
    }



    @Test
    public void test(){

    }


}
