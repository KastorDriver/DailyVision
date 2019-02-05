package one.kastordriver.dailyvision.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

public class DataControllerTest extends ControllerTest {

    @Test
    public void whenEyeCheckSavedSuccessfullyThenShouldReturn200() {

    }

    @Test
    public void name() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/do"))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}
