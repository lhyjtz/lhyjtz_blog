package com.lcyjtz.dto;


import com.lcyjtz.entity.ArticleCategcry;
import com.lcyjtz.entity.ArticleType;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @autHor LHYJTZ
 * @data 2021年04月13日 17:07
 */
@Data
public class ArticleListDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer articleid;

    private String articletitle;

    private String category;

    private List<String> tags;

    private String articledata;

    private Boolean istop;

}
