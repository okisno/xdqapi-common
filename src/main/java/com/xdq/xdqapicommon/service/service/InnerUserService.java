package com.xdq.xdqapicommon.service.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xdq.xdqapicommon.service.model.entity.User;

/**
 * 用户服务
 *
 * @author xdq
 * 
 */
public interface InnerUserService{

    /**
     * 数据库中查询是否已分配给用户密钥（accessKey）
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
