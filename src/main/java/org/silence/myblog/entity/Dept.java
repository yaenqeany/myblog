package org.silence.myblog.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author Silence.Liu
 * @since 2021-03-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("DEPT")
public class Dept implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("DEPTNO")
    private Integer deptno;

    @TableField("DNAME")
    private String dname;

    @TableField("LOC")
    private String loc;


}
