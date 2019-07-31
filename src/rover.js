function rover(instructions) {
    coordinate = { x: 0, y: 0, direction: 'N' };
    for (var index = 0; index < instructions.length; index++) {
        switch (instructions[index]) {
            case 'M':
                coordinate.y = coordinate.y + 1;
                break;
            case 'L':
                coordinate.direction = 'W';
                break;
            case 'R':
                coordinate.direction = 'E';
                break;
            default:
                break;
        }
    }
    return coordinate.x + ':' + coordinate.y + ':' + coordinate.direction;
}