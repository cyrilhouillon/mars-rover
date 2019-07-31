// déclaration d'une suite de tests
describe("Arithmetic tests", function() {
  // avant chaque test
  beforeEach(function() {
    // whatever
  });

  // définition d'un test
  it("should init rover position", function() {
    expect(rover("")).toEqual("0:0:N");
  });
});
