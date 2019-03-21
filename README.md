# vue-enterprise-spring-boot
Extending the Vue-enterprise-boilerplate to Spring Boot



## What does this project do?
When looking for examples Enterprise complexity code for [Vue.js](https://vuejs.org/), After scouring the net, I did not see anything that fully encompasses an enterprise level complexity. A lot of enterprises use Java backends. So my intention is to create a deeper, more complex example as well as template that others can use. I plan to go as far as answering all the questions that I have and have not been able to find. We'll see where this adventure takes us.


## How to use this project?
Clone this repository<br>
`git clone https://github.com/cdelstad/vue-enterprise-spring-boot.git my-project`

Enter frontend folder<br>
`cd my-project/frontend`

Install frontend dependencies on the frontend folder. Make sure Yarn is installed: https://yarnpkg.com/lang/en/docs/install<br>
`yarn`

Install backend dependencies<br>
Inside the root (my-project) directory run this command:<br>
`mvn clean install`

To run the Spring Boot App:<br>
`mvn --projects backend spring-boot:run`

You can go to http://localhost:8088/ to see it running.

Once you have the backend running, you can run the app via webpack-dev-server. This will allow you to hot reload the app. You can run the frontend in a tool such as Visual Studio Code.  
To run separately, run the following command in the frontend folder:
`yarn dev`

It will run on http://localhost:8080/.


## Where to get more help if you need it?
* This project uses the [vue-enterprise-boilerplate](https://github.com/chrisvfritz/vue-enterprise-boilerplate). Chris has wonderful docs.
* I found this project very helpful, [spring-boot-vuejs](https://github.com/jonashackt/spring-boot-vuejs). There are also examples if you want to implement [Docker](https://www.docker.com/) and [Heroku](https://www.heroku.com/).
* [Vuejs](https://vuejs.org/)
* [Spring.io](https://spring.io/)


*NOTE:* For the most part, everything is running. I commented out the test steps in the frontend pom.xml because there is an issue with Jest not finding its files.

I will be building up the tasks/roadmap in the next few weeks on Trello. https://trello.com/b/Af15jApM/vue-enterprise-spring-boot

Thank you for stopping by!
