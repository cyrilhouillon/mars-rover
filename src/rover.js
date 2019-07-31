function rover(instructions, initialX, initialY, initialDirection) {
    coordinate = { x: initialX, y: initialY, direction: initialDirection };
    for (var index = 0; index < instructions.length; index++) {
        switch (instructions[index]) {
            case 'M':
                moveForward();
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

    function moveForward() {
        const MAX_Y = 100;

        if (coordinate.direction === 'W') {
            coordinate.x = coordinate.x - 1;
        }
        else if (coordinate.direction === 'E') {
            coordinate.x = coordinate.x + 1;
        }
        else if (coordinate.direction === 'S') {
            coordinate.y = coordinate.y - 1;
        }
        else if (coordinate.y === MAX_Y) {
            coordinate.y = -MAX_Y;
        }
        else {
            coordinate.y = coordinate.y + 1;
        }
    }

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