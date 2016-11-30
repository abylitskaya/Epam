var path = require("path");

exports.config = {
    allScriptsTimeout: 10000,

    specs: [
        path.join(__dirname, "features/**/*.feature")
    ],

    capabilities: {
        "browserName": "phantomjs",
        "phantomjs.binary.path": require('phantomjs').path,
        'phantomjs.cli.args': ['--ignore-ssl-errors=true', '--web-security=false']
    },

    seleniumAddress: "http://localhost:4444/wd/hub", 
    baseUrl: 'http://lingualeo.com',

    framework: 'custom',

    frameworkPath: require.resolve('protractor-cucumber-framework'),

    cucumberOpts: {
        format: "pretty",
        require: "features/step_definitions/**/*.js"
    },

    onPrepare: function () {
        browser.driver.manage().window().setSize(800, 600);
        browser.driver.manage().window().setPosition(0, 0);
    }
};
