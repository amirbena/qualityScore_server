package com.example.server.externalResponses;

import java.io.Serializable;

class PaginationLinks implements Serializable{
    private Link previous;
    private Link next;

    public PaginationLinks(Link previous, Link next) {
        this.previous = previous;
        this.next = next;
    }

    public Link getPrevious() {
        return previous;
    }

    public Link getNext() {
        return next;
    }
}
public class Pagination implements Serializable {
    private int count_per_page;
    private int total_count;
    private int current_page;
    private int total_pages;
    private PaginationLinks _links;

    public Pagination(int count_per_page, int total_count, int current_page, int total_pages, PaginationLinks _links) {
        this.count_per_page = count_per_page;
        this.total_count = total_count;
        this.current_page = current_page;
        this.total_pages = total_pages;
        this._links = _links;
    }

    public int getCount_per_page() {
        return count_per_page;
    }

    public int getTotal_count() {
        return total_count;
    }

    public int getCurrent_page() {
        return current_page;
    }

    public int getTotal_pages() {
        return total_pages;
    }

    public PaginationLinks get_links() {
        return _links;
    }
}
