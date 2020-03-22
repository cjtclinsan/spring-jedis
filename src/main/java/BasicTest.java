package datatype;

import redis.clients.jedis.Jedis;

public class BasicTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("127.0.0.1", 7292);
        jedis.set("tc", "6666");
        System.out.println(jedis.get("tc"));
        jedis.close();
    }
}
