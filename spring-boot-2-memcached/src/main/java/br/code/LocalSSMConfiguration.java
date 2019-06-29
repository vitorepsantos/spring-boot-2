package br.code;

import com.google.code.ssm.CacheFactory;
import com.google.code.ssm.config.AbstractSSMConfiguration;
import com.google.code.ssm.config.DefaultAddressProvider;
import com.google.code.ssm.providers.CacheConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalSSMConfiguration extends AbstractSSMConfiguration {

    @Bean
    public CacheFactory defaultMemcachedClient() {
        final CacheConfiguration conf = new CacheConfiguration();
        conf.setConsistentHashing(true);
        final CacheFactory cf = new CacheFactory();
        cf.setCacheClientFactory(new com.google.code.ssm.providers.xmemcached.MemcacheClientFactoryImpl());
        cf.setAddressProvider(new DefaultAddressProvider("172.17.0.2:11211"));
        cf.setConfiguration(conf);
        return cf;
    }

}
