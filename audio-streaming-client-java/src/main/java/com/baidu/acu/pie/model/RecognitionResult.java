// Copyright (C) 2018 Baidu Inc. All rights reserved.

package com.baidu.acu.pie.model;


import org.joda.time.LocalTime;

import lombok.Builder;
import lombok.Data;

/**
 * 一个RecognitionResult对象就代表了一次识别结果
 *  如果将 AsrConfig 中的 enableFlushData 设为 true，那么系统会将所有中间的转写结果都返回。
 *  如果设为 false，那么系统只会返回完整的单句识别结果。
 *
 * @author Cynric Shu (cynricshu@gmail.com)
 */
@Data
@Builder
public class RecognitionResult {
    /**
     * 句子的开始时间
     */
    private LocalTime startTime;
    /**
     * 句子的结束时间
     */
    private LocalTime endTime;
    /**
     * 识别结果
     */
    private String result;
    /**
     * 请求唯一标识，用于查错
     */
    private String serialNum;
    /**
     * 该值为 true 的时候，result 是一个完整的句子
     * 否则，result 只是中间结果
     */
    private boolean completed;
}
