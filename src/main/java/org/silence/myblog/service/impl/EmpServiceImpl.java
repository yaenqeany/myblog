package org.silence.myblog.service.impl;

import org.silence.myblog.entity.Emp;
import org.silence.myblog.mapper.EmpMapper;
import org.silence.myblog.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Silence.Liu
 * @since 2021-03-01
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

}
