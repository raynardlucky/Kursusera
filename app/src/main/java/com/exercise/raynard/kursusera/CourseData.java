package com.exercise.raynard.kursusera;

public class CourseData {
    int courseImage;
    String courseTitle;
    String courseDesc;

    public CourseData(int courseImage, String courseTitle, String courseDesc) {
        this.courseImage = courseImage;
        this.courseTitle = courseTitle;
        this.courseDesc = courseDesc;
    }

    public int getCourseImage() {
        return courseImage;
    }

    public void setImage(int courseImage) {
        this.courseImage = courseImage;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
}
