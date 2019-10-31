package com.chengw.common.models.vo;

/**
 * @author chengwei
 */
public interface GenericVO<T,D> {

    /**
     * do 转vo
     * @param t do
     * @return vo
     */
    D from(T t);

    /**
     *vo 转 do
     * @return do
     */
    T to();



}
