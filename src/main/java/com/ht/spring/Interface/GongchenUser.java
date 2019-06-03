package com.ht.spring.Interface;

import com.ht.spring.pojo.PmProject;

import java.util.List;

public interface GongchenUser {
    PmProject loginProject(String name,String number);
    List<PmProject> pmProjectlist();
    void addPmProject(PmProject pmProject);
    PmProject userup(Integer id);
    void updatPmProject(PmProject pmProject);
    void delete(Integer id);
}
