package com.hello.topic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.hello.common.handler.UploadHandler;
import com.hello.topic.dao.TopicDAO;
import com.hello.topic.vo.TopicVO;

@Service
public class TopicServiceImpl implements TopicService{
	
	@Autowired
	private TopicDAO topicDAO;
	
	@Autowired
	private UploadHandler uploadHandler;	//Component화 되있기 때문에 가능
	
	@Override
	public List<TopicVO> readAllTopics() {
		return topicDAO.readAllTopics();
	}

	@Override
	public TopicVO readOneTopicByTopicId(int id) {
		TopicVO topicVO = topicDAO.readOneTopicByTopicId(id);
		
		if(topicVO == null) {
			throw new RuntimeException("잘못된 접근입니다.");
		}
		
		return topicVO;
	}

	@Override
	public boolean createNewTopic(TopicVO topicVO, List<MultipartFile> uploadFile) {
		//출금
		boolean createResult = topicDAO.createNewTopic(topicVO) > 0;
		uploadHandler.upload(uploadFile, topicVO.getId());;	//Component화 되있기 때문에 가능
		return createResult;
	}

	@Override
	public boolean updateOneTopic(TopicVO topicVO) {
		return topicDAO.updateOneTopic(topicVO) > 0;
	}

	@Override
	public boolean deleteOneTopicById(int id) {
		return topicDAO.deleteOneTopicById(id) > 0;
	}
	
}
