package org.silence.myblog.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
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
@TableName("EMP")
public class Emp implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId("EMPNO")
    private Integer empno;

    @TableField("ENAME")
    private String ename;

    @TableField("JOB")
    private String job;

    @TableField("MGR")
    private Integer mgr;

    @TableField("HIREDATE")
    private LocalDateTime hiredate;

    @TableField("SAL")
    private BigDecimal sal;

    @TableField("COMM")
    private BigDecimal comm;

    @TableField("DEPTNO")
    private Integer deptno;


}
