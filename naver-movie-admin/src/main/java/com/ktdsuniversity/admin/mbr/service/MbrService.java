package com.ktdsuniversity.admin.mbr.service;

import java.util.List;

import org.springframework.ui.Model;

import com.ktdsuniversity.admin.mbr.vo.MbrVO;
import com.ktdsuniversity.admin.mbrlgnhist.vo.MbrLgnHistVO;

public interface MbrService {

	public MbrVO readOneMbrByIdAndPwd(MbrVO mbrVO);
	
	public List<MbrVO> readAllAdminMbr();
	
	public boolean createNewAdminMbr(MbrVO mbrVO);
	public boolean createLogoutHistory(MbrLgnHistVO hist);
	
	public boolean updateOneAdmminMbr(MbrVO mbrVO);
	public boolean deleteOneAdminMbr(String mbrId);
	
	public int readCountMbrById(String mbrId);
}
