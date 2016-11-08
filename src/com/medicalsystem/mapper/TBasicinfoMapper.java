package com.medicalsystem.mapper;

import com.medicalsystem.pojo.TBasicinfo;
import com.medicalsystem.pojo.TBasicinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TBasicinfoMapper {
    int countByExample(TBasicinfoExample example);

    int deleteByExample(TBasicinfoExample example);

    int deleteByPrimaryKey(Long basicId);

    int insert(TBasicinfo record);

    int insertSelective(TBasicinfo record);

    List<TBasicinfo> selectByExampleWithBLOBs(TBasicinfoExample example);

    List<TBasicinfo> selectByExample(TBasicinfoExample example);

    TBasicinfo selectByPrimaryKey(Long basicId);

    int updateByExampleSelective(@Param("record") TBasicinfo record, @Param("example") TBasicinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TBasicinfo record, @Param("example") TBasicinfoExample example);

    int updateByExample(@Param("record") TBasicinfo record, @Param("example") TBasicinfoExample example);

    int updateByPrimaryKeySelective(TBasicinfo record);

    int updateByPrimaryKeyWithBLOBs(TBasicinfo record);

    int updateByPrimaryKey(TBasicinfo record);
}