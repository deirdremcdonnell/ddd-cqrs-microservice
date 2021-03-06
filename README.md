# cqrs-microservice

A sample microservice with CQRS and Event Sourcing architecture. Implemented in Java and Spring Boot.

## The Domain
For this sample application, we'll work in the cafe domain. Our focus will be on the concept of a **tab**, which tracks 
the visit of an individual or group to the cafe. When people arrive to the cafe and take a table, a tab is **opened**. 
They may then **order** drinks and food. **Drinks** are **served** immediately by the table staff, however **food** 
must be cooked by a chef. Once the chef has **prepared** the food, it can then be **served**.

During their time at the restaurant, visitors may **order** extra food or drinks. If they realize they ordered the wrong 
thing, they may **amend** the order - but not after the food and drink has been served to and accepted by them.

Finally, the visitors **close** the tab by paying what is owed, possibly with a tip for the serving staff. Upon closing 
a tab, it must be paid for in full. A tab with unserved items cannot be closed unless the items are either marked as 
served or cancelled first.

## Overview  
Start your server as an simple java application  

You can view the api documentation in swagger-ui by pointing to  
http://localhost:8080/  

## Demo

## Documentation
Links to some of the articles and documentation used to implement this project:

- Edument CQRS Tutorial http://cqrs.nu/Tutorial
- Implementing Domain-Driven Design, Vaughn Vernon.
- IDDD Samples https://github.com/VaughnVernon/IDDD_Samples
- Why do commands include the entity tabId when creating entities? https://github.com/gregoryyoung/m-r/issues/17
- Should Aggregates be Event Handlers https://stackoverflow.com/questions/26876757/should-aggregates-be-event-handlers
- CQRS + Event Sourcing – A Step by Step Overview, Daniel Whittaker http://danielwhittaker.me/2014/10/02/cqrs-step-step-guide-flow-typical-application/
- Aggregate Root – How to Build One for CQRS and Event Sourcing, Daniel Whittaker http://danielwhittaker.me/2014/11/15/aggregate-root-cqrs-event-sourcing/
- How To Validate Commands in a CQRS Application, Daniel Whittaker http://danielwhittaker.me/2016/04/20/how-to-validate-commands-in-a-cqrs-application/