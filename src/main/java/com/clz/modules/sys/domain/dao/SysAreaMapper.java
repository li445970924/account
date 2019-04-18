package com.clz.modules.sys.domain.dao;

import com.clz.modules.sys.domain.beans.SysAreaExample;
import com.clz.modules.sys.domain.entity.SysArea;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysAreaMapper {
    int countByExample(SysAreaExample example);

    int deleteByExample(SysAreaExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysArea record);

    int insertSelective(SysArea record);

    List<SysArea> selectByExample(SysAreaExample example);

    SysArea selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysArea record, @Param("example") SysAreaExample example);

    int updateByExample(@Param("record") SysArea record, @Param("example") SysAreaExample example);

    int updateByPrimaryKeySelective(SysArea record);

    int updateByPrimaryKey(SysArea record);
}