package com.iniesta.cachui.infra;

import com.iniesta.cachui.domain.CacheConf;
import redis.clients.jedis.Jedis;

public class JedisCacheManager implements CacheManager{

    private final CacheConf conf;
    private final Jedis jedis;

    public JedisCacheManager(CacheConf conf){
        this.conf = conf;
        jedis = new Jedis(conf.getHost(), conf.getPort(), conf.isSsl());
    }

    public void initialize(){

    }

    @Override
    public void execute(String command){
        String s = jedis.get(command);
        System.out.println(s);
    }


}
