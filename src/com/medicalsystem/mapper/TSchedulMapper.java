package com.medicalsystem.mapper;

import com.medicalsystem.pojo.TSchedul;
import com.medicalsystem.pojo.TSchedulExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSchedulMapper {
    int countByExample(TSchedulExample example);

    int deleteByExample(TSchedulExample example);

    int deleteByPrimaryKey(Long schedulId);

    int insert(TSchedul record);

    int insertSelective(TSchedul record);

    List<TSchedul> selectByExample(TSchedulExample example);

    TSchedul selectByPrimaryKey(Long schedulId);

    int updateByExampleSelective(@Param("record") TSchedul record, @Param("example") TSchedulExample example);

    int updateByExample(@Param("record") TSchedul record, @Param("example") TSchedulExample example);

    int updateByPrimaryKeySelective(TSchedul record);

    int updateByPrimaryKey(TSchedul record);
}