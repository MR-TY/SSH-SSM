package com.ty.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ty.dao.DownloadMapper;
import com.ty.entity.DownLoad;

@Service
@Transactional
public class DownLoadService{
	
	@Autowired
	private DownloadMapper downloadMapper;
	public void saveFileToSQL(DownLoad download){
		downloadMapper.saveFile(download);
	}
	
	public List<DownLoad> findAllFiles(){
		return downloadMapper.findAllFile();
	}
	
	public DownLoad findDownloadById(int id) throws Exception{
		return downloadMapper.findOneFile(id);
	}

	public void updateDownload(DownLoad download) {
		downloadMapper.updateFile(download);
	}

	public List<DownLoad> findFilesByTil(String downloadTitle) throws Exception {
		return downloadMapper.findFileByLike("%"+downloadTitle+"%");
	}
	
	public String findDownPath(int id){
		
		return downloadMapper.findPathById(id);
	}

	public void deleteFileById(int id) throws Exception {
		deleteDeptByIds(new int[] { (Integer) id });
	}
	

	public void deleteDeptByIds(int... ids) throws Exception {
		downloadMapper.deleteFileById(ids);
	}
}
