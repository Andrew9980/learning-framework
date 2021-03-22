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
 * 用户动态
 * </p>
 *
 * @author andrew
 * @since 2021-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TLearningFeed implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 作者ID
     */
    @TableField("authorID")
    private Integer authorid;

    /**
     * 文字内容
     */
    private String text;

    /**
     * 类型(1.学习打卡 2.文字 3.图片 4.视频 5.网页 7.班级 8.文件 9.分享群 10.分享日记 11.学习流水账12长视频14付费live15免费live16答疑室17专辑18对讲机19群应用20视频答疑)
     */
    private Integer type;

    /**
     * 点赞数
     */
    @TableField("likeCount")
    private Integer likecount;

    /**
     * 回复数
     */
    @TableField("replyCount")
    private Integer replycount;

    /**
     * 被分享的次数
     */
    @TableField("shareCount")
    private Integer sharecount;

    /**
     * 浏览次数
     */
    @TableField("viewCount")
    private Integer viewcount;

    /**
     * 用户科目ID
     */
    @TableField("categoryID")
    private Integer categoryid;

    /**
     * 经度
     */
    private String longitude;

    /**
     * 纬度
     */
    private String latitude;

    /**
     * geohash得到的编码
     */
    private Long geohash;

    /**
     * 发表时间
     */
    @TableField("postTime")
    private LocalDateTime posttime;

    /**
     * 是否被删除
     */
    @TableField("isDelete")
    private Boolean isdelete;

    /**
     * 是否被屏蔽
     */
    @TableField("isScreened")
    private Boolean isscreened;

    /**
     * 是否是推广的
     */
    @TableField("isAd")
    private Boolean isad;

    private String source;

    /**
     * 曝光次数
     */
    @TableField("exposureCount")
    private Long exposurecount;

    /**
     * 是否已经审核
     */
    @TableField("isCheck")
    private Integer ischeck;

    /**
     * 动态日记父ID
     */
    @TableField("parentID")
    private Integer parentid;


}
