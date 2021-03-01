package org.silence.myblog.service.impl;

import org.silence.myblog.entity.Dept;
import org.silence.myblog.mapper.DeptMapper;
import org.silence.myblog.service.IDeptService;
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
public class DeptServiceImpl extends ServiceImpl<DeptMapper, Dept> implements IDeptService {

}
