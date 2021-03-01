package org.silence.myblog.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableName;
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
@TableName("SALGRADE")
public class Salgrade implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableField("GRADE")
    private BigDecimal grade;

    @TableField("LOSAL")
    private BigDecimal losal;

    @TableField("HISAL")
    private BigDecimal hisal;


}
