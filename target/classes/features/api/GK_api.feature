Feature: Technical Test

  @testing1
  Scenario Outline: Api assessment
    Given I get a request  "<EndPoint>" "<City>" "<ApiId>"
    Then I Assert the response "<StatusCode>" "<Results>"




    Examples:
      | EndPoint                                   | City       | ApiId                            | StatusCode | Results    |
      | api.openweathermap.org/data/2.5/weather?q= | Newtonhill | c58d16a110dd4e338a559e0bde400c66 | 200        | Newtonhill |
