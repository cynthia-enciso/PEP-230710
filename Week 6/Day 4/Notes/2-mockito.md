# Mockito
- mocking framework used for unit tests
- uses annotations to identify its functionality, similar to JUnit
- mock: replacement object - behavior is stubbed unless we request real behavior
- spy: replacement object - behavior is real unless we request it is stubbed
- from the docs: "Real spies should be used carefully and occasionally, for example when dealing with legacy code."
- stub: replacement behavior

--- 

# Creating Mocks
- @InjectMocks is used on the object being tested to specify what to inject with a mock
- @Mock to specify what should be mocked
- MockitoAnnotations.openMocks() is used to perform the injection
- Mockito will use any constructors available in the real object for injection, otherwise it will try using setters, and then finally it will try using fields

---

# Stubbing
- when() is used to target an invocation
- thenReturn() or thenThrow() is used to return dummy results / throw exceptions
- if a mock's method isn't stubbed, it will return default values (null, empty collection, 0, false, etc)
- doThrow(), doAnswer(), doNothing(), doCallRealMethod() are used with void methods (https://www.baeldung.com/mockito-void-methods)

---

# Verify
- a mock will remember all method invocations on it for verification
- times(x) is used to verify a behavior was invoked x many times
- never() is used to verify a behavior was not invoked
- atMostOnce(), at LeastOnce(), atMost(x), atLeast(x)

