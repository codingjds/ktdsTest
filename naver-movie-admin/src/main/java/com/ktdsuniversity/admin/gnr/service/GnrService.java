package com.ktdsuniversity.admin.gnr.service;

import java.util.List;

import com.ktdsuniversity.admin.gnr.vo.GnrVO;

public interface GnrService {

	public List<GnrVO> readAllGnrVO(GnrVO gnrVO);
	public List<GnrVO> readAllGnrVONopagination(String gnrNm);

	
	public boolean createOneGnr(GnrVO gnrVO);
	
	public boolean updateOneGnr(GnrVO gnrVO);
	
	public boolean deleteOneGnrByGnrId(int GnrId);
	
	public boolean deleteGnrBySelectedGnrId(List<Integer> gnrId);
	
}
