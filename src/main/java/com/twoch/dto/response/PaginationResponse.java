package com.twoch.dto.response;

import java.util.List;

public class PaginationResponse<T> {

    private List<T> content;

    private int pageNumber;

    private int pageSize;

    private long totalElements;

    private int totalPages;

    private boolean isLast;
}