package com.example.server.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Pagination {
    private static final String COUNT_PER_PAGE="countPerPage";
    private static final String CURRENT_PAGE="currentPage";
    private static final String TOTAL_COUNT="totalCount";
    private static final String TOTAL_PAGES="totalPages";


    private int countPerPage;
    private int totalCount;
    private int currentPage;
    private int totalPages;

    public Pagination(@JsonProperty(COUNT_PER_PAGE) int countPerPage,
                      @JsonProperty(TOTAL_COUNT) int totalCount,
                      @JsonProperty(CURRENT_PAGE) int currentPage,
                      @JsonProperty(TOTAL_PAGES) int totalPages) {
        this.countPerPage = countPerPage;
        this.totalCount = totalCount;
        this.currentPage = currentPage;
        this.totalPages = totalPages;
    }

    public int getCountPerPage() {
        return countPerPage;
    }

    public void setCountPerPage(int countPerPage) {
        this.countPerPage = countPerPage;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}
