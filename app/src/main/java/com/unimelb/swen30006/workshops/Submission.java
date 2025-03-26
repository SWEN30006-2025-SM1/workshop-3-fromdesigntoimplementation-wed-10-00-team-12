package com.unimelb.swen30006.workshops;

public class Submission {
    private int attemptNum;
    private File[] files;
    private int numFiles;

    public Submission(int attemptNum, File[] files) {
        this.attemptNum = attemptNum;
        this.files = files;
        this.numFiles = files.length;
    }

    public File[] includedFiles() {
        return files;
    }

    public int getAttemptNum() {
        return attemptNum;
    }

    public void setAttemptNum(int attemptNum) {
        this.attemptNum = attemptNum;
    }

    public int getNumFiles() {
        return numFiles;
    }

    public void setFiles(File[] files) {
        this.files = files;
        this.numFiles = files.length;
    }
}
