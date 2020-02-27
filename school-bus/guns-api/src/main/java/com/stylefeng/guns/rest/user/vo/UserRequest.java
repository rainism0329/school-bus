/**
 * @program school-bus
 * @description: UserRequest
 * @author: mf
 * @create: 2020/02/24 16:26
 */

package com.stylefeng.guns.rest.user.vo;

import com.stylefeng.guns.rest.common.AbstractRequest;
import lombok.Data;


@Data
public class UserRequest extends AbstractRequest {

    private Integer id; // 通过id找

    private String userName;

    private String passPwd;

}
