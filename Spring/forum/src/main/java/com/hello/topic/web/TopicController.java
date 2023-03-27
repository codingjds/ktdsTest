package com.hello.topic.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.hello.common.handler.DownloadUtil;
import com.hello.common.handler.UploadHandler;
import com.hello.member.web.MemberController;
import com.hello.topic.service.TopicService;
import com.hello.topic.vo.TopicVO;

@Controller
public class TopicController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Autowired
	private TopicService topicService;
	
	@Autowired
	private UploadHandler uploadHandler;	//Component화 되있기 때문에 가능
	
	@Value("")
	private String uploadPath;


	@GetMapping("/topics")
	public String viewTopicListPage(Model model) {
		List<TopicVO> topicList = topicService.readAllTopics();
		model.addAttribute("topicList", topicList);
		return "topic/list";
	}
	
	@GetMapping("/topic/{topicId}")
	public String viewTopicDetailPage(@PathVariable int topicId, Model model) {
//		System.out.println("URL 변수 topicId의 값: " + topicId);
		logger.info("URL 변수 topicId의 값: {}", topicId);
		
		Integer.parseInt("ABC");
		
		TopicVO topic = topicService.readOneTopicByTopicId(topicId);
		model.addAttribute("topic", topic);
		
		return "topic/detail";
	}
	
	@GetMapping("/topic/write")
	public String viewTopicWritePage() {
		return "topic/write";
	}
	
	@PostMapping("/topic/write")
	public String doTopicWrite(TopicVO topicVO, List<MultipartFile> uploadFile) {
		
		
//		// 파일 업로드 처리
//		// 파일 업로드 했는지 확인
//		if(uploadFile != null && !uploadFile.isEmpty()) {
//			
//			// 난수파일명 생성
//			// UUID = 현재시간(MilliSeconds)을 기반으로 난수를 생성한다
//			// 중복이 절대 발생하지 않는다.
//			String uuidFileName = UUID.randomUUID().toString();
//			// 진짜 파일명 가져오기
//			String oringinFileName = uploadFile.getOriginalFilename();
//			// 파일이 저장될 위치 가져오기
//			File uploadPath = new File("C:\\spring-app\\upload-files");
//			// 폴더가 존재하는 지 확인
//			if(!uploadPath.exists()) {
//				// 폴더가 없다면 생성한다.
//				uploadPath.mkdirs();
//			}
//			// 업로드 파일명을 randomFileName 으로 변경한다
//			File randomNameFile = new File(uploadPath, uuidFileName);
//			
//			// uploadPath에 업로드된 파일을 이동시키기
//			try {
//				uploadFile.transferTo(randomNameFile);
//			} catch (IllegalStateException | IOException e) {
//				throw new RuntimeException("파일을 업로드 할 수 없습니다!");
//			}
//			// topicVO에 업로드된 파일을 이동시키기
//			topicVO.setFileName(uuidFileName); // 난수화된 파일의 이름
//			topicVO.setOriginFileName(oringinFileName); // 업로드된 실제 파일의 이름
//		}
		
		boolean createResult = topicService.createNewTopic(topicVO);

		uploadHandler.upload(uploadFile, topicVO.getId());
		
		if(!createResult) {
			return "topic/write";
		}
		return "redirect:/topic/" + topicVO.getId();
	}
	
	@GetMapping("/topic/delete/{topicId}")
	public String doTopicDelete(@PathVariable int topicId) {
		boolean deleteResult = topicService.deleteOneTopicById(topicId);
		if(deleteResult) {
			return "redirect:/topics";
		}
		return "redirect:/topic/" + topicId;
	}
	
	@GetMapping("/topic/update/{topicId}")
	public String viewTopicUpdatePage(@PathVariable int topicId, Model model) {
		TopicVO topic = topicService.readOneTopicByTopicId(topicId);
		model.addAttribute("topic", topic);
		return "topic/update";
	}
	
	@PostMapping("/topic/update/{topicId}")
	public String doTopicUpdate(@PathVariable int topicId, TopicVO topicVO) {
		topicVO.setId(topicId);
		boolean updateResult =topicService.updateOneTopic(topicVO);
		
		if(updateResult) {
			return "redirect:/topic/" + topicId;
		}
		return "redirect:/topics";
	}
	
	@GetMapping("/topic/download/{topicId}")
	public void downloadFile(@PathVariable int topicId
							 , HttpServletRequest request
							 , HttpServletResponse response) {
		
		TopicVO topic = topicService.readOneTopicByTopicId(topicId);
		
		new DownloadUtil(response, request, this.uploadPath + "/" + topic.getFileName()).download(topic.getOriginFileName());
		
	}
	
}















