Earning extra points from Frequent Flyer status

Meta:
@issue FF-123
@tags component:payments
@web @slow

Scenario: Earning extra points on flights by Frequent Flyer status
Given I am a <status> member
When I fly on a flight that is worth <base> base points
Then I should earn a status bonus of <bonus>
And I should have guaranteed minimum earned points per trip of <minimum>
And I should earn <total> points in all
Examples:
  | status   | base | bonus | minimum | total | notes
  | Standard | 439  | 0     | 0       | 439   |
  | Silver   | 439  | 220   | 500     | 659   | minimum points
  | Silver   | 148  | 111   | 500     | 500   | 50% bonus
  | Gold     | 474  | 400   | 1000    | 1000  | minimum points
  | Gold     | 2041 | 1531  | 1000    | 3572  | 75% bonus

Scenario: Check status
Given I am a Gold member
When I fly from A to B  on 01/01/2013 at 09:00
Then I should earn a status bonus of 100


