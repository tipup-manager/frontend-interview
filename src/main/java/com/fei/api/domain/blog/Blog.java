package com.fei.api.domain.blog;


import com.fei.api.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Blog extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String userId;

    @Column
    private Long userNumberId;

    @Column
    private String title;

    @Lob
    @Column
    private String content;

    @Column
    private String userImg;

    @Column
    private String starCountInfo;

    @Column
    private int starCount;

    @Column
    private String isFree;

    @Column
    private int price;

    @Column
    private String badges;

    @Column
    private String category;

    @Column
    private String mainImg;

    @Builder
    public Blog(
        String userId,
        Long userNumberId,
        String title,
        String content,
        String userImg,
        int starCount,
        String starCountInfo,
        String isFree,
        int price,
        String badges,
        String category,
        String mainImg
    ) {
        this.userId = userId;
        this.userNumberId = userNumberId;
        this.userImg = userImg;
        this.title = title;
        this.content = content;
        this.starCount = starCount;
        this.starCountInfo = starCountInfo;
        this.isFree = isFree;
        this.price = price;
        this.badges = badges;
        this.category = category;
        this.mainImg = mainImg;
    }

    public Blog update(Blog blog) {
        this.title = blog.getTitle();
        this.content = blog.getContent();
        return this;
    }
}
