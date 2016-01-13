 package {};

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 *
 * Created by rod on 12/16/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GitHubServiceApplication.class)
@WebIntegrationTest("server.port:8080")
public class GitServiceControllerTests {

  private static final int PORT = 8080;

// Parameterize tests like this
    private static final String AN_APP_PATH = "http://localhost:" + PORT + "/path";
 
// Use this to run tests
    private RestTemplate restTemplate = new RestTemplate();



    @Test public void sampleTest() {
        // Use RestTemplate to hit chosen URLs
    }
    
  }
