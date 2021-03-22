package com.andrew.timing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 用户表 
 * </p>
 *
 * @author andrew
 * @since 2021-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户手机号码
     */
    private String phone;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 用户密码干扰字符
     */
    private String salt;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 性别，1.男 2.女
     */
    private Integer gender;

    /**
     * 头像ID
     */
    @TableField("avatarID")
    private Integer avatarid;

    /**
     * 注册时间
     */
    @TableField("regTime")
    private LocalDateTime regtime;

    /**
     * 密码是否充值
     */
    @TableField("isPwdReset")
    private Boolean ispwdreset;

    /**
     * 动态码
     */
    @TableField("dynamicKey")
    private String dynamickey;

    /**
     * 用户是否被禁
     */
    private Boolean disabled;

    private Boolean ext;

    /**
     * 出生日期
     */
    private LocalDateTime birthday;

    private String identity;

    @TableField("identityType")
    private Boolean identitytype;

    /**
     * 工作地或学校
     */
    private String department;

    /**
     * 结伴信息是否已设置
     */
    @TableField("isMakeFriendInfoSet")
    private Boolean ismakefriendinfoset;

    /**
     * 照片数量
     */
    @TableField("photoCount")
    private Integer photocount;

    /**
     * 照片数量
     */
    @TableField("learningCategoryCount")
    private Integer learningcategorycount;

    /**
     * 第一张照片ID
     */
    @TableField("firstPhotoID")
    private Integer firstphotoid;

    /**
     * 是否结伴勿扰
     */
    @TableField("noDisturb")
    private Boolean nodisturb;

    /**
     * 是否官方用户
     */
    @TableField("isOfficial")
    private Boolean isofficial;

    private String type;

    @TableField("categoryName")
    private String categoryname;

    @TableField("categoryID")
    private Integer categoryid;

    @TableField("avatarFile")
    private String avatarfile;

    /**
     * 关注用户数
     */
    @TableField("followUserCount")
    private Integer followusercount;

    /**
     * 用户粉丝数
     */
    @TableField("fansCount")
    private Integer fanscount;

    /**
     * 学习标签
     */
    @TableField("categoryIDs")
    private String categoryids;

    /**
     * 账号类型 0. timing自己的账号 1.猩猩点灯注册的账号2小程序注册
     */
    @TableField("accountType")
    private Boolean accounttype;

    /**
     * TimingID
     */
    @TableField("timingID")
    private String timingid;


}
