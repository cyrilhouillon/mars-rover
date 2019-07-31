function rover(instructions) {
    coordinate = { x: 0, y: 0, direction: 'N' };
    for (var index = 0; index < instructions.length; index++) {
        switch (instructions[index]) {
            case 'M':
                coordinate.y = coordinate.y + 1;
                break;
            case 'L':
                rotateLeft();
                break;
            case 'R':
                if (coordinate.direction === 'E') {
                    coordinate.direction = 'S';
                } else {
                    coordinate.direction = 'E';
                }
                break;
            default:
                break;
        }
    }
    return coordinate.x + ':' + coordinate.y + ':' + coordinate.direction;

    function rotateLeft() {
        if (coordinate.direction === 'W') {
            coordinate.direction = 'S';
        }
        else if (coordinate.direction === 'S') {
            coordinate.direction = 'E';
        }
        else if (coordinate.direction === 'E') {
            coordinate.direction = 'N';
        }
        else {
            coordinate.direction = 'W';
        }
    }
}