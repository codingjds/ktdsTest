package com.ktdsuniversity.admin.prdcprtcptnppl.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ktdsuniversity.admin.prdcprtcptnppl.vo.PrdcPrtcptnPplVO;

@Repository
public class PrdcPrtcptnPplDAOImpl extends SqlSessionDaoSupport implements PrdcPrtcptnPplDAO{
	
	@Autowired
	@Override
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		super.setSqlSessionTemplate(sqlSessionTemplate);
	}

	@Override
	public int createNewPrdcPrtcptnPpl(PrdcPrtcptnPplVO prdcPrtcptnPplVO) {
		return getSqlSession().insert("PrdcPrtcptnPpl.createNewPrdcPrtcptnPpl", prdcPrtcptnPplVO);
	}

	@Override
	public int deleteNewPrdcPrtcptnPplByprdcPrtcptnPplId(String prdcPrtcptnId) {
		return getSqlSession().update("PrdcPrtcptnPpl.deleteNewPrdcPrtcptnPpl", prdcPrtcptnId);
	}
	
}
