package com.hf.usercenter.mapper;

import com.hf.usercenter.model.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author asus
* @description 针对表【user(用户)】的数据库操作Mapper
* @createDate 2022-10-12 19:52:37
* @Entity com.hf.usercenter.model.domain.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




