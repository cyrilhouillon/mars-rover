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

  // définition d'un test
  it("should move forward from initial position", function() {
    expect(rover("M")).toEqual("0:1:N");
  });

    // définition d'un test
    it("should rotate to West from initial position", function() {
      expect(rover("L")).toEqual("0:0:W");
    });

    // définition d'un test
    it("should rotate to east from initial position", function() {
      expect(rover("R")).toEqual("0:0:E");
    });
});
