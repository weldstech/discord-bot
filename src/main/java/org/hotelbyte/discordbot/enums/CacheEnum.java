package org.hotelbyte.discordbot.enums;

import lombok.Getter;

@Getter
public enum CacheEnum {

    CRYPTO_COMPARE(-1, 3600, -1),
    STOCKS_EXCHANGE,//Never clean, used when stocks fails
    OPEN_ETHEREUM_POOL(-1, 900, -1),
    SCRAP_SERVICE(-1, 900, -1),
    STOCKS_EXCHANGE_NEAR(-1, 120, -1);//Update stocks value

    public static final String STOCKS_EXCHANGE_CACHE = "STOCKS_EXCHANGE";
    public static final String STOCKS_EXCHANGE_NEAR_CACHE = "STOCKS_EXCHANGE_NEAR";
    public static final String OPEN_ETHEREUM_POOL_CACHE = "OPEN_ETHEREUM_POOL";
    public static final String SCRAP_SERVICE_CACHE = "SCRAP_SERVICE";
    public static final String CRYPTO_COMPARE_CACHE = "CRYPTO_COMPARE";

    private long readExpiration = -1;// By default without expiration
    private long writeExpiration = -1;// By default without expiration
    private long limit = -1;// By default without expiration

    CacheEnum() {

    }

    CacheEnum(long readExpiration, long writeExpiration, long limit) {
        this.readExpiration = readExpiration;
        this.writeExpiration = writeExpiration;
        this.limit = limit;
    }
}
