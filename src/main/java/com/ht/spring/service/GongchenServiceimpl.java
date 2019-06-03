package com.ht.spring.service;

import com.ht.spring.Interface.GongchenUser;
import com.ht.spring.maper.PmProjectMapper;
import com.ht.spring.pojo.PmProject;
import com.ht.spring.pojo.PmProjectExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GongchenServiceimpl implements GongchenUser{
    @Autowired
    PmProjectMapper pmProjectMapper;

    @Override
    public List<PmProject> pmProjectlist() {
        PmProjectExample pmProjectExample = new PmProjectExample();
        PmProjectExample.Criteria criteria = pmProjectExample.createCriteria();
        List<PmProject> pmProjects = pmProjectMapper.selectByExample(pmProjectExample);
        return pmProjects;
    }

    @Override
    public void addPmProject(PmProject pmProject) {
        pmProjectMapper.insert(pmProject);
    }

    @Override
    public PmProject userup(Integer id) {
        PmProject pmProject = pmProjectMapper.selectByPrimaryKey(id);
        return pmProject;
    }

    @Override
    public void updatPmProject(PmProject pmProject) {
        pmProjectMapper.updateByPrimaryKeySelective(pmProject);
    }

    @Override
    public void delete(Integer id) {
        pmProjectMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PmProject loginProject(String name, String number) {
        PmProjectExample pmProjectExample = new PmProjectExample();
        PmProjectExample.Criteria criteria = pmProjectExample.createCriteria();
        criteria.andNameEqualTo(name);
        criteria.andNumberEqualTo(number);
        List<PmProject> pmProjects = pmProjectMapper.selectByExample(pmProjectExample);
        if(pmProjects.size()>0)
        {
            return pmProjects.get(0);
        }
        return null;
    }
}