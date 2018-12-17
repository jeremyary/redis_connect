package org.redhat.solneng.jary.redis_connect;

import io.lettuce.core.ClientOptions;
import io.lettuce.core.RedisClient;
import io.lettuce.core.RedisURI;
import io.lettuce.core.SslOptions;
import io.lettuce.core.api.StatefulRedisConnection;
import io.lettuce.core.api.sync.RedisStringCommands;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class APIController {

    @RequestMapping("/bdbs")
    public String bdbs() {
        return "true";
    }

    @RequestMapping("/connect")
    public String connect() {

        RedisURI redisURI = RedisURI.builder()
                .withHost("redis-ent-cluster-0.redis-ent-cluster.redis-ent-cluster.svc.clus")
                .withPort(30050)
                .withSsl(true)
//                .withVerifyPeer(false)
                .build();

        RedisClient client = RedisClient.create(redisURI);
        StatefulRedisConnection<String, String> connection = client.connect();

        RedisStringCommands sync = connection.sync();

        Random rand = new Random();
        String inputValue = "bar_" + rand.nextInt(1000);

        sync.set("foo", inputValue);
        String fetchedValue = (String) sync.get("foo");

//        client.shutdown();
        return "input val: " + inputValue + "<br/> store val: " + fetchedValue;
    }
}
