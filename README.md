# mars-rover
Mars Rover Kata

The rover start at (0,0) and in the direction of N.
The rover receives a character array of commands : L,R and M.
Implement commands that move the rover (M).
Implement commands that turn the rover left/right (L,R).
Implement wrapping from one edge of the grid to another. (planets are spheres after all)
Implement obstacle detection before each move to a new square. If a given sequence of commands encounters an obstacle, the rover moves up to the last possible point and reports the obstacle by prefixing the response by "O:"

Example: The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands MMRMM and should return 2:2:E

To install:

npm init --force
npm install --save-dev karma
npm install --save-dev karma-jasmine
npm install --save-dev karma-phantomjs-launcher

To launch tests:

node node_modules/karma/bin/karma start
