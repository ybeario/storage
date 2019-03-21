package com.cqupt.eepm.storage.web;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.sql.rowset.serial.SerialException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cqupt.eepm.storage.service.StorageService;

/**
 * @author ：Y.Bear
 * @date ：Created in 2019/3/12 14:27 @description：
 * @modified By：
 * @version: $
 */
@RestController
public class StorageController {
	@Autowired
	private StorageService service;

	@PostMapping("/upload")
	public String upload(MultipartFile evidence, String blocknumber, String secretKey)
			throws IOException, SerialException, SQLException {
		System.out.println("blocknumber:" + blocknumber + "    secretKey:" + secretKey);
		if (evidence == null || blocknumber.isEmpty() || secretKey.isEmpty()) {
			return "失败";
		}
		Integer id = 001;
		try {
			service.uploadEvidence(evidence, secretKey, id, blocknumber);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return "成功";
	}
}
