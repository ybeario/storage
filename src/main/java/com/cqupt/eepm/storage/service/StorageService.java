package com.cqupt.eepm.storage.service;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Date;

import javax.annotation.Resource;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import com.cqupt.eepm.storage.dao.storage;
import com.cqupt.eepm.storage.dao.storageWithBLOBs;
import com.cqupt.eepm.storage.dao.si.storageMapper;

/**
 * @author ：Y.Bear
 * @date ：Created in 2019/3/12 11:09 @description：
 * @modified By：
 * @version: $
 */
@Service
public class StorageService {
	@Resource
	storageMapper mapper;

	public storage uploadEvidence(MultipartFile evidence, String secretKey, Integer id, String blocknumber)
			throws NoSuchAlgorithmException, IOException, SerialException, SQLException {
		String hash = DigestUtils.md5DigestAsHex(evidence.getBytes());
		String folder = System.getProperty("user.dir") + System.getProperty("file.separator") + "evidences";
		String originalFilename = evidence.getOriginalFilename();
		File localFile = new File(folder, originalFilename);
		evidence.transferTo(localFile);
		storageWithBLOBs bloBs = new storageWithBLOBs();
		bloBs.setEvidence(originalFilename);
		bloBs.setSecretKey(secretKey);
		bloBs.setMd5(hash);
		bloBs.setUserid(id);
		bloBs.setBlocknumber(blocknumber);
		bloBs.setUploadtime(new Date());
		bloBs.setDirectory(folder + System.getProperty("file.separator") + originalFilename);
		mapper.insertSelective(bloBs);
		return bloBs;
	}
}
