function rover(instructions) {
    coordinate = { x: 0, y: 0, direction: 'N' };
    for (var index = 0; index < instructions.length; index++) {
        switch (instructions[index]) {
            case 'M':
                if (coordinate.direction === 'W') { 
                    coordinate.x = coordinate.x - 1;
                } else if (coordinate.direction === 'E') { 
                    coordinate.x = coordinate.x + 1;
                } else {
                    coordinate.y = coordinate.y + 1;
                }
                break;
            case 'L':
                rotateLeft();
                break;
            case 'R':
                rotateRight();
                break;
            default:
                break;
        }
    }
    return coordinate.x + ':' + coordinate.y + ':' + coordinate.direction;

    function rotateRight() {
        if (coordinate.direction === 'E') {
            coordinate.direction = 'S';
        }
        else if (coordinate.direction === 'S') {
            coordinate.direction = 'W';
        }
        else if (coordinate.direction === 'W') {
            coordinate.direction = 'N';
        }
        else {
            coordinate.direction = 'E';
        }
    }

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