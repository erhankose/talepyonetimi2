package com.erhankose.talep_yonetimi.util;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public class TPage<T> {
    private int number;
    private int size;
    private Sort sort;
    private int toplamSayfa;
    private Long toplamKayit;
    private List<T> icerik;

    public void setStat(Page page, List<T> list) {

        this.number = page.getNumber();
        this.size = page.getSize();
        this.sort = page.getSort();
        this.toplamKayit = page.getTotalElements();
        this.toplamSayfa = page.getTotalPages();
        this.icerik = list;

    }

}