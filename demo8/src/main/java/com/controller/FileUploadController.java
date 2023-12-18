package com.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {

	@RequestMapping(value = "/form")
	public String uploadForm() {
		return "form";
	}
	
	@RequestMapping(value = "/fileUpload", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
	public String upload(MultipartFile file,HttpServletRequest request) throws IOException {
		System.out.println(file.getOriginalFilename());
		file.transferTo(new File(request.getServletContext().getRealPath("/upload")+"/"+file.getOriginalFilename()));
		request.setAttribute("message", "文件上传成功，文件名："+file.getOriginalFilename());
		return "success";
	}
}
