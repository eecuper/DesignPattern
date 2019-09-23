package com.geely.design.pattern.creational.builder;

public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArtical(String courseArtical);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();
}
