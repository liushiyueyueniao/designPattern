package com.geely.design.principle.singleresponsibility;

/**
 * Created by geely
 */
public interface ICourse {
    /**
     *
     * 获取课程信息的职责
     */
    String getCourseName();
    byte[] getCourseVideo();

    /**
     * 管理课程的职责
     */

    void studyCourse();
    void refundCourse();

}
