package com.imooc.delivery.controller;

import com.imooc.delivery.config.GitAutoRefreshConfig;
import com.imooc.delivery.config.GitConfig;
import com.imooc.delivery.dao.AdUserMapper;
import com.imooc.delivery.model.po.AdUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testboot")
public class TestBootController {

	@Autowired
	private GitConfig gitConfig;

	@Autowired
	private GitAutoRefreshConfig gitAutoRefreshConfig;

	@Resource
	private AdUserMapper adUserMapper;

	@RequestMapping("getuser")
	public AdUser getUser() {
		return adUserMapper.selectByPrimaryKey(1);
	}

	@RequestMapping("gitAutoRefreshConfig")
	public GitAutoRefreshConfig getGitAutoRefreshConfig() {
		return gitAutoRefreshConfig;
	}

	@RequestMapping("getConfig")
	public GitConfig getGitConfig() {
		return gitConfig;
	}
}