package com.unimelb.swen30006.workshops;

import java.util.Date;

// Sample private file class to be replaced by your implementaiton
public class File {
    private Date createdDate;
    private String fileData;
    private String fileName;

    public File(String fileName, String fileData) {
        this.createdDate = new Date(); // 记录创建时间
        this.fileName = fileName;
        this.fileData = fileData;
    }

    public String content() {
        return fileData;
    }

    public int fileSize() {
        return fileData.length();
    }

    public String fileType() {
        if (fileName.endsWith(".pdf")) {
            return "pdf";
        } else if (fileName.endsWith(".docx")) {
            return "docx";
        } else {
            return "unknown";
        }
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFileData() {
        return fileData;
    }

    public void setFileData(String fileData) {
        this.fileData = fileData;
    }
}