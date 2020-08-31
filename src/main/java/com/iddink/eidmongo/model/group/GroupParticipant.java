package com.iddink.eidmongo.model.group;

import com.iddink.eidmongo.model.student.Student;

public class GroupParticipant {

    private Group group;

    private Student student;

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
