package com.lld.im.service.user.model.resp;

import com.lld.im.service.user.dao.ImUserDataEntity;
import lombok.Data;

import java.util.List;

/**
 * @author: Chackylee
 * @description:
 **/
@Data
public class GetUserInfoResp {

    private List<ImUserDataEntity> userDataItem;//用户信息

    private List<String> failUser;// 未找到的用户


}
