package com.zs.dao;

import com.zs.entity.SimManager;
import com.zs.entity.SimManagerExample;
import com.zs.entity.other.EasyUIAccept;

import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SimManagerMapper {
    int countByExample(SimManagerExample example);

    int deleteByExample(SimManagerExample example);

    int deleteByPrimaryKey(BigDecimal id);

    int insert(SimManager record);

    int insertSelective(SimManager record);

    List<SimManager> selectByExample(SimManagerExample example);

    SimManager selectByPrimaryKey(BigDecimal id);

    int updateByExampleSelective(@Param("record") SimManager record, @Param("example") SimManagerExample example);

    int updateByExample(@Param("record") SimManager record, @Param("example") SimManagerExample example);

    int updateByPrimaryKeySelective(SimManager record);

    int updateByPrimaryKey(SimManager record);
    
    //
    List<SimManager> queryFenye(EasyUIAccept accept);
    
    int getCount(EasyUIAccept accept);
}