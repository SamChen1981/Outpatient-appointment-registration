package com.medicalsystem.mapper;

import com.medicalsystem.pojo.TDoctor;
import com.medicalsystem.pojo.TDoctorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDoctorMapper {
    int countByExample(TDoctorExample example);

    int deleteByExample(TDoctorExample example);

    int deleteByPrimaryKey(Long doctorId);

    int insert(TDoctor record);

    int insertSelective(TDoctor record);

    List<TDoctor> selectByExample(TDoctorExample example);

    TDoctor selectByPrimaryKey(Long doctorId);

    int updateByExampleSelective(@Param("record") TDoctor record, @Param("example") TDoctorExample example);

    int updateByExample(@Param("record") TDoctor record, @Param("example") TDoctorExample example);

    int updateByPrimaryKeySelective(TDoctor record);

    int updateByPrimaryKey(TDoctor record);
}