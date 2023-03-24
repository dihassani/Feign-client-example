/*
package com.deloitte.myapp.web.rest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.deloitte.myapp.IntegrationTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

*/
/**
 * Test class for the SampleAppControllerResource REST controller.
 *
 * @see SampleAppControllerResource
 *//*

@IntegrationTest
class SampleAppControllerResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);

        SampleAppControllerResource sampleAppControllerResource = new SampleAppControllerResource();
        restMockMvc = MockMvcBuilders.standaloneSetup(sampleAppControllerResource).build();
    }

    */
/**
     * Test displayMessage
     *//*

    @Test
    void testDisplayMessage() throws Exception {
        restMockMvc.perform(get("/api/sample-app-controller/display-message")).andExpect(status().isOk());
    }
}
*/
