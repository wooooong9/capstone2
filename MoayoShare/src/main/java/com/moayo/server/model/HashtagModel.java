package com.moayo.server.model;

/**
 * 해시태그에 들어가는 값 modeling.
 * '#'을 포함하지 않음.
 *
 * @author gilwoongkang
 */
public class HashtagModel {
    /**
     * 해시태그 정보.
     */
    private String co_hashtag;

    public HashtagModel(String co_hashtag) {
        this.co_hashtag = co_hashtag;
    }

    public HashtagModel() {
    }

    public void setCo_hashtag(String co_hashtag) {
        this.co_hashtag = co_hashtag;
    }

    public String getCo_hashtag() {
        return co_hashtag;
    }

    @Override
    public String toString() {
        return "HashtagModel{" +
                "co_hashtag='" + co_hashtag + '\'' +
                '}';
    }
}
