module.exports = function(config) {
  config.set({
    frameworks: ['jasmine'],
    files: [
      'src/**/*.js', // ... le code source
      'test/**/*.js' // ... et les tests unitaires
    ],
    exclude: [],
    reporters: ['progress'], // karma affichera les résultats des tests dans la console
    browsers: ['PhantomJS'],
    plugins: [
      'karma-jasmine',
      'karma-phantomjs-launcher'
    ],
    singleRun: true,
    port: 9876
  })
};
