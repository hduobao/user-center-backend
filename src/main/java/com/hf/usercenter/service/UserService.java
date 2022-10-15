package com.hf.usercenter.service;

import com.hf.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
* @author asus
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2022-10-12 19:52:37
*/
public interface UserService extends IService<User> {

    /**
     *
     * @param userAccount 账户
     * @param userPassword 密码
     * @param checkPassword 校验密码
     * @param planetCode 星球编号
     * @return 新用户id
     */


    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);

    /**
     *
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @return User
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 请求用户注销
     * @param request
     * @return
     */
    Integer userLogout(HttpServletRequest request);
}
