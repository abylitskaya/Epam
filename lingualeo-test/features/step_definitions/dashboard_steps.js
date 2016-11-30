"use strict";

var DashboardPage = require("./pages/dashboard");
var HomePage = require("./pages/home");
var Angie = require("./user/angie");

module.exports = function() {
    var homePage = new HomePage();
    var dashboardPage = new DashboardPage();
    var user = new Angie();

    /* too slow step needs timeout more then default 5 sec */
    this.Given("I\'m logged in LinguaLeo", {timeout: 10000}, function() {
        return homePage.visit()
            .then(function() {
                return homePage.pressLoginButton();
            })
            .then(function() {
                return homePage.enterLogin(user.login);
            })
            .then(function() {
                return homePage.enterPassword(user.password);
            })
            .then(function() {
                return homePage.pressPopupLoginButton();
            });
    });
    this.Given("I\'m on the dashboard page", function() {
        return dashboardPage.visit().then(function () {
            return expect(browser.getCurrentUrl()).to.eventually.eql("https://lingualeo.com/ru/dashboard");
        });
    });

    //Then I should see Leo greeting "Привет, я Лео!"
    // this.Then('I should see Leo greeting "$greeting"', function(greeting){
    //     return expect(dashboardPage.getGreeting()).to.be.eventually.eql(greeting);
    // })
};
