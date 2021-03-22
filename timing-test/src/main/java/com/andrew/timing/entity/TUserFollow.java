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
 * 用户关注列表
 * </p>
 *
 * @author andrew
 * @since 2021-03-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TUserFollow implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("userID")
    private Integer userid;

    @TableField("followUserID")
    private Integer followuserid;

    @TableField("postTime")
    private LocalDateTime posttime;


}
