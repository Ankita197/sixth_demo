package com.ankita.sixthtask.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CreateResponse {

    @SerializedName("hits")
    public List<Datum> data = null;

    public class Datum {

        @SerializedName("created_at")
        public String  created_at;
        @SerializedName("title")
        public String title;
        @SerializedName("url")
        public String url;
        @SerializedName("author")
        public String authore;
        @SerializedName("points")
        public Integer point;
        @SerializedName("story_text")
        public String story_text;
        @SerializedName("comment_text")
        public String comment_text;
        @SerializedName("num_comments")
        public Integer no_of_comment ;
        @SerializedName("story_id")
        public Integer story_id;
        @SerializedName("story_title")
        public String story_title;
        @SerializedName("story_url")
        public String story_url;
        @SerializedName("parent_id")
        public Integer parent_id;
        @SerializedName("created_at_i")
        public Integer create_id;
        @SerializedName("_tags")
        public ArrayList<String> tagsArray;
        @SerializedName("objectID")
        public String objId;
        @SerializedName("_highlightResult")
        public Reasult reasult;
        public class Reasult{
            @SerializedName("title")
            public Author title;
            @SerializedName("value")
            public Author value;
            @SerializedName("author")
            public Author author;
            public  class Author{
                @SerializedName("value")
                public String value;
                @SerializedName("matchLevel")
                public String matchLevel;
                @SerializedName("matchedWords")
                public ArrayList<String> matvhWords;
            }
        }


    }
    @SerializedName("nbHits")
    public Integer nbHits;
    @SerializedName("page")
    public Integer perPage;
    @SerializedName("nbPages")
    public Integer nbPages;
    @SerializedName("hitsPerPage")
    public Integer hitsPerPage;
    @SerializedName("exhaustiveNbHits")
    public boolean exhaustiveNbHits;
    @SerializedName("query")
    public String query;
    @SerializedName("params")
    public String params;
    @SerializedName("processingTimeMS")
    public Integer processingTimeMS;
}
