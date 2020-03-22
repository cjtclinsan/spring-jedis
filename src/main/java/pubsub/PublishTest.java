package pubsub;

import redis.clients.jedis.Jedis;

public class PublishTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 7291);
        jedis.publish("tc-123", "666");
        jedis.publish("tc-abc", "pengyuyan");
    }
}
