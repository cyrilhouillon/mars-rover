// déclaration d'une suite de tests
describe("Arithmetic tests", function () {
  // avant chaque test
  beforeEach(function () {
    // whatever
  });

  // définition d'un test
  it("should init rover position", function () {
    expect(rover("")).toEqual("0:0:N");
  });

  // définition d'un test
  it("should move forward from initial position", function () {
    expect(rover("M")).toEqual("0:1:N");
  });

  // définition d'un test
  it("should move forward multiple time", function () {
    expect(rover("MMM")).toEqual("0:3:N");
  });

  // définition d'un test
  it("should rotate to left", function () {
    expect(rover("L")).toEqual("0:0:W");
    expect(rover("LL")).toEqual("0:0:S");
    expect(rover("LLL")).toEqual("0:0:E");
    expect(rover("LLLL")).toEqual("0:0:N");
  });

  // définition d'un test
  it("should rotate to right", function () {
    expect(rover("R")).toEqual("0:0:E");
    expect(rover("RR")).toEqual("0:0:S");
    expect(rover("RRR")).toEqual("0:0:W");
    expect(rover("RRRR")).toEqual("0:0:N");
  });

  // définition d'un test
  it("should move to west", function () {
    expect(rover("LM")).toEqual("-1:0:W");
  });

    // définition d'un test
    it("should move to east", function () {
      expect(rover("RM")).toEqual("1:0:E");
    });

});
