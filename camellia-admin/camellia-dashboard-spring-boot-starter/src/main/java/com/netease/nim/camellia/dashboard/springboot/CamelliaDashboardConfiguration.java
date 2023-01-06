package com.netease.nim.camellia.dashboard.springboot;


import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 *
 * Created by caojiajun on 2018/11/13.
 */
@ConfigurationProperties(prefix = "camellia-dashboard")
public class CamelliaDashboardConfiguration {

    private int localCacheExpireSeconds = 5;

    private int statsExpireSeconds = 180;

    private int statsKeyExpireHours = 6;

    private int daoCacheExpireSeconds = 86400;



    public int getLocalCacheExpireSeconds() {
        return localCacheExpireSeconds;
    }

    public void setLocalCacheExpireSeconds(int localCacheExpireSeconds) {
        this.localCacheExpireSeconds = localCacheExpireSeconds;
    }

    public int getStatsExpireSeconds() {
        return statsExpireSeconds;
    }

    public void setStatsExpireSeconds(int statsExpireSeconds) {
        this.statsExpireSeconds = statsExpireSeconds;
    }

    public int getStatsKeyExpireHours() {
        return statsKeyExpireHours;
    }

    public void setStatsKeyExpireHours(int statsKeyExpireHours) {
        this.statsKeyExpireHours = statsKeyExpireHours;
    }

    public int getDaoCacheExpireSeconds() {
        return daoCacheExpireSeconds;
    }

    public void setDaoCacheExpireSeconds(int daoCacheExpireSeconds) {
        this.daoCacheExpireSeconds = daoCacheExpireSeconds;
    }
}
