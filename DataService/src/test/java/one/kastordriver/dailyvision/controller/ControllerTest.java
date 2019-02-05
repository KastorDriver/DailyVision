package one.kastordriver.dailyvision.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import one.kastordriver.dailyvision.controlller.DataController;
import one.kastordriver.dailyvision.service.DataService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;

@RunWith(SpringRunner.class)
@WebMvcTest(DataController.class)
@AutoConfigureRestDocs("target/generated-snippets")
public abstract class ControllerTest {

    protected RestDocumentationResultHandler documentation = document("{class-name}/{method-name}",
            preprocessResponse(prettyPrint())).document();

    @Autowired
    protected MockMvc mockMvc;

    @Autowired
    protected ObjectMapper objectMapper;

    @MockBean
    protected DataService dataService;
}
