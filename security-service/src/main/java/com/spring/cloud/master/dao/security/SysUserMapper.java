package com.spring.cloud.master.dao.security;
import com.spring.cloud.master.entity.security.SysUser;
import java.util.List;
import java.util.Map;

/**
 * @author zengfeiyue
 */
public interface SysUserMapper {

	List<SysUser> getByMap(Map<String, Object> map);
	SysUser getById(Integer id);
	Integer create(SysUser sysUser);
	int update(SysUser sysUser);
	SysUser getByUserName(String userName);
}