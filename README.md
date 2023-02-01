# Wiremock-example

An opportunity to talk about Microservice Testing

Topics:

- Definition of Done

**Functional Testing:**

- Types of tests
- Unit Tests
- Integration Tests
- Slice Testings
- Mocking
- Test naming convention
- Test structure: Given / When / Then
- Profiles
- Test coverage
- Mutation Testing
- Performance Testing

**Non functional testing:**

- Thread safety
- Memory Leaks
- Scaffolding

## How to run in local

```bash
mvn clean spring-boot:run
curl http://localhost:8080/gods/greek  
```

![](docs/ms.png)

## References

- https://martinfowler.com/articles/microservice-testing/
- https://maven.apache.org/surefire/maven-surefire-plugin/
- https://maven.apache.org/surefire/maven-failsafe-plugin/
- https://wiremock.org/
- https://dzone.com/articles/7-popular-unit-test-naming
- https://martinfowler.com/bliki/GivenWhenThen.html
- https://www.archunit.org/
- https://medium.com/@tasdikrahman/f-i-r-s-t-principles-of-testing-1a497acda8d6
- The Right Bicep
- https://github.com/jabrena/pyramid-of-testing
