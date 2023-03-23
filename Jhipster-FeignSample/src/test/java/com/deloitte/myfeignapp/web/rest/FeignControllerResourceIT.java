package com.deloitte.myfeignapp.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.deloitte.myfeignapp.IntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * Test class for the FeignControllerResource REST controller.
 *
 * @see FeignControllerResource
 */
@IntegrationTest
class FeignControllerResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        FeignControllerResource feignControllerResource = new FeignControllerResource();
        restMockMvc = MockMvcBuilders.standaloneSetup(feignControllerResource).build();
    }

    /**
     * Test getMessage
     */
    @Test
    void testGetMessage() throws Exception {
        restMockMvc.perform(get("/api/feign-controller/get-message")).andExpect(status().isOk());
    }
}
