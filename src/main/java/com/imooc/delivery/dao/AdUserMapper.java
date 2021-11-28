package com.imooc.delivery.dao;

import com.imooc.delivery.model.po.AdUser;
import com.imooc.delivery.model.po.AdUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdUserMapper {
    long countByExample(AdUserExample example);

    int deleteByExample(AdUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdUser record);

    int insertSelective(AdUser record);

    List<AdUser> selectByExample(AdUserExample example);

    AdUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdUser record, @Param("example") AdUserExample example);

    int updateByExample(@Param("record") AdUser record, @Param("example") AdUserExample example);

    int updateByPrimaryKeySelective(AdUser record);

    int updateByPrimaryKey(AdUser record);
}