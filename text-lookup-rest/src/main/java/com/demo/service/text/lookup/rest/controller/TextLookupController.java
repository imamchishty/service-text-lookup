package com.demo.service.text.lookup.rest.controller;

import com.demo.service.text.lookup.exception.GlobalBusinessCodes;
import com.demo.service.text.lookup.model.Text;
import com.demo.service.text.lookup.rest.constant.ApiConstants;
import com.shedhack.exception.core.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * <pre>
 *     Text Controller
 * </pre>
 */
@RestController
public class TextLookupController {

    @Autowired
    private StringRedisTemplate template;

    /**
     * Attempts to return the 'String' value based on the key.
     * @param key primary key for the redis store
     * @return the value stored in redis
     * @throws BusinessException if the key is not found
     */
    @RequestMapping(path = ApiConstants.API_TEXT_LOOKUP, method = RequestMethod.GET)
    public Text lookupTextByKey(@PathVariable String key) {

        // Attempt to get the key from Redis
        String value = template.opsForValue().get(key);

        // No key, throw exception
        if( value == null || value.length() == 0) {

            throw BusinessException.builder("Unable to find key").withParam("key", key)
                    .generateId().withBusinessCode(GlobalBusinessCodes.TLS001)
                    .build();
        }

        return new Text(key, value);
    }

    @RequestMapping(path = ApiConstants.API_TEXT_ROOT, method = RequestMethod.POST)
    public Text storeKeyValue(@RequestBody Text text) {

        // Attempt to save the key/value combo
        template.opsForValue().set(text.getKey(), text.getValue());

        return text;
    }


}
