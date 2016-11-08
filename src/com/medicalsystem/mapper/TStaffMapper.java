package com.medicalsystem.mapper;

import com.medicalsystem.pojo.TStaff;
import com.medicalsystem.pojo.TStaffExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TStaffMapper {
    int countByExample(TStaffExample example);

    int deleteByExample(TStaffExample example);

    int deleteByPrimaryKey(Long staffId);

    int insert(TStaff record);

    int insertSelective(TStaff record);

    List<TStaff> selectByExample(TStaffExample example);

    TStaff selectByPrimaryKey(Long staffId);

    int updateByExampleSelective(@Param("record") TStaff record, @Param("example") TStaffExample example);

    int updateByExample(@Param("record") TStaff record, @Param("example") TStaffExample example);

    int updateByPrimaryKeySelective(TStaff record);

    int updateByPrimaryKey(TStaff record);
}