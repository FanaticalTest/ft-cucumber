package com.fanaticaltest.ftcucumber;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class TagsTests {

    final String t = "@Project=DemoWebsite,@Feature=BookList,@Customer=Ziridis,@TestType=RestAssured,@Id=134,@TestSuite=TBD,@ProjectId=AS234";
    private final Logger logger = LoggerFactory.getLogger(TagsTests.class);


    @Test
    public void checkGetIdTag() throws MalformedURLException {
        List<String> list = Arrays.asList(t.split( ","));
        assertThat(Tags.getId(list), containsString("134"));
        logger.info(Tags.getId(list));
    }

    @Test
    public void checkGetFeatureTag() throws MalformedURLException {
        List<String> list = Arrays.asList(t.split( ","));
        assertThat(Tags.getFeature(list), containsString("BookList"));
        logger.info(Tags.getFeature(list));
    }

    @Test
    public void checkGetProjectTag() throws MalformedURLException {
        List<String> list = Arrays.asList(t.split( ","));
        assertThat(Tags.getProject(list), containsString("DemoWebsite"));
        logger.info(Tags.getProject(list));
    }

    @Test
    public void checkGetProjectIdTag() throws MalformedURLException {
        List<String> list = Arrays.asList(t.split( ","));
        assertThat(Tags.getProjectId(list), containsString("AS234"));
        logger.info(Tags.getProjectId(list));
    }

    @Test
    public void checkGettestSuiteTag() throws MalformedURLException {
        List<String> list = Arrays.asList(t.split( ","));
        assertThat(Tags.getTestSuite(list), containsString("TBD"));
        logger.info(Tags.getTestSuite(list));
    }
}
