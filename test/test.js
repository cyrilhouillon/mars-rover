// déclaration d'une suite de tests
describe("Arithmetic tests", function () {
  // avant chaque test
  beforeEach(function () {
    // whatever
  });

  // définition d'un test
  it("should init rover position", function () {
    expect(rover("", 0, 0, "N")).toEqual("0:0:N");
  });

  // définition d'un test
  it("should move forward from initial position", function () {
    expect(rover("M", 0, 0, "N")).toEqual("0:1:N");
  });

  // définition d'un test
  it("should move forward multiple time", function () {
    expect(rover("MMM", 0, 0, "N")).toEqual("0:3:N");
  });

  // définition d'un test
  it("should rotate to left", function () {
    expect(rover("L", 0, 0, "N")).toEqual("0:0:W");
    expect(rover("LL", 0, 0, "N")).toEqual("0:0:S");
    expect(rover("LLL", 0, 0, "N")).toEqual("0:0:E");
    expect(rover("LLLL", 0, 0, "N")).toEqual("0:0:N");
  });

  // définition d'un test
  it("should rotate to right", function () {
    expect(rover("R", 0, 0, "N")).toEqual("0:0:E");
    expect(rover("RR", 0, 0, "N")).toEqual("0:0:S");
    expect(rover("RRR", 0, 0, "N")).toEqual("0:0:W");
    expect(rover("RRRR", 0, 0, "N")).toEqual("0:0:N");
  });

  // définition d'un test
  it("should move to west", function () {
    expect(rover("LM", 0, 0, "N")).toEqual("-1:0:W");
  });

  // définition d'un test
  it("should move to east", function () {
    expect(rover("RM", 0, 0, "N")).toEqual("1:0:E");
  });

  // définition d'un test
  it("should move to south", function () {
    expect(rover("LLM", 0, 0, "N")).toEqual("0:-1:S");
    expect(rover("RRM", 0, 0, "N")).toEqual("0:-1:S");
  });

  // définition d'un test
  it("should execute test acceptance", function () {
    expect(rover("MMRMM", 0, 0, "N")).toEqual("2:2:E");
  });

});
