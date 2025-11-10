package com.xdq.xdqapicommon.service.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.xdq.xdqapicommon.service.model.entity.UserInterfaceInfo;

/**
* @author xdq
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2025-10-30 17:04:07
*/
public interface InnerUserInterfaceInfoService{
    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
