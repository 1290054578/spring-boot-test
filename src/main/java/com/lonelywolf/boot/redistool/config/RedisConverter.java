package com.lonelywolf.boot.redistool.config;


import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/***
 * [自定义序列化器和反序列化器]
 * @author xiangyong.zeng
 * @param null
 * @return 
 * @date 2019-07-24 16:33
 */
public class RedisConverter implements RedisSerializer<Object> {

    /**
     * 序列化器
     */
    private Converter<Object, byte[]> serializer = new SerializingConverter();
    /**
     * 反序列化器
     */
    private Converter<byte[], Object> deserializer = new DeserializingConverter();

    /**
     * [将对象序列化成字节数组]
     * @author xiangyong.zeng
     * @param o
     * @return byte[]
     * @date 2019-07-24 16:34
     */
    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if (o == null) {
            return new byte[0];
        }else{
            try {
                return serializer.convert(o);
            } catch (Exception e) {
                e.printStackTrace();
                return new byte[0];
            }
        }
    }

    /**
     * [将字节数组反序列化成对象]
     * @author xiangyong.zeng
     * @param bytes
     * @return java.lang.Object
     * @date 2019-07-24 16:35
     */
    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {//
        if (bytes == null || bytes.length == 0) {
            return null;
        }else{
            try {
                return deserializer.convert(bytes);
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
    }
}