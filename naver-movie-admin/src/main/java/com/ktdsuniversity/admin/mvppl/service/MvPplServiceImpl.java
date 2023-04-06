package com.ktdsuniversity.admin.mvppl.service;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.ktdsuniversity.admin.common.api.exceptions.ApiException;
import com.ktdsuniversity.admin.mvppl.dao.MvPplDAO;
import com.ktdsuniversity.admin.mvppl.vo.MvPplVO;

@Service
public class MvPplServiceImpl implements MvPplService{
	
	private static final Logger logger = LoggerFactory.getLogger(MvPplServiceImpl.class);
	
	
	@Value("${upload.profile.path=C:/naver-movie-admin/files/profiles}")
	private String profilePath;
	
	@Autowired
	private MvPplDAO mvPplDAO;
	
	@Override
	public List<MvPplVO> readAllMvPplVO(MvPplVO mvPplVO) {
		
		// TODO 
		// Calendar 
		// startDt가 비어있을 경우, 현재일의 한달 전 날짜를 가져와서 세팅한다.
		if(mvPplVO.getStartDt() == null || mvPplVO.getStartDt().length() == 0) {
			Calendar cal = Calendar.getInstance();
			// 한달 전꺼부터 조회하기위해 시작월을 한달 당김
			cal.add(Calendar.MONTH, -1);
			// 연도
			int year = cal.get(Calendar.YEAR);
			// 월
			int month = cal.get(Calendar.MONTH ) + 1; // Calendar MONTH는 0 ~ 11 이기에 +1해줘야한다
			// 일
			int day = cal.get(Calendar.DAY_OF_MONTH);
			
			// 2023-04-04 (원하는것) -> 2023-4-4 (int 숫자라서 이렇게 나옴)
			// 4 -> 04  , 10 -> 10
			String strMonth = month < 10 ? "0" + month : month + "";
			String strDay = day < 10 ? "0" + day : day + "";
			
			String startDt = year + "-" + strMonth + "-" + strDay;
			mvPplVO.setStartDt(startDt);
			
		}
		// endDt가 비어있을 경우, 현재일을 가져와서 세팅한다.
		if(mvPplVO.getEndDt() == null || mvPplVO.getEndDt().length() == 0) {
			Calendar cal = Calendar.getInstance();
			// 연도
			int year = cal.get(Calendar.YEAR);
			// 월
			int month = cal.get(Calendar.MONTH ) + 1; // Calendar MONTH는 0 ~ 11 이기에 +1해줘야한다
			// 일
			int day = cal.get(Calendar.DAY_OF_MONTH);
			
			// 2023-04-04 (원하는것) -> 2023-4-4 (int 숫자라서 이렇게 나옴)
			// 4 -> 04  , 10 -> 10
			String strMonth = month < 10 ? "0" + month : month + "";
			String strDay = day < 10 ? "0" + day : day + "";
			
			String endDt = year + "-" + strMonth + "-" + strDay;
			mvPplVO.setEndDt(endDt);
		}
		
		// 자바에서 시간을 관리하는 두가지 방법
		// Calendar--쓰기 어려워서 보통 유틸로 만들어놓음 
		// Jodatime 1.8부터 나옴 , 요다타임 , 메모리 매우 많이 먹음
		
		return mvPplDAO.readAllMvPplVO(mvPplVO);
	}

	@Override
	public boolean createOneMvPpl(MvPplVO mvPplVO, MultipartFile uploadFile) {
		
		
		if(uploadFile != null && !uploadFile.isEmpty()) {
			
			File dir = new File(profilePath);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			String uuidFileName = UUID.randomUUID().toString();
			File profileFile = new File(dir, uuidFileName);
			
			try {
				uploadFile.transferTo(profileFile);
			} catch (IllegalStateException | IOException e) {
				logger.error(e.getMessage(), e);
			}
			
			mvPplVO.setPrflPctr(uuidFileName);
		}
		
		return mvPplDAO.createOneMvPpl(mvPplVO) > 0;
	}

	@Override
	public boolean updateOneMvPplByMvPplId(MvPplVO mvPplVO, MultipartFile uploadFile) {
		
		if(uploadFile != null && !uploadFile.isEmpty()) {
			
			File dir = new File(profilePath);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			String uuidFileName = UUID.randomUUID().toString();
			File profileFile = new File(dir, uuidFileName);
			
			try {
				uploadFile.transferTo(profileFile);
			} catch (IllegalStateException | IOException e) {
				logger.error(e.getMessage(), e);
			}
			
			mvPplVO.setPrflPctr(uuidFileName);
		}
		
		boolean isModify = false;
		MvPplVO originalMvPplData = mvPplDAO.readOneMvPplVOByMvPplId(mvPplVO.getMvPplId());
		
		MvPplVO updateMvPplVO = new MvPplVO();
		updateMvPplVO.setMdfyr(mvPplVO.getMdfyr());
		updateMvPplVO.setMvPplId(mvPplVO.getMvPplId());
		updateMvPplVO.setRlNm(mvPplVO.getRlNm());
		
		if( (mvPplVO.getPrflPctr() == null || mvPplVO.getPrflPctr().length() == 0) 
				&& mvPplVO.getIsDeletePctr().equals("N")) {
			updateMvPplVO.setPrflPctr(originalMvPplData.getPrflPctr());
		}
		else {
			isModify = true;
			updateMvPplVO.setPrflPctr(mvPplVO.getPrflPctr());
		}
		
		if(!originalMvPplData.getNm().equals(mvPplVO.getNm())) {
			isModify = true;
			updateMvPplVO.setNm(mvPplVO.getNm());
		}
		
		String rlNm = originalMvPplData.getRlNm();
		if(rlNm == null) {
			rlNm = "";
		}
		
		if(!rlNm.equals(mvPplVO.getRlNm())) {
			isModify = true;
		}
		
		String requestUseYn = mvPplVO.getUseYn() == null || mvPplVO.getUseYn().length() == 0 ? "N" : mvPplVO.getUseYn() ;
		
		if(!originalMvPplData.getUseYn().equals(requestUseYn)) {
			isModify = true;
			updateMvPplVO.setUseYn(mvPplVO.getUseYn());
		}
		if(isModify) {
			return mvPplDAO.updateOneMvPplByMvPplId(updateMvPplVO) > 0;
		}
		else {
			throw new ApiException("400", "변경된 정보가 없습니다.");
		}
	}

	@Override
	public boolean deleteOneMvPplByMvPplId(String mvPplId) {
		return mvPplDAO.deleteOneMvPplByMvPplId(mvPplId) > 0;
	}

	@Override
	public boolean deleteMvPplBySelectedMvPplId(List<String> mvPplIdList) {
		
		int deleteCount = mvPplDAO.deleteMvPplBySelectedMvPplId(mvPplIdList);
		boolean isSuccess = deleteCount == mvPplIdList.size();
		if(isSuccess) {
			throw new ApiException("500", "삭제에 실패했습니다. 요청건수:(" +
					mvPplIdList.size() + "건), 삭제건수:("+ deleteCount + "건)");
		}
		
		return isSuccess;
	}

}
