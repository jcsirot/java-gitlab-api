package org.gitlab.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Kohsuke Kawaguchi
 */
public class GitlabSimpleRepositoryFile {
    /*
  "file_name": "app/project.rb",
  "branch_name": "master"
     */
    @JsonProperty("file_name")
    private String fileName;

    @JsonProperty("branch_name")
    private String branchName;

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
