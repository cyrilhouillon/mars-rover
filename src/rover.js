function rover(instructions) {
    coordinate = {x: 0, y:0, direction:"N"};
    if (instructions === 'M') {
        coordinate.y = coordinate.y + 1;
    }
    return coordinate.x + ':' + coordinate.y + ':' + coordinate.direction;
}