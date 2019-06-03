package com.ht.spring.maper;

import java.util.List;

import com.ht.spring.pojo.PmProject;
import com.ht.spring.pojo.PmProjectExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PmProjectMapper {
    int countByExample(PmProjectExample example);

    int deleteByExample(PmProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmProject record);

    int insertSelective(PmProject record);

    List<PmProject> selectByExample(PmProjectExample example);

    PmProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmProject record, @Param("example") PmProjectExample example);

    int updateByExample(@Param("record") PmProject record, @Param("example") PmProjectExample example);

    int updateByPrimaryKeySelective(PmProject record);

    int updateByPrimaryKey(PmProject record);
}