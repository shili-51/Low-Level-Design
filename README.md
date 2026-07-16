| Principle | One-line rule                     | Your example                                                               |
| --------- | --------------------------------- | -------------------------------------------------------------------------- |
| **S**     | One class, one responsibility     | Separate `NotificationService` and `EmailService`                          |
| **O**     | Extend, don't modify              | Add `SMSService` without changing `NotificationService`                    |
| **L**     | Child should behave like parent   | `Car` can replace `Vehicle`; `Bicycle` shouldn't pretend to have an engine |
| **I**     | Don't force unnecessary methods   | Split `Vehicle` and `Engine` interfaces                                    |
| **D**     | Depend on interfaces, not classes | `NotificationService` depends on `MessageService`                          |
