package org.zerock.controller;

import java.io.File;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class UploadController {

	@GetMapping("/uploadForm")
	public void uploadForm() {
		log.info("upload form............");
	}
	
	
	@PostMapping("/uploadFormAction")
	public void uploadFormPost(MultipartFile uploadFile, Model model) {
		log.info("file Name: " + uploadFile.getOriginalFilename());
		log.info("file Size : " + uploadFile.getSize());
		
		String uploadFolder = "C:\\upload\\temp";
		File saveFile = new File(uploadFolder, uploadFile.getOriginalFilename());
		try {
			uploadFile.transferTo(saveFile);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
