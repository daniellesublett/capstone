package com.techstars.app.weather.aware;

import com.techstars.app.weather.aware.response.ReverseGeoCodeResponse;
import net.sf.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.Assert.assertFalse;

/**
 * Created by m805958 on 8/4/15.
 */
public class ReverseGeoCodeResponseTest {

    private ReverseGeoCodeResponse reverseGeoCodeResponse;

    @Before
    public void setUp() throws Exception {
        reverseGeoCodeResponse = new ReverseGeoCodeResponse();
    }

    // Return 200 from google geocode
    @Test
    public void googleApiResponseWorks() throws IOException, URISyntaxException {
        JSONObject object = reverseGeoCodeResponse.getGoogleMapsResponse();
        System.out.println(object);
        assertFalse(object.getJSONArray("results").isEmpty());
    }

    // Return expected city & state
}