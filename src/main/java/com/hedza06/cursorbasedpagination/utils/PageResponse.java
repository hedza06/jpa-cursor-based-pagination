package com.hedza06.cursorbasedpagination.utils;

public record PageResponse<T>(
        T content,
        String previousPageCursor,
        String nextPageCursor
) { }
