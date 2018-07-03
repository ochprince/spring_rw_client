package com.colasoft.spider_rw_client.bean;


import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * </p>
 *  entity
 * </p>
 *
 * @Author       <strong>shilong.jiang</strong>
 * @CreateDate   2017/9/15
 * @UpdateUser   shilong.jiang
 * @UpdateDate   2017/9/15
 * @UpdateRemark [修改内容]
 * @Version 1.0
 * Copyright(c) 成都科来软件有限公司 2017/9/15
 */ 
public class SpiderBaseNew implements Serializable {
    private static final long serialVersionUID = 1L;
    private String spider_id;
    private String domain;
    private String website;
    private String description;
    private Date enabled_time;
    private Date last_time;
    private Integer is_enable;
    private Date next_start_time;
    private Date update_time;
    private String spider_config;
    private String server_host;
    private String server_ip;
    private Integer status;
    private Integer need_load;
    private Date disabled_time;
    private Date create_time;
    private Integer roundArticleCount = 0;
    private AtomicLong successCount = new AtomicLong(0);
    private AtomicLong errorCount = new AtomicLong(0);
    private Map<String, Integer> recycleTimes = new HashMap<String, Integer>(50);
    private long roundStart = 0;
    private long roundEnd = 0;
    private String IP_ADDR;
    private Float success_rate;
    private Integer today_count;

    public String getSpider_id() {
        return spider_id;
    }

    public void setSpider_id(String spider_id) {
        this.spider_id = spider_id;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getEnabled_time() {
        return enabled_time;
    }

    public void setEnabled_time(Date enabled_time) {
        this.enabled_time = enabled_time;
    }

    public Date getLast_time() {
        return last_time;
    }

    public void setLast_time(Date last_time) {
        this.last_time = last_time;
    }

    public Integer getIs_enable() {
        return is_enable;
    }

    public void setIs_enable(Integer is_enable) {
        this.is_enable = is_enable;
    }

    public Date getNext_start_time() {
        return next_start_time;
    }

    public void setNext_start_time(Date next_start_time) {
        this.next_start_time = next_start_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getSpider_config() {
        return spider_config;
    }

    public void setSpider_config(String spider_config) {
        this.spider_config = spider_config;
    }

    public String getServer_host() {
        return server_host;
    }

    public void setServer_host(String server_host) {
        this.server_host = server_host;
    }

    public String getServer_ip() {
        return server_ip;
    }

    public void setServer_ip(String server_ip) {
        this.server_ip = server_ip;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getNeed_load() {
        return need_load;
    }

    public void setNeed_load(Integer need_load) {
        this.need_load = need_load;
    }

    public Date getDisabled_time() {
        return disabled_time;
    }

    public void setDisabled_time(Date disabled_time) {
        this.disabled_time = disabled_time;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Integer getRoundArticleCount() {
        return roundArticleCount;
    }

    public void setRoundArticleCount(Integer roundArticleCount) {
        this.roundArticleCount = roundArticleCount;
    }

    public AtomicLong getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(AtomicLong successCount) {
        this.successCount = successCount;
    }

    public AtomicLong getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(AtomicLong errorCount) {
        this.errorCount = errorCount;
    }

    public Map<String, Integer> getRecycleTimes() {
        return recycleTimes;
    }

    public void setRecycleTimes(Map<String, Integer> recycleTimes) {
        this.recycleTimes = recycleTimes;
    }

    public long getRoundStart() {
        return roundStart;
    }

    public void setRoundStart(long roundStart) {
        this.roundStart = roundStart;
    }

    public long getRoundEnd() {
        return roundEnd;
    }

    public void setRoundEnd(long roundEnd) {
        this.roundEnd = roundEnd;
    }

    public String getIP_ADDR() {
        return IP_ADDR;
    }

    public void setIP_ADDR(String iP_ADDR) {
        IP_ADDR = iP_ADDR;
    }

    public Integer getToday_count() {
        return today_count;
    }

    public void setToday_count(Integer today_count) {
        this.today_count = today_count;
    }

    public Float getSuccess_rate() {
        return success_rate;
    }

    public void setSuccess_rate(Float success_rate) {
        this.success_rate = success_rate;
    }
}
