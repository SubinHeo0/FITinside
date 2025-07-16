package com.team2.fitinside.coupon.dto;

import com.team2.fitinside.coupon.entity.CouponType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CouponCreateRequestDto {

    private String name;
    private CouponType type;
    private int value;
    private int percentage;
    private int minValue;
    private LocalDate expiredAt;
    private Long categoryId;
}
