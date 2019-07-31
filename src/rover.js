function rover(instructions) {
    var coordinate = { x: 0, y: 0, direction: 'N' };
    for (var index = 0; index < instructions.length; index++) {
        const element = instructions[index];
        console.log(element);
        
        switch (element) {
            case 'L':
            
            break;

            case 'R':
                break;
            case 'M':
                coordinate.y = coordinate.y + 1;
                break;

            default:
                break;
        }

    } 
    return coordinate.x + ':' + coordinate.y + ':' + coordinate.direction;
}

