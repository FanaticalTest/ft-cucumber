# ft-cucumber

This libfrary allows to parse the cucumber tags and to handle them

## Run

### Start the build and run
```
./gradlew build
```

### Install in local repository
```
gradle install
```

## How to use the Library

Before handling the tag you need to get them using 
```
import cucumber.api.Scenario;
```
```
public Scenario scenario;

```

### Get the Id tags
```
Tags.getId(scenario.getSourceTagNames())
```

### Get the Feature tags
```
Tags.getFeature(scenario.getSourceTagNames())
```

### Get the Project tags
```
Tags.getProject(scenario.getSourceTagNames())
```

### Get the ProjectId tags
```
Tags.getProjectId(scenario.getSourceTagNames())
```

### Get the TestSuite tags (TestLink)
```
Tags.getTestSuite(scenario.getSourceTagNames())
```

### Get the any custom tags
```
Tags.getSpecificTag(scenario.getSourceTagNames(),"AnySpecificTag")
```