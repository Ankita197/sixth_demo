package com.ankita.sixthtask.repository;

import com.ankita.sixthtask.model.CreateResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIInterface {

    @GET("/api/v1/search_by_date?")
    Call<CreateResponse> doGetListResour( @Query("tags") String story,@Query("page") int page);
}
