package one.kastordriver.dailyvision.controller;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.restdocs.headers.HeaderDocumentation;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.restdocs.headers.HeaderDocumentation.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class DataControllerTest extends ControllerTest {

    @Test
    public void whenEyeCheckSavedSuccessfullyThenShouldReturn200() throws Exception {
        mockMvc.perform(post("/measurements")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())

                .andDo(documentation.document(
                        requestHeaders(headerWithName("Content-Type").description("Format of transmitted data"))
                ));
    }
}
