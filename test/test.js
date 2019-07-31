
// déclaration d'une suite de tests
describe("Mars Rover tests", function() {
  // avant chaque test
  beforeEach(function() {
    // whatever
  });

  // définition d'un test
  it("should return the coordinates", function() {
    expect(rover("")).toEqual("0:0:N");
  });
});
