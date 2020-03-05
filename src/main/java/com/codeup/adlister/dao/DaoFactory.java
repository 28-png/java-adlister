package com.codeup.adlister.dao;
import com.codeup.adlister.dao.Config;
public class DaoFactory {
    private static Ads adsDao;
    private static Config config;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao(config);
        }
        return adsDao;
    }
}
