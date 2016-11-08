package com.medicalsystem.mapper;

import com.medicalsystem.pojo.TCost;
import com.medicalsystem.pojo.TCostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCostMapper {
    int countByExample(TCostExample example);

    int deleteByExample(TCostExample example);

    int deleteByPrimaryKey(Long costId);

    int insert(TCost record);

    int insertSelective(TCost record);

    List<TCost> selectByExample(TCostExample example);

    TCost selectByPrimaryKey(Long costId);

    int updateByExampleSelective(@Param("record") TCost record, @Param("example") TCostExample example);

    int updateByExample(@Param("record") TCost record, @Param("example") TCostExample example);

    int updateByPrimaryKeySelective(TCost record);

    int updateByPrimaryKey(TCost record);
}