package one.kastordriver.dailyvision.controller;

import one.kastordriver.dailyvision.controlller.StatisticsController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.restdocs.mockmvc.RestDocumentationResultHandler;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.restdocs.mockmvc.MockMvcRestDocumentation.document;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.preprocessResponse;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.prettyPrint;

/**
 * Created by Kastor on 7/2/2018.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(StatisticsController.class)
@AutoConfigureRestDocs("target/generated-snippets")
public class StatisticsControllerTest {

    protected RestDocumentationResultHandler documentation = document("{class-name}/{method-name}",
            preprocessResponse(prettyPrint())).document();

    @Autowired
    protected MockMvc mockMvc;

    @Test
    public void name() throws Exception {
        //todo
    }
}
