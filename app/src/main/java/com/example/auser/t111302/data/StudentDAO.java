package com.example.auser.t111302.data;

/**
 * Created by yvtc on 2017/11/13.
 */

public interface StudentDAO {
    void add(Student s);
    Student[] getData();
    void update(Student s);
}
